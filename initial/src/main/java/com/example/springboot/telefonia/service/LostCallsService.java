package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.dto.CallsBody;
import com.example.springboot.telefonia.utils.Constantes;
import com.example.springboot.telefonia.utils.DateAssaUtil;

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

    public JSONArray sendLostCalls(String fini, String ffin) throws Exception {

        JSONArray response = new JSONArray(this.dummyLostCalls(fini, ffin));        
        
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject lostCalls = (JSONObject) response.get(i); 
            LostCalls lostCallsBody = new LostCalls();

            lostCallsBody.setStart_name(lostCalls.get("start_time").toString()
            .replaceAll("ffinm", DateAssaUtil.dftest(ffin, -1))
            .replaceAll("ffin", ffin)
            .replaceAll("finim", DateAssaUtil.dftest(fini, 1))
            .replaceAll("fini", fini)
            );
            lostCallsBody.setService_name(lostCalls.get("service_name").toString());
            lostCallsBody.setPhone_number(Double.parseDouble(lostCalls.get("phone_number").toString()));
     
            lostCallsBody.setdIni(fini);
            lostCallsBody.setdFin(ffin);

            lostCallsBody.setService(lostCalls.get("service_name").toString());

            this.lostCallsRepository.save(lostCallsBody);

        }

        return response;
        

    }

    private String getLostCallsFromContainer(String fini, String ffin) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> params = new HashMap<>();
        params.put("fIni", fini);
        params.put("fFin", ffin);
        //params.put("servicio", "servicio");

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL_LOSTCALLS;

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        return template.exchange(
                url, HttpMethod.GET, requestEntity, String.class, params).getBody();
    }

    private String dummyLostCalls(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"23334254675\""+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"23334245682\""+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"phone_number\": \"22334234234\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"211334234234\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"21134234234\""+
        "	},{"+
        "		\"start_time\": \"ffinm\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"25334234234\""+
        "	},{"+
        "		\"start_time\": \"ffinm\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"ffinm\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"ffinm\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"24334234211\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"24334234211\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"phone_number\": \"23335234234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"phone_number\": \"23335234234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale5\","+
        "		\"phone_number\": \"22254234234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale6\","+
        "		\"phone_number\": \"22254234234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale7\","+
        "		\"phone_number\": \"25334234234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale8\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale9\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale10\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale11\","+
        "		\"phone_number\": \"25334884234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale12\","+
        "		\"phone_number\": \"25334884234\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale13\","+
        "		\"phone_number\": \"25334884234\""+
        "	}"+
        ""+
        "]";
            
        
    }
}