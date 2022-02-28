package initial.src.main.java.com.example.springboot.telefonia.Interface;

//import javax.calls.MessagingException;

import initial.src.main.java.com.example.springboot.telefonia.controller.SurveyBody;

public interface SurveyPort {

    boolean SurveyPort(SurveyPort surveyPort) throws Exception;

    boolean sendSurvey(SurveyPort SurveyBody) throws Exception;

    boolean sendSurveyTool(SurveyBody SurveyBody) throws Exception;
}