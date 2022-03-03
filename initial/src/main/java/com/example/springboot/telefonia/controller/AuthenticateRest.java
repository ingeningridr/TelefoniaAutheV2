package initial.src.main.java.com.example.springboot.telefonia.controller;

import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;
import initial.src.main.java.com.example.springboot.telefonia.Interface.AuthenticatePort;
import initial.src.main.java.com.example.springboot.telefonia.repository.QADRepository;

import com.example.springboot.telefonia.repository.AuthenticateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/report")
    public class AuthenticateRest {

    @Autowired
    private AuthenticateRepository authenticateRepository;

    @Autowired
    private QADRepository QADRepository;

            @PostMapping(value = "/authenticate")
            public String sendCallsRest(
                    @RequestParam("idAuthenticate") int IdAuthenticate,
                    @RequestParam("keyA") String KeyA,
                    @RequestParam("token") String Token) {


                return "idAuthenticate " + IdAuthenticate + "KeyA " + KeyA + "token " + Token + "";

            }
        }


