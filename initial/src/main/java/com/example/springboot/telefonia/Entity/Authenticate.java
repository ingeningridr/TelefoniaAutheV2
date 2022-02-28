package initial.src.main.java.com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Authenticate implements Serializable {

   private static final long serialVersionUID = 1L;

   private Object GenerationType;
   @Id
   @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
   @Column(name = "idAuthenticate")
   private int idAuthenticate;
   @Column(name = "keyA")
   private String keyA;
   @Column(name = "token")
   private String token;

protected  Authenticate(){

}

    public void Authenticate(int idAuthenticate, String keyA, String token){

        this.idAuthenticate = idAuthenticate;
        this.keyA = keyA;
        this.token = token;

    }

    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
        return String.format("Authenticate[idAuthenticate=%d, Authenticate='%s', token ='%s']");
    }

    public int getIdAuthenticate() {

    return idAuthenticate;
    }

    public void setIdAuthenticate(int idAuthenticate) {

    this.idAuthenticate = idAuthenticate;
    }

    public String getKeyA() {

    return keyA;
    }

    public void setKeyA(String keyA) {

    this.keyA = keyA;
    }

    public String getToken() {

    return token;
    }

    public void setToken(String token) {

    this.token = token;
    }
}
