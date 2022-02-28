package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.HandlingTimePort;
import com.example.springboot.telefonia.dto.HandlingTimeBody;
import com.example.springboot.telefonia.response.HandlingTime;

import java.util.Date;
import java.util.logging.Logger;

import static com.example.springboot.telefonia.service.CallsService.LoggerFactory;

public abstract class HandlingTimeService<JavaHandlingTimeSender, average_talk_time_in> implements HandlingTimePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(HandlingTimeService.class));

    //@Autowired
    private JavaHandlingTimeSender sender;

    @Override
    public boolean sendHandlingTime(HandlingTimeBody handlingTimeBody) throws Exception {
        LOGGER.info("HandlingTimeBody: " + handlingTimeBody.toString());
        String pathToAttachment;
        return sendHandlingTime(
                HandlingTimeBody.getIdHT(),
                handlingTimeBody.getDIni(),
                handlingTimeBody.getDFin(),
                handlingTimeBody.getService(),
                handlingTimeBody.getStart_name(),
                handlingTimeBody.getService_name(),
                handlingTimeBody.getNum_calls_answered(),
                handlingTimeBody.getHandling_time(),
                handlingTimeBody.getAverage_handling_time(),
                handlingTimeBody.getTalk_time_in(),
                handlingTimeBody.getAverage_talk_time_in());
    }

    private boolean sendHandlingTime(int idHT, Date dIni, Date dFin, String service, String start_name, String service_name, double num_calls_answered, Date handling_time, Date average_handling_time, Date talk_time_in, Date average_talk_time_in) {
         return false;
    }

    private boolean sendHandlingTimeTool(int idHT,Date dIni, Date dFin, String service, String start_name, String service_name, double num_calls_answered,
                                         Date handling_time,Date average_handling_time,Date talk_time_in, Date average_talk_time_in ){

        boolean send = false;
        try {

            HandlingTime helper = null;
            helper.setIdHT(idHT);
            helper.setDIni(dIni);
            helper.setDFin(dFin);
            helper.setService(service);
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setNum_calls_answered(num_calls_answered);
            helper.setHandling_time(handling_time);
            helper.setService_name(service_name);
            helper.setAverage_handling_time(average_handling_time);
            helper.setTalk_time_in(talk_time_in);
            helper.setAverage_talk_time_in(average_talk_time_in);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}
