package com.example.springboot.telefonia.dto;

public class AuthenticateBody {
    private String keyA;
    private String token;

    public void AuthenticateBody(String keyA, String token) {
       
        this.keyA = keyA;
        this.token = token;

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
