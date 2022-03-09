package com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Boomi_HandlingTime")
public class HandlingTime implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idHT")
    private int idHT;
    @Column(name = "dIni")
    private String dIni;
    @Column(name = "dFin")
    private String dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "start_time")
    private String start_time;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "num_calls_answered")
    private double num_calls_answered;
    @Column(name = "handling_time")
    private String handling_time;
    @Column(name = "average_handling_time")
    private String average_handling_time;
    @Column(name = "talk_time_in")
    private String talk_time_in;
    @Column(name = "average_talk_time_in")
    private String average_talk_time_in;

    public HandlingTime(){

    }

    public HandlingTime(int idHT, String dIni, String dFin, String service, String start_time, String service_name, double num_calls_answered, String handling_time, String average_handling_time, String talk_time_in, String average_talk_time_in) {
        this.idHT = idHT;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_time = start_time;
        this.service_name = service_name;
        this.num_calls_answered = num_calls_answered;
        this.handling_time = handling_time;
        this.average_handling_time = average_handling_time;
        this.talk_time_in = talk_time_in;
        this.average_talk_time_in = average_talk_time_in;
    }

    public int getIdHT() {
        return idHT;
    }

    public void setIdHT(int idHT) {
        this.idHT = idHT;
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

    public double getNum_calls_answered() {
        return num_calls_answered;
    }

    public void setNum_calls_answered(double num_calls_answered) {
        this.num_calls_answered = num_calls_answered;
    }

    public String getHandling_time() {
        return handling_time;
    }

    public void setHandling_time(String handling_time) {
        this.handling_time = handling_time;
    }

    public String getAverage_handling_time() {
        return average_handling_time;
    }

    public void setAverage_handling_time(String average_handling_time) {
        this.average_handling_time = average_handling_time;
    }

    public String getTalk_time_in() {
        return talk_time_in;
    }

    public void setTalk_time_in(String talk_time_in) {
        this.talk_time_in = talk_time_in;
    }

    public String getAverage_talk_time_in() {
        return average_talk_time_in;
    }

    public void setAverage_talk_time_in(String average_talk_time_in) {
        this.average_talk_time_in = average_talk_time_in;
    }
}
