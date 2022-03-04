package com.example.springboot.telefonia.dto;

public class AuthenticateBody {
    private int idAuthenticate;
    private String keyA;
    private String token;

    public void AuthenticateBody(int ididAuthenticate,String keyA, String token) {

        this.idAuthenticate = idAuthenticate;
        this.keyA = keyA;
        this.token = token;

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
