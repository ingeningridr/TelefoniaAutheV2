package initial.src.main.java.com.example.springboot.telefonia.controller;

//import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LostCallsBody {

    private int idLC;
    private Date dIni;
    private Date dFin;
    private String service;
    private String start_name;
    private String service_name;
    private double phone_number;

    public LostCallsBody(int idLC, Date dIni, Date dFin, String service, String start_name, String service_name, double phone_number ){

        this.idLC = idLC;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this.phone_number = phone_number;
    }
    public void setLostCalls(LostCallsBody lostcalls) {

    }

    public int getIdLC() {
        return idLC;
    }

    public void setIdLC(int idLC) {
        this.idLC = idLC;
    }

    public Date getDIni() {

        return dIni;
    }

    public void setDIni() {

        this.dIni = dIni;
    }

    public Date getDFin() {

        return dFin;
    }

    public void setDFin() {

        this.dFin = dFin;
    }

    public String  getService() {

        return service;
    }

    public void setService() {

        this.service = service;
    }

    public String getStart_name() {

        return start_name;
    }

    public void setStart_name(String start_name) {

        this.start_name = start_name;
    }

    public String getService_name() {

        return service_name;
    }

    public void setService_name(String service_name) {

        this.service_name = service_name;
    }

    public double getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(double phone_number) {

        this.phone_number = phone_number;
    }


}
