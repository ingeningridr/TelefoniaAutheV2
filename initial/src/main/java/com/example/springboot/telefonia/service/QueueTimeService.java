package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.QueueTimePort;
import com.example.springboot.telefonia.dto.QueueTimeBody;
import com.example.springboot.telefonia.response.QueueTime;

import java.util.Date;
import java.util.logging.Logger;

import static com.example.springboot.telefonia.service.CallsService.LoggerFactory;

public abstract class QueueTimeService<JavaQueueTimeSender> implements QueueTimePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(QueueTimeService.class));

    //@Autowired
    private JavaQueueTimeSender sender;


    @Override
    public boolean sendQueueTimeTool(QueueTimeBody queueTimeBody) {
        LOGGER.info("QueueTimeBody: " + queueTimeBody.toString());
        String pathToAttachment;
        return sendQueueTimeTool(
                queueTimeBody.getIdQT(),
                queueTimeBody.getDIni(),
                queueTimeBody.getDFin(),
                queueTimeBody.getService(),
                queueTimeBody.getStart_name(),
                queueTimeBody.getService_name(),
                queueTimeBody.getNum_calls_queued(),
                queueTimeBody.getTotal_time_queued(),
                queueTimeBody.getAverage_time_queued(),
                queueTimeBody.getAbandonment_time_queued(),
                queueTimeBody.getNum_calls_queued_abandoned(),
                queueTimeBody.getAnswer_time_queued(),
                queueTimeBody.getNum_calls_queued_answered());
    }

    private boolean sendQueueTimeTool(int idQT, Date dIni, Date dFin, String service, String start_name, String service_name, double num_calls_queued,
                                      Date total_time_queued, Date average_time_queued, Date abandonment_time_queued,
                                      double num_calls_queued_abandoned, Date answer_time_queued, double num_calls_queued_answered){

        boolean send = false;
        try {
            QueueTime helper = null;
            helper.getIdQT();
            helper.setDIni(dIni);
            helper.setDFin(dFin);
            helper.setService(service);
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setNum_calls_queued(num_calls_queued);
            helper.setTotal_time_queued(String.valueOf(total_time_queued));
            helper.setAverage_time_queued(String.valueOf(average_time_queued));
            helper.setAbandonment_time_queued(String.valueOf(abandonment_time_queued));
            helper.setNum_calls_queued_abandoned(num_calls_queued_abandoned);
            helper.setAnswer_time_queued(String.valueOf(answer_time_queued));
            helper.setNum_calls_queued_answered(num_calls_queued_answered);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}