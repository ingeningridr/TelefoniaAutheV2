package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.telefonia.service.CallsService;
import java.util.Date;

import com.example.springboot.telefonia.repository.CallsRepository;

@RestController
@RequestMapping(value = "/report")
public class CallsRest {

    @Autowired
    private CallsService callService;

    public CallsRest(){
        this.callService = new CallsService();
    }

    @PostMapping(value = "/calls")
    public String sendCallsRest(@RequestParam String token, @RequestParam String fini, @RequestParam String ffin) 
    {
        try{
            
            return this.callService.sendCalls(fini, ffin).toString();
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return "FAIL";
        
    }
}