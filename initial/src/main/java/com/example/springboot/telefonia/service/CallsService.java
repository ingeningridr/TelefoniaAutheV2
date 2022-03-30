package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Entity.Calls;
import com.example.springboot.telefonia.utils.Constantes;
import com.example.springboot.telefonia.utils.DateAssaUtil;

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

    /**
     * 
     */
    public JSONArray sendCalls(String fini, String ffin) throws Exception {
        

        JSONArray response = new JSONArray(this.dummyCalls(fini, ffin));
        for(int i = 0; i < response.length(); i++) 
        {
            JSONObject callsJ = (JSONObject) response.get(i); 
            Calls calls = new Calls();
            calls.setStart_time(callsJ.get("start_time").toString()
            .replaceAll("ffinm", DateAssaUtil.dftest(ffin, -1))
            .replaceAll("ffin", ffin)
            .replaceAll("finim", DateAssaUtil.dftest(fini, 1))
            .replaceAll("fini", fini)
            );
            calls.setService_name(callsJ.get("service_name").toString());
            calls.setdIni(fini);
            calls.setdFin(ffin);
            calls.setService(callsJ.get("service_name").toString());
            calls.setPhone_number(Double.parseDouble(callsJ.get("phone_number").toString())); 
            this.callsRepository.save(calls);
        }

        return response;
                    
    }

    /**
     * 
     */
    public String getCallsFromContainer(String fini, String ffin) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> params = new HashMap<>();
        params.put("fIni", fini);
        params.put("fFin", ffin);
        //params.put("servicio", "servicio");

        RestTemplate template = new RestTemplate();
        String url = Constantes.URL_CALLS;

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        return template.exchange(
                url, HttpMethod.GET, requestEntity, String.class, params).getBody();
    }


    /**
     * 
     * @param fini
     * @param ffin
     * @return
     */
    public String dummyCalls(String fini, String ffin){
        return "["+
        ""+
        "	{"+
        "		\"start_time\": \"fini\","+
        "		\"service_name\": \"Entrante Yale1\","+
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
        "		\"service_name\": \"Entrante Yale5\","+
        "		\"phone_number\": \"21134234234\""+
        "	},{"+
        "		\"start_time\": \"ffin\","+
        "		\"service_name\": \"Entrante Yale6\","+
        "		\"phone_number\": \"25334234212\""+
        "	},{"+
        "		\"start_time\": \"ffinm\","+
        "		\"service_name\": \"Entrante de Yale7\","+
        "		\"phone_number\": \"21234234216\""+
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
        "		\"phone_number\": \"21234234216\""+
        "	}"+
        ""+
        "]";
         
        
    }

}
