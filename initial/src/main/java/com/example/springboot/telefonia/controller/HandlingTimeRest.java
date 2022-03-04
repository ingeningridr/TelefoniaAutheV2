package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.telefonia.service.HandlingTimeService;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class HandlingTimeRest {

    @Autowired
    private HandlingTimeService handling;

    public HandlingTimeRest(){
        this.handling = new HandlingTimeService();
    }

    @PostMapping(value = "/handlingTime")
    public String sendHandlingTimeRest(@RequestParam String token, @RequestParam String fini, @RequestParam String ffin) {
        try{
            this.handling.sendHandlingTime();
            return "OK";
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return "FAIL";
    }

}
