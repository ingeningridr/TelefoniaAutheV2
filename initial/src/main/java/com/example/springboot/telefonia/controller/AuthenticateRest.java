package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.dto.AuthenticateBody;
import com.example.springboot.telefonia.repository.QADRepository;
import com.example.springboot.telefonia.service.AuthenticateService;
import com.example.springboot.telefonia.repository.QADRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/report")
    public class AuthenticateRest {

        @Autowired
        private AuthenticateService authenticateService;
    
        public AuthenticateRest(){
            this.authenticateService = new AuthenticateService();
        }
    

            @PostMapping(value = "/authenticate")
            public String sendCallsRest(@RequestBody AuthenticateBody authenticate) {
                try{
                        
                    return this.authenticateService.authenticate(authenticate);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }

                return "FAIL";

        }
    }


