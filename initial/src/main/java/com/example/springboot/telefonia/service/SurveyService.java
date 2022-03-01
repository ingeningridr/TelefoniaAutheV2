package initial.src.main.java.com.example.springboot.telefonia.service;


import initial.src.main.java.com.example.springboot.telefonia.Interface.SurveyPort;
import initial.src.main.java.com.example.springboot.telefonia.controller.SurveyBody;
import initial.src.main.java.com.example.springboot.telefonia.response.Survey;
import org.junit.platform.commons.logging.LoggerFactory;
import java.util.Date;
import java.util.logging.Logger;


public abstract class SurveyService implements SurveyPort {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SurveyService.class);

    //@Autowired
    //private JavaSurveySender sender;


    @Override
    public boolean sendSurveyTool(SurveyBody SurveyBody) throws Exception {

        Survey surveyBody = null;
        LOGGER.info("SurveyBody: " + surveyBody.toString());
        String pathToAttachment;

        return sendSurveyTool(
                surveyBody.getIdS(),
                surveyBody.getDIni(),
                surveyBody.getDFin(),
                surveyBody.getService(),
                surveyBody.getStart_time(),
                surveyBody.getService_name(),
                surveyBody.getPhone_number(),
                surveyBody.getFcr(),
                surveyBody.getNps(),
                surveyBody.getCs(),
                surveyBody.getP1(),
                surveyBody.getP2(),
                surveyBody.getP3(),
                surveyBody.getP4(),
                surveyBody.getP5(),
                surveyBody.getP6(),
                surveyBody.getP7(),
                surveyBody.getP8(),
                surveyBody.getP9());

    }
    private boolean sendSurveyTool(int idS, Date dIni, Date dFin, String service, Date start_time, String service_name,
    double phone_number, String fcr, String nps, int cs, String p1, String p2, String p3, String p4, String p5, String p6,
     String p7, String p8, String p9) {

        boolean send = false;
        try {
            Survey helper = null;
            helper.setIdS(idS);
            helper.setDIni(dIni);
            helper.setDFin(dFin);
            helper.setService(service);
            helper.setStart_time(start_time);
            helper.setService_name(service_name);
            helper.setPhone_number(phone_number);
            helper.setFcr(fcr);
            helper.setNps(nps);
            helper.setCs((cs));
            helper.setP1(p1);
            helper.setP2(p2);
            helper.setP3(p3);
            helper.setP3(p4);
            helper.setP3(p5);
            helper.setP3(p6);
            helper.setP3(p7);
            helper.setP3(p8);
            helper.setP3(p9);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }
}