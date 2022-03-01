package initial.src.main.java.com.example.springboot.telefonia.controller;

import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import initial.src.main.java.com.example.springboot.telefonia.response.QueueTime;
import initial.src.main.java.com.example.springboot.telefonia.response.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class SurveyRest {

    @Autowired
    private Survey survey;

    @Autowired
    private QADRepository QADRepository;

    @PostMapping(value = "/survey")
    @ResponseBody
    public String sendSurveyRest(

    @RequestParam("idS") int IdS,
    @RequestParam("dIni") Date DIni,
    @RequestParam("dFin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("start_name") String Start_name,
    @RequestParam("service_name") String Service_name,
    @RequestParam("phone_number") double Phone_number,
    @RequestParam("fcr") String Fcr,
    @RequestParam("nps") String Nps,
    @RequestParam("cs") int Cs,
    @RequestParam("p1") String P1,
    @RequestParam("p2") String P2,
    @RequestParam("p3") String P3,
    @RequestParam("p4") String P4,
    @RequestParam("p5") String P5,
    @RequestParam("p6") String P6,
    @RequestParam("p7") String P7,
    @RequestParam("p8") String P8,
    @RequestParam("p9") String P9) {

        return "idS " + IdS + "dIni " +DIni+ "dFin " + DFin + "service" +Service+ "start_name " +Start_name+
        "Service_name " + Service_name + "Phone_number"+Phone_number+"fcr" +Fcr+ "nps" + Nps + "cs " +Cs+
        "p1 " + P1 + "p2" +P2+ "p3" + P3 + "p4 " +P4+ "p5 " + P5 + "p6" +P6+ "p7" + P7 + "p8" +P8+ "p9" + P9 +"";

    }

}

