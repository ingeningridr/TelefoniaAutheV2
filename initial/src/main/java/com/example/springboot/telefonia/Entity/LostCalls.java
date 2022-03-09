package com.example.springboot.telefonia.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Boomi_LostCalls")
public class LostCalls implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idLC")
    private int idLC;
    @Column(name = "dIni")
    private String dIni;
    @Column(name = "dFin")
    private String dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "start_name")
    private String start_name;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "phone_number")
    private double phone_number;


    public  LostCalls(){

    }

    public LostCalls(int idLC, String dIni, String dFin, String service, String start_name, String service_name, double phone_number) {
        this.idLC = idLC;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_name = start_name;
        this.service_name = service_name;
        this.phone_number = phone_number;
    }

    public int getIdLC() {
        return idLC;
    }

    public void setIdLC(int idLC) {
        this.idLC = idLC;
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
