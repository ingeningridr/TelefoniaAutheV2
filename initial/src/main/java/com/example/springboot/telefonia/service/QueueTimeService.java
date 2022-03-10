package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.QueueTime;
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

import org.json.*;
import org.slf4j.LoggerFactory;

@Component
@Service
public class QueueTimeService {

    org.slf4j.Logger logger = LoggerFactory.getLogger(QueueTimeService.class);    
    @Autowired
    private QueueRepository queueRepository;

    public QueueTimeService(){
        
    }

    public JSONArray sendQueueTimeTool(String fini, String ffin) throws JSONException, Exception {

        JSONArray response = new JSONArray(this.dummyQueue(fini, ffin));        
        
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject quej = (JSONObject) response.get(i); 
            QueueTime queueTimeBody = new QueueTime();
            
            queueTimeBody.setStart_time(quej.get("start_time").toString()
            .replaceAll("ffinm", DateAssaUtil.dftest(ffin, -1))
            .replaceAll("ffin", ffin)
            .replaceAll("finim", DateAssaUtil.dftest(fini, 1))
            .replaceAll("fini", fini)
            );
            queueTimeBody.setService_name(quej.get("service_name").toString());
            
            queueTimeBody.setNum_calls_queued(Double.parseDouble(quej.get("num_calls_queued").toString()));
            
            queueTimeBody.setTotal_time_queued(quej.get("total_time_queued").toString());
            
            queueTimeBody.setAverage_time_queued(quej.get("average_time_queued").toString());
            
            queueTimeBody.setAbandonment_time_queued(quej.get("abandonment_time_queued").toString());
            
            queueTimeBody.setNum_calls_queued(Double.parseDouble(quej.get("num_calls_queued_abandoned").toString()));
            
            queueTimeBody.setAnswer_time_queued(quej.get("answer_time_queued").toString());
            
            queueTimeBody.setNum_calls_queued_answered(Double.parseDouble(quej.get("num_calls_queued_answered").toString()));

            queueTimeBody.setdIni(fini);
            queueTimeBody.setdFin(ffin);

            queueTimeBody.setService(quej.get("service_name").toString());

            this.queueRepository.save(queueTimeBody);
        }

        return response;
       
    }

    /**
     * 
     */
    private String getQueueTimeService(String fini, String ffin) throws Exception {
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

    /**
     * 
     * @return
     */
    private String dummyQueue(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale\","+
        "		\"num_calls_queued\": 1.0,"+
        "		\"total_time_queued\": \"02:00:43\","+
        "		\"average_time_queued\": \"00:00:0.876263\","+
        "		\"abandonment_time_queued\": \"00:00:00\","+
        "		\"num_calls_queued_abandoned\": 3.2,"+
        "		\"answer_time_queued\": \"00:06:66\","+
        "		\"num_calls_queued_answered\": 30"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"num_calls_queued\": 23.0,"+
        "		\"total_time_queued\": \"01:01:12\","+
        "		\"average_time_queued\": \"00:15:0.876263\","+
        "		\"abandonment_time_queued\": \"00:01:00\","+
        "		\"num_calls_queued_abandoned\": 0.0,"+
        "		\"answer_time_queued\": \"00:01:66\","+
        "		\"num_calls_queued_answered\": 20"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"num_calls_queued\": 23.0,"+
        "		\"total_time_queued\": \"06:00:00\","+
        "		\"average_time_queued\": \"00:10:00.876263\","+
        "		\"abandonment_time_queued\": \"00:00:00\","+
        "		\"num_calls_queued_abandoned\": 6.2,"+
        "		\"answer_time_queued\": \"00:05:66\","+
        "		\"num_calls_queued_answered\": 12"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"num_calls_queued\": 15.0,"+
        "		\"total_time_queued\": \"01:15:43\","+
        "		\"average_time_queued\": \"00:12:00.876263\","+
        "		\"abandonment_time_queued\": \"00:00:00\","+
        "		\"num_calls_queued_abandoned\": 9.2,"+
        "		\"answer_time_queued\": \"00:02:66\","+
        "		\"num_calls_queued_answered\": 34"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale5\","+
        "		\"num_calls_queued\": 3.0,"+
        "		\"total_time_queued\": \"05:15:43\","+
        "		\"average_time_queued\": \"00:05:05.876263\","+
        "		\"abandonment_time_queued\": \"00:00:00\","+
        "		\"num_calls_queued_abandoned\": 0.0,"+
        "		\"answer_time_queued\": \"00:02:66\","+
        "		\"num_calls_queued_answered\": 3"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale5\","+
        "		\"num_calls_queued\": 3.0,"+
        "		\"total_time_queued\": \"05:15:43\","+
        "		\"average_time_queued\": \"00:05:05.876263\","+
        "		\"abandonment_time_queued\": \"00:00:00\","+
        "		\"num_calls_queued_abandoned\": 0.0,"+
        "		\"answer_time_queued\": \"00:02:66\","+
        "		\"num_calls_queued_answered\": 3"+
        "	}"+
        ""+
        "]";
                    
    }

}