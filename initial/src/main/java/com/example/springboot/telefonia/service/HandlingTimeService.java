package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.HandlingTime;
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
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;

import com.example.springboot.telefonia.repository.*;

import org.json.*;
import org.slf4j.LoggerFactory;

@Component
@Service
public class HandlingTimeService {

    org.slf4j.Logger logger = LoggerFactory.getLogger(HandlingTimeService.class); 

    @Autowired
    private HandlingRepository handlingRepository;

    public HandlingTimeService(){
        
    }

    /**
     * 
     * @throws Exception
     */
    public void sendHandlingTime() throws Exception {

        JSONArray response = new JSONArray(this.dummyHandling());

        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject handling = (JSONObject) response.get(i); 
            HandlingTime handlingTimeBody = new HandlingTime();
        
            handlingTimeBody.setStart_time(handling.get("start_time").toString());
            handlingTimeBody.setService_name(handling.get("service_name").toString());
       

            handlingTimeBody.setNum_calls_answered(Double.parseDouble(handling.get("num_calls_answered").toString()));       
            handlingTimeBody.setHandling_time(handling.get("handling_time").toString());
            handlingTimeBody.setAverage_handling_time(handling.get("average_handling_time").toString());
    
            handlingTimeBody.setTalk_time_in(handling.get("talk_time_in").toString());
            handlingTimeBody.setAverage_talk_time_in(handling.get("average_talk_time_in").toString());

            this.handlingRepository.save(handlingTimeBody);
        }
        

    }

    private String getHandlingTimeService(String fini, String ffin) throws Exception {
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

    private String dummyHandling(){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_answered\": 23.0,"+
        "		\"handling_time\": \"02:00:43\","+
        "		\"average_handling_time\": \"00:00:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:06.876263\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_answered\": 23.0,"+
        "		\"handling_time\": \"02:00:43\","+
        "		\"average_handling_time\": \"00:00:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:06.876263\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_answered\": 23.0,"+
        "		\"handling_time\": \"02:00:43\","+
        "		\"average_handling_time\": \"00:00:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:06.876263\""+
        "	},{"+
        "		\"start_time\": \"2020-08.12 11:56:21\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_answered\": 23.0,"+
        "		\"handling_time\": \"02:00:43\","+
        "		\"average_handling_time\": \"00:00:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:06.876263\""+
        "	}"+
        ""+
        "]";
            
        
    }

    
}
