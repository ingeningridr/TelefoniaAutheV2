package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.dto.AuthenticateBody;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.telefonia.repository.AuthenticateRepository;
import com.example.springboot.telefonia.utils.Constantes;
import com.example.springboot.telefonia.utils.JWebToken;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.*;

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

        /**
     * 
     */
    public String authenticate(AuthenticateBody authenticateBody) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Key", authenticateBody.getKeyA());
        jsonObject.put("Token", authenticateBody.getToken());

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL_AUTHETICATE;

        HttpEntity<String> requestEntity = new HttpEntity<String>(jsonObject.toString(), headers);

        return template.postForObject(
                url, requestEntity, String.class);
    }

}