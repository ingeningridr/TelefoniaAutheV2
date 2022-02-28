package initial.src.main.java.com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

import initial.src.main.java.com.example.springboot.telefonia.controller.QueueTimeBody;

public interface QueueTimePort {

    boolean QueueTimePort(QueueTimePort queueTimePort) throws Exception;

    boolean sendQueueTime(QueueTimePort queueTimeBody) throws Exception;

    boolean sendQueueTimeTool(QueueTimeBody queueTimeBody);
}

