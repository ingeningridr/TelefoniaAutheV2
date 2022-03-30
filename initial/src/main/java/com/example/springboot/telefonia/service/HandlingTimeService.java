package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.HandlingTime;
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
    public JSONArray sendHandlingTime(String fini, String ffin) throws Exception {

        JSONArray response = new JSONArray(this.dummyHandling(fini, ffin));

        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject handling = (JSONObject) response.get(i); 
            HandlingTime handlingTimeBody = new HandlingTime();
        
            handlingTimeBody.setStart_time(handling.get("start_time").toString()
            .replaceAll("ffinm", DateAssaUtil.dftest(ffin, -1))
            .replaceAll("ffin", ffin)
            .replaceAll("finim", DateAssaUtil.dftest(fini, 1))
            .replaceAll("fini", fini)
            );
            handlingTimeBody.setService_name(handling.get("service_name").toString());
       

            handlingTimeBody.setNum_calls_answered(Double.parseDouble(handling.get("num_calls_answered").toString()));       
            handlingTimeBody.setHandling_time(handling.get("handling_time").toString());
            handlingTimeBody.setAverage_handling_time(handling.get("average_handling_time").toString());
    
            handlingTimeBody.setTalk_time_in(handling.get("talk_time_in").toString());
            handlingTimeBody.setAverage_talk_time_in(handling.get("average_talk_time_in").toString());

            handlingTimeBody.setdIni(fini);
            handlingTimeBody.setdFin(ffin);

            handlingTimeBody.setService(handling.get("service_name").toString());

            this.handlingRepository.save(handlingTimeBody);
        }

        return response;
        

    }

    private String getHandlingTimeService(String fini, String ffin) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> params = new HashMap<>();
        params.put("fIni", fini);
        params.put("fFin", ffin);
        //params.put("servicio", "servicio");

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL_HANDLINGTIME;

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        return template.exchange(
                url, HttpMethod.GET, requestEntity, String.class, params).getBody();
    }

    private String dummyHandling(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_answered\": 2.0,"+
        "		\"handling_time\": \"01:00:43\","+
        "		\"average_handling_time\": \"00:00:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:06.876263\""+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"num_calls_answered\": 21.0,"+
        "		\"handling_time\": \"05:00:43\","+
        "		\"average_handling_time\": \"00:00:09.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:00:09.876263\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"num_calls_answered\": 23.0,"+
        "		\"handling_time\": \"02:00:43\","+
        "		\"average_handling_time\": \"00:00:07.876263\","+
        "		\"talk_time_in\": \"00:10:00\","+
        "		\"average_talk_time_in\": \"00:00:07.876263\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"num_calls_answered\": 13.0,"+
        "		\"handling_time\": \"06:00:43\","+
        "		\"average_handling_time\": \"00:05:06.876263\","+
        "		\"talk_time_in\": \"00:00:00\","+
        "		\"average_talk_time_in\": \"00:05:06.876263\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale6\","+
        "		\"num_calls_answered\": 6.3,"+
        "		\"handling_time\": \"03:15:01\","+
        "		\"average_handling_time\": \"00:00:08.876263\","+
        "		\"talk_time_in\": \"02:00:00\","+
        "		\"average_talk_time_in\": \"02:01:06.876263\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale7\","+
        "		\"num_calls_answered\": 1.0,"+
        "		\"handling_time\": \"00:00:43\","+
        "		\"average_handling_time\": \"00:00:00.426263\","+
        "		\"talk_time_in\": \"00:00:43\","+
        "		\"average_talk_time_in\": \"00:00:00.0426263\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale8\","+
        "		\"num_calls_answered\": 3.0,"+
        "		\"handling_time\": \"04:00:43\","+
        "		\"average_handling_time\": \"00:05:06.876263\","+
        "		\"talk_time_in\": \"03:22:00\","+
        "		\"average_talk_time_in\": \"00:05:06.876263\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale9\","+
        "		\"num_calls_answered\": 7.0,"+
        "		\"handling_time\": \"08:00:43\","+
        "		\"average_handling_time\": \"00:09:06.876263\","+
        "		\"talk_time_in\": \"08:00:00\","+
        "		\"average_talk_time_in\": \"00:09:06.876263\""+
        "	},{"+
        "		\"start_time\": \"finim\","+
        "		\"service_name\": \"Entrante Yale10\","+
        "		\"num_calls_answered\": 3.0,"+
        "		\"handling_time\": \"04:00:43\","+
        "		\"average_handling_time\": \"00:05:06.876263\","+
        "		\"talk_time_in\": \"03:22:00\","+
        "		\"average_talk_time_in\": \"00:05:06.876263\""+
        "	}"+
        ""+
        "]";
            
        
    }

    
}
