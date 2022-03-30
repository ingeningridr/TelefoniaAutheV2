package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.Survey;
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
public class SurveyService {

    org.slf4j.Logger logger = LoggerFactory.getLogger(SurveyService.class);

    @Autowired
    private SurveyRepository surveyRepository;

    public SurveyService(){
        
    }

    public JSONArray sendSurveyTool(String fini, String ffin) throws Exception {

        JSONArray response = new JSONArray(this.dummySurvey(fini, ffin));        
        
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject surv = (JSONObject) response.get(i); 
            Survey survey = new Survey();
            survey.setStart_name(surv.get("start_time").toString()
            .replaceAll("ffinm", DateAssaUtil.dftest(ffin, -1))
            .replaceAll("ffin", ffin)
            .replaceAll("finim", DateAssaUtil.dftest(fini, 1))
            .replaceAll("fini", fini)
            );
            survey.setService_name(surv.get("service_name").toString());
            survey.setPhone_number(Double.parseDouble(surv.get("phone_number").toString()));

            survey.setFcr(surv.get("FCR").toString());
            survey.setNps(surv.get("NPS").toString());
            survey.setCs(surv.get("CS") != null && !(surv.get("CS").toString().equalsIgnoreCase("null")) ? Integer.parseInt(surv.get("CS").toString()) : 0);

            survey.setP1(surv.get("P1").toString());
            survey.setP2(surv.get("P2").toString());
            survey.setP3(surv.get("P3").toString());
            survey.setP4(surv.get("P4").toString());
            survey.setP5(surv.get("P5").toString());
            survey.setP6(surv.get("P6").toString());
            survey.setP7(surv.get("P7").toString());
            survey.setP8(surv.get("P8").toString());
            survey.setP9(surv.get("P9").toString());

            survey.setdIni(fini);
            survey.setdFin(ffin);        
            
            survey.setService(surv.get("service_name").toString());

            this.surveyRepository.save(survey);
        }

        return response;

    }

    /**
     * 
     */
    private String getSurveyContainer(String fini, String ffin) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> params = new HashMap<>();
        params.put("fIni", fini);
        params.put("fFin", ffin);
        //params.put("servicio", "servicio");

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL_SURVEY;

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        return template.exchange(
                url, HttpMethod.GET, requestEntity, String.class, params).getBody();
    }


    private String dummySurvey(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale1\","+
        "		\"phone_number\": \"23334234212\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale2\","+
        "		\"phone_number\": \"23334234212\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale3\","+
        "		\"phone_number\": \"21134234234\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale4\","+
        "		\"phone_number\": \"21134234234\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale5\","+
        "		\"phone_number\": \"21134234234\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale6\","+
        "		\"phone_number\": \"25334234212\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale7\","+
        "		\"phone_number\": \"21234234216\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale8\","+
        "		\"phone_number\": \"25334234212\","+
        "		\"FCR\": null,"+
        "		\"NPS\": null,"+
        "		\"CS\": null,"+
        "		\"P1\": null,"+
        "		\"P2\": null,"+
        "		\"P3\": null,"+
        "		\"P4\": null,"+
        "		\"P5\": null,"+
        "		\"P6\": null,"+
        "		\"P7\": null,"+
        "		\"P8\": null,"+
        "		\"P9\": null"+
        "	}"+
        "]".replaceAll("ffin", ffin).replaceAll("fini", fini);
            
        
    }
    
}