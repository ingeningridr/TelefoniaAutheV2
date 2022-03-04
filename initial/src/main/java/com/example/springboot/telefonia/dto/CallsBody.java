package com.example.springboot.telefonia.dto;

//import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CallsBody {

    private int idCalls;
    private Date dIni;
    private Date dFin;
    private String service;
    private Date start_time;
    private String service_name;
    private double phone_number;

    public CallsBody(int idCalls,Date dIni, Date dFin, String service, Date start_time, String service_name,  double phone_number) {

        this.idCalls = idCalls;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_time = start_time;
        this.service_name = service_name;
        this.phone_number = phone_number;
    }

    public void setCalls(CallsBody calls) {

    }
    public int getIdCalls() {

        return idCalls;
    }

    public void setIdCalls(int idCalls) {

        this.idCalls = idCalls;
    }

    public Date getDIni() {

        return dIni;
    }

    public void setDIni(Date dIni) {

        this.dIni = dIni;
    }

    public Date getDFin() {

        return dFin;
    }

    public void setDFin(Date dFin) {

        this.dFin = dFin;
    }

    public String getService() {

        return service;
    }

    public void setService(String service) {

        this.service = service;
    }

    public Date getStart_time() {

        return start_time;
    }

    public void setStart_time(Date start_time) {

        this.start_time = start_time;
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

    public void setIdLC(int idLC) {
    }
}
