package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.dto.CallsBody;
import com.example.springboot.telefonia.utils.Constantes;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot.telefonia.repository.CallsRepository;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import com.sun.net.httpserver.HttpContext;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;

import com.example.springboot.telefonia.repository.*;

import com.example.springboot.telefonia.Entity.LostCalls;

import org.json.*;
import org.slf4j.LoggerFactory;
@Component
@Service
public class LostCallsService {

    @Autowired
    private LostCallsRepository lostCallsRepository;
    
    public LostCallsService(){
        
    }

    org.slf4j.Logger logger = LoggerFactory.getLogger(LostCallsService.class); 

    public void sendLostCalls() throws Exception {

        JSONArray response = new JSONArray(this.dummyLostCalls());        
        
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject lostCalls = (JSONObject) response.get(i); 
            LostCalls lostCallsBody = new LostCalls();

            lostCallsBody.setStart_name(lostCalls.get("start_time").toString());
            lostCallsBody.setService_name(lostCalls.get("service_name").toString());
            lostCallsBody.setPhone_number(Double.parseDouble(lostCalls.get("phone_number").toString()));

            this.lostCallsRepository.save(lostCallsBody);

        }
        

    }

    private String getLostCallsFromContainer(String fini, String ffin) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> params = new HashMap<>();
        params.put("fIni", fini);
        params.put("fFin", ffin);

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL;

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        return template.exchange(
                url, HttpMethod.GET, requestEntity, String.class, params).getBody();
    }

    private String dummyLostCalls(){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"phone_number\": \"23334234234\""+
        "	}"+
        ""+
        "]";
            
        
    }
}