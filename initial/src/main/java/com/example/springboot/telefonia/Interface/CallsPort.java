package initial.src.main.java.com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import initial.src.main.java.com.example.springboot.telefonia.dto.CallsBody;

public interface CallsPort {

    boolean CallsPort(CallsPort callsPort) throws Exception;

    boolean sendCalls(CallsBody callsBody) throws Exception;
}

