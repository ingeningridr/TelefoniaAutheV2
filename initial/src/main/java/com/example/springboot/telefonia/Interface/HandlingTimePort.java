package initial.src.main.java.com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import initial.src.main.java.com.example.springboot.telefonia.controller.HandlingTimeBody;

public interface HandlingTimePort {

    boolean HandlingTimePort(HandlingTimePort handlingTimePort) throws Exception;

    boolean HandlingTimeBody(HandlingTimeBody handlingTimeBody) throws Exception;

    boolean sendHandlingTime(HandlingTimeBody handlingTimeBody) throws Exception;
}




