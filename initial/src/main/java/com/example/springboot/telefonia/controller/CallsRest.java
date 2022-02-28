package com.example.springboot.telefonia.controller;


import initial.src.main.java.com.example.springboot.telefonia.Interface.CallsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class CallsRest {

    @Autowired
    private CallsPort callsPort;

    @PostMapping(value = "/calls")
    public String sendCallsRest(
    @RequestParam("idCalls") int IdCalls,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") int Phone_number) {


        return "idCalls " + IdCalls + "dini " + DIni + "dfin " + DFin + "service" +Service+ "start_name" + Start_name + "service_name" + Service_name + "phone_number" + Phone_number +"";

    }
}