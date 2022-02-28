package initial.src.main.java.com.example.springboot.telefonia.service;


import initial.src.main.java.com.example.springboot.telefonia.Interface.AuthenticatePort;
import initial.src.main.java.com.example.springboot.telefonia.dto.AuthenticateBody;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;



public abstract class AuthenticateService<JavaAuthenticateSender> implements AuthenticatePort {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(AuthenticateService.class);

   // @Autowired
    private JavaAuthenticateSender sender;

    @Deprecated
    public boolean sendAuthenticate(AuthenticateBody authenticateBody) throws Exception {

        LOGGER.info("AuthenticateBody: " + authenticateBody.toString());
            String pathToAttachment;
        return sendAuthenticate(
                    authenticateBody.getIdAuthenticate(),
                    authenticateBody.getKeyA(),
                    authenticateBody.getToken());
        }

    private boolean sendAuthenticate(int idAuthenticate, String keyA, String token) {
    return false;
    }

    private boolean sendAuthenticateTool(int idAuthenticate, String keyA, String token){

        boolean send = false;
        try {
            AuthenticateBody helper = null;
            helper.setIdAuthenticate(idAuthenticate);
            helper.setKeyA(keyA);
            helper.setToken(token);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}