package initial.src.main.java.com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import initial.src.main.java.com.example.springboot.telefonia.controller.LostCallsBody;

public interface LostCallsPort{

    boolean LostCallsPort(LostCallsPort lostCallsPort) throws Exception;

    boolean sendLostCalls(LostCallsPort LostCallsBody) throws Exception;

    boolean sendLostCalls(LostCallsBody lostCallsBody) throws Exception;
}
