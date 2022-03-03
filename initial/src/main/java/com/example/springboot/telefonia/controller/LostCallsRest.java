package initial.src.main.java.com.example.springboot.telefonia.controller;

import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import initial.src.main.java.com.example.springboot.telefonia.response.LostCalls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import com.example.springboot.telefonia.repository.LostCallsRepository;

@RestController
@RequestMapping(value = "/report")
public class LostCallsRest {

    @Autowired
    private LostCallsRepository lostCallsRepository;

    @PostMapping(value = "/lostCalls")
    public String sendLostCallsRest(
    @RequestParam("idLC") int IdLC,
    @RequestParam("dini") Date DIni,
    @RequestParam("dfin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("lostCalls") String LostCalls,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") double Phone_number) {

    return "idLC " + IdLC+ "dini " +DIni+ "dFin " + DFin + "service" +Service+ "LostCalls" + LostCalls + "start_name" + Start_name + "service_name" + Service_name + "phone_number" + Phone_number +"";

    }

}


