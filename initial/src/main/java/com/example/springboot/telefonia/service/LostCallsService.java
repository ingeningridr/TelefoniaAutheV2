package initial.src.main.java.com.example.springboot.telefonia.service;

import initial.src.main.java.com.example.springboot.telefonia.Interface.LostCallsPort;
import initial.src.main.java.com.example.springboot.telefonia.controller.LostCallsBody;
import initial.src.main.java.com.example.springboot.telefonia.dto.CallsBody;
import org.junit.platform.commons.logging.LoggerFactory;
import java.util.Date;
import java.util.logging.Logger;


public abstract class LostCallsService<JavaLostCallsSender> implements LostCallsPort {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(LostCallsService.class);

    //@Autowired
    private JavaLostCallsSender sender;


    @Override
    public boolean sendLostCalls(LostCallsBody lostCallsBody) throws Exception {
        LOGGER.info("LostCallsBody: " + lostCallsBody.toString());
        String pathToAttachment;
        return sendLostCalls(
                lostCallsBody.getIdLC(),
                lostCallsBody.getDIni(),
                lostCallsBody.getDFin(),
                lostCallsBody.getService(),
                lostCallsBody.getStart_time(),
                lostCallsBody.getService_name(),
                lostCallsBody.getPhone_number());
    }

    private boolean sendLostCalls(int idLC, Date dIni, Date dFin, String service, Date start_time, String service_name, double phone_number) {

        return false;
    }

    private boolean sendLostCallsTool(int idLC, Date dIni, Date dFin, String service, Date start_time, String service_name, double phone_number){

        boolean send = false;
        try {
            CallsBody helper = null;
            helper.setIdLC(idLC);
            helper.setDIni(dIni);
            helper.setDFin(dFin);
            helper.setService(service);
            helper.setStart_time(start_time);
            helper.setService_name(service_name);
            helper.setPhone_number((int)phone_number);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }
}