package initial.src.main.java.com.example.springboot.telefonia.response;

public class Authenticate {
    private int idAuthenticate;
    private String keyA;
    private String token;


    public Authenticate(int idAuthenticate, String keyA, String token){

        this.setIdAuthenticate(idAuthenticate);
        this.setKeyA(Integer.parseInt(keyA));
        this.setToken(Integer.parseInt(token));

    }
    public void setAuthenticate() {

    }
    public Authenticate() {

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

    public void setKeyA(int KeyA) {

        this.keyA = keyA;
    }

    public String getToken() {

        return token;
    }

    public void setToken(int token) {

        this.token = String.valueOf(token);
    }
    @Override
    public String toString() {
        return "Authenticate[idAuthenticate=" + getIdAuthenticate() +"keyA="+ getKeyA() + "token=" + getToken() + "]";
    }


}
