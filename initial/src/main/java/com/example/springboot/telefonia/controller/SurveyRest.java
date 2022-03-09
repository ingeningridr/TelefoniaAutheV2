package com.example.springboot.telefonia.controller;

import com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springboot.telefonia.service.SurveyService;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class SurveyRest {

    @Autowired
    private SurveyService surveyService;
  
    public SurveyRest(){
        this.surveyService = new SurveyService();
    }
    
    @PostMapping(value = "/survey")
    @ResponseBody
    public String sendSurveyRest(@RequestParam String token, @RequestParam String fini, @RequestParam String ffin) {
        try{
            
            return this.surveyService.sendSurveyTool(fini, ffin).toString();
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "FAIL";
    
    }

}
