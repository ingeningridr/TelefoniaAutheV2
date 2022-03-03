package initial.src.main.java.com.example.springboot.telefonia.controller;

import initial.src.main.java.com.example.springboot.telefonia.Interface.CallsPort;
import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import initial.src.main.java.com.example.springboot.telefonia.response.HandlingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.telefonia.repository.HandlingRepository;


import java.util.Date;

@RestController
@RequestMapping(value = "/report")
public class HandlingTimeRest {

  @Autowired
  private HandlingRepository handlingRepository;

    @PostMapping(value = "/report/handlingTime")
    public String sendHandlingTimeRest(
      @RequestParam("idHT") int IdHT,
      @RequestParam("dIni") Date DIni,
      @RequestParam("dFin") Date DFin,
      @RequestParam("service") String Service,
      @RequestParam("start_time") Date Start_time,
      @RequestParam("service_name") Date Service_name,
      @RequestParam("num_calls_answered") Date Num_calls_answered,
      @RequestParam("handling_time") Date Handling_time,
      @RequestParam("average_handling_time") Date Average_handling_time,
      @RequestParam("talk_time_in") Date Talk_time_in,
      @RequestParam("average_talk_time_in") Date Average_talk_time_in) {

        return "idHT" + IdHT + "dini " +DIni+ "dFin " + DFin + "service" +Service+ "start_time " +Start_time+ "service_name " + Service_name + "handling_time" + Handling_time+ "average_handling_time " +Average_handling_time+ "talk_time_in " + Talk_time_in + "average_talk_time_in" + Average_talk_time_in +"";

    }

}
