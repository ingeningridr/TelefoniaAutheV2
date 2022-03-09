package com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Boomi_Calls")
public class Calls implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "c_IdCalls")
    private int idCalls;
    @Column(name = "c_DIni")
    private String dIni;
    @Column(name = "c_DFin")
    private String dFin;
    @Column(name = "c_Service")
    private String service;
    @Column(name = "c_StartTime")
    private String start_time;
    @Column(name = "c_ServiceName")
    private String service_name;
    @Column(name = "c_PhoneNumber")
    private double phone_number;

    public  Calls(){}

    public Calls(int idCalls, String dIni, String dFin, String service, String start_time, String service_name, double phone_number) {
        this.idCalls = idCalls;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_time = start_time;
        this.service_name = service_name;
        this.phone_number = phone_number;
    }

    public int getIdCalls() {
        return idCalls;
    }

    public void setIdCalls(int idCalls) {
        this.idCalls = idCalls;
    }

    public String getdIni() {
        return dIni;
    }

    public void setdIni(String dIni) {
        this.dIni = dIni;
    }

    public String getdFin() {
        return dFin;
    }

    public void setdFin(String dFin) {
        this.dFin = dFin;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
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
}
