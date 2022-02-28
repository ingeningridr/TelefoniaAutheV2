package com.example.springboot.telefonia.service;


import com.example.springboot.telefonia.dto.CallsBody;
import com.example.springboot.telefonia.response.Calls;
import initial.src.main.java.com.example.springboot.telefonia.Interface.CallsPort;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.logging.Logger;

public abstract class CallsService<JavaCallsSender> implements CallsPort {

    public static Logger LoggerFactory;
    private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(CallsService.class));

        //@Autowired
        private JavaCallsSender sender;

        @Override
        public boolean sendCalls(CallsBody callsBody) throws Exception {
            LOGGER.info("CallsBody: " + callsBody.toString());
            String pathToAttachment;
            return sendCalls(
                    callsBody.getIdCalls(),
                    callsBody.getDIni(),
                    callsBody.getDFin(),
                    callsBody.getService(),
                    callsBody.getStart_name(),
                    callsBody.getService_name(),
                    callsBody.getPhone_number());
        }

    private boolean sendCalls(int idCalls, Date dIni, Date dFin, String service, String start_name, String service_name,double phone_number) {

            return false;
    }

    private boolean sendCallsTool(int idCalls, Date dIni, Date dFin, String service, String start_name, String service_name, double phone_number){

            boolean send = false;
            try {
                Calls helper = null;
                helper.setIdCalls(idCalls);
                helper.setDIni(dIni);
                helper.setDFin(dFin);
                helper.setService(service);
                helper.setStart_name(start_name);
                helper.setService_name(service_name);
                helper.setPhone_number(phone_number);
                send = true;
            } catch (Exception e) {
                System.out.println("Se presento un error: {}");
            }
            return send;
        }

    }