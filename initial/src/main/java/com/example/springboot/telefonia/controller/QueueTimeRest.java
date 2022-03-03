package initial.src.main.java.com.example.springboot.telefonia.controller;

import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import initial.src.main.java.com.example.springboot.telefonia.response.QueueTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import com.example.springboot.telefonia.repository.QueueRepository;

@RestController
@RequestMapping(value = "/report")
public class QueueTimeRest {


    @Autowired
    private QueueRepository queueRepository;
    
    @PostMapping(value = "/queueTime")
    @ResponseBody
    public String sendQueueTimeRest(
    @RequestParam("idQT") int IdQT,
    @RequestParam("dIni") Date DIni,
    @RequestParam("dFin") Date DFin,
    @RequestParam("service") String Service,
    @RequestParam("queueTime") Date QueueTime,
    @RequestParam("start_name") String Start_time,
    @RequestParam("service_name") String Service_name,
    @RequestParam("num_calls_queued") double Num_calls_queued,
    @RequestParam("total_time_queued") Date Total_time_queued,
    @RequestParam("average_time_queued") Date Average_time_queued,
    @RequestParam("abandonment_time_queued") Date Abandonment_time_queued,
    @RequestParam("num_calls_queued_abandoned") double Num_calls_queued_abandoned,
    @RequestParam("answer_time_queued") Date Answer_time_queued,
    @RequestParam("num_calls_queued_answered") double Num_calls_queued_answered) {

        return "idQT " + IdQT + "dIni " +DIni+ "dFin " + DFin + "service" +Service+ "queueTime" + QueueTime +
        "start_name " +Start_time+ "Service_name " + Service_name + "num_calls_queued" +Num_calls_queued+ "total_time_queued" + Total_time_queued +
        "average_time_queued " +Average_time_queued+ "abandonment_time_queued " + Abandonment_time_queued + "num_calls_queued_abandoned" +Num_calls_queued_abandoned+
        "answer_time_queued" + Answer_time_queued +"num_calls_queued_answered" + Num_calls_queued_answered +"";

    }

}

