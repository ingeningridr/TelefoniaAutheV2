package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.*;

import com.example.springboot.telefonia.service.LostCallsService;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class LostCallsRest {

  @Autowired
  private LostCallsService lostCallsService;

  public LostCallsRest(){
      this.lostCallsService = new LostCallsService();
  }


    @PostMapping(value = "/lostCalls")
    public String sendLostCallsRest(@RequestParam String token, @RequestParam String fini, @RequestParam String ffin) {
        try{
            this.lostCallsService.sendLostCalls();
            return "OK";
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return "FAIL";
    
    }

}


