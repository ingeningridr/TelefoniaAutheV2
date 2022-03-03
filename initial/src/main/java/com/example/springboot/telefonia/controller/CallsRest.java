package initial.src.main.java.com.example.springboot.telefonia.controller;


import initial.src.main.java.com.example.springboot.telefonia.Interface.CallsPort;
import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

import com.example.springboot.telefonia.repository.CallsRepository;

@RestController
@RequestMapping(value = "/report")
public class CallsRest {

    @Autowired
    private CallsRepository callsRepository;

    @PostMapping(value = "/calls")
    public String sendCallsRest(
    @RequestParam("idCalls") int IdCalls,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("start_time") Date start_time,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") double Phone_number) {

        return "idCalls " + IdCalls + "dini " + DIni + "dfin " + DFin + "service" +Service+ "start_time" + start_time + "service_name" + Service_name + "phone_number" + Phone_number +"";

    }
}