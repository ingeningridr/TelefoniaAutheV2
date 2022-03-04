package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.dto.AuthenticateBody;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.springboot.telefonia.repository.AuthenticateRepository;
import com.example.springboot.telefonia.utils.JWebToken;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.json.*;

@Component
@Service
public class AuthenticateService  {

    @Autowired
    private AuthenticateRepository authenticateRepository;

    LocalDateTime ldt;
    JSONObject payload;

    public AuthenticateService(){
        this.ldt = LocalDateTime.now().plusDays(90);
        this.payload = new JSONObject("{\"sub\":\"1234\",\"aud\":[\"admin\"],"
                + "\"exp\":" + ldt.toEpochSecond(ZoneOffset.UTC) + "}");
    }

    org.slf4j.Logger logger = LoggerFactory.getLogger(AuthenticateService.class); 

    public String sendAuthenticate() throws Exception {        
        return new JWebToken(payload).toString();
        }

}