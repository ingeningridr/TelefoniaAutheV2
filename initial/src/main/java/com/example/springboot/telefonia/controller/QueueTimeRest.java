package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springboot.telefonia.service.QueueTimeService;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class QueueTimeRest {

    @Autowired
  private QueueTimeService queueTimeService;

  public QueueTimeRest(){
      this.queueTimeService = new QueueTimeService();
  }
    

    @PostMapping(value = "/queueTime")
    @ResponseBody
    public String sendQueueTimeRest(@RequestParam String token, @RequestParam String fini, @RequestParam String ffin) {
        try{
            this.queueTimeService.sendQueueTimeTool();
            return "OK";
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return "FAIL";
    }

}

