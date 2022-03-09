package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.Calls;
import com.example.springboot.telefonia.utils.Constantes;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot.telefonia.repository.CallsRepository;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import org.json.*;
import org.slf4j.LoggerFactory;

@Component
@Service
public class CallsService  {

    @Autowired
    private CallsRepository callsRepository;

    public CallsService(){

    }

    org.slf4j.Logger logger = LoggerFactory.getLogger(CallsService.class); 

    public JSONArray sendCalls(String fini, String ffin) throws Exception {

        JSONArray response = new JSONArray(this.dummyCalls(fini, ffin));
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject callsJ = (JSONObject) response.get(i); 
            Calls calls = new Calls();
            calls.setStart_time(callsJ.get("start_time").toString().replaceAll("fini", fini).replaceAll("ffin", ffin));
            calls.setService_name(callsJ.get("service_name").toString());
            calls.setdIni(fini);
            calls.setdFin(ffin);
            calls.setService(callsJ.get("service_name").toString());
            calls.setPhone_number(Double.parseDouble(callsJ.get("phone_number").toString())); 
            this.callsRepository.save(calls);
        }

        return response;
                    
    }

    public String getCallsFromContainer(String fini, String ffin) throws Exception {
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


    public String dummyCalls(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale1 Cliente\","+
        "		\"phone_number\": \"23334234212\""+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"23334234212\""+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"phone_number\": \"21134234234\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"phone_number\": \"21134234234\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"23334234216\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"23334234216\""+
        "	}"+
        ""+
        "]";
            
        
    }

}
