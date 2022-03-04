package com.example.springboot.telefonia.dto;

//import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class LostCallsBody {

    private int idLC;
    private Date dIni;
    private Date dFin;
    private String service;
    private Date start_time;
    private String service_name;
    private String phone_number;

    public LostCallsBody(int idLC, Date dIni, Date dFin, String service, Date start_time, String service_name, String phone_number) {

        this.idLC = idLC;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_time = start_time;
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

    public String getService() {

        return service;
    }

    public void setService() {

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

    public String getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(String phone_number) {

        this.phone_number = phone_number;
    }

}