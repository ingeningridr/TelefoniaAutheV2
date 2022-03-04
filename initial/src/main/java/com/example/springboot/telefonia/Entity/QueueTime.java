package com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class QueueTime implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idQT")
    private int idQT;
    @Column(name = "dIni")
    private String dIni;
    @Column(name = "dFin")
    private String dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "queueTime")
    private String queueTime;
    @Column(name = "start_time")
    private String start_time;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "num_calls_queued")
    private double num_calls_queued;
    @Column(name = "total_time_queued")
    private String total_time_queued;
    @Column(name = "average_time_queued")
    private String average_time_queued;
    @Column(name = "abandonment_time_queued")
    private String abandonment_time_queued;
    @Column(name = "num_calls_queued_abandoned")
    private double num_calls_queued_abandoned;
    @Column(name = "answer_time_queued")
    private String answer_time_queued;
    @Column(name = "num_calls_queued_answered")
    private double num_calls_queued_answered;



public QueueTime(){

}

    public QueueTime(int idQT, String dIni, String dFin, String service, String queueTime, String start_time, String service_name, double num_calls_queued, String total_time_queued, String average_time_queued, String abandonment_time_queued, double num_calls_queued_abandoned, String answer_time_queued, double num_calls_queued_answered) {
        this.idQT = idQT;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.queueTime = queueTime;
        this.start_time = start_time;
        this.service_name = service_name;
        this.num_calls_queued = num_calls_queued;
        this.total_time_queued = total_time_queued;
        this.average_time_queued = average_time_queued;
        this.abandonment_time_queued = abandonment_time_queued;
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
        this.answer_time_queued = answer_time_queued;
        this.num_calls_queued_answered = num_calls_queued_answered;
    }

    public int getIdQT() {
        return idQT;
    }

    public void setIdQT(int idQT) {
        this.idQT = idQT;
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

    public String getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(String queueTime) {
        this.queueTime = queueTime;
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

    public double getNum_calls_queued() {
        return num_calls_queued;
    }

    public void setNum_calls_queued(double num_calls_queued) {
        this.num_calls_queued = num_calls_queued;
    }

    public String getTotal_time_queued() {
        return total_time_queued;
    }

    public void setTotal_time_queued(String total_time_queued) {
        this.total_time_queued = total_time_queued;
    }

    public String getAverage_time_queued() {
        return average_time_queued;
    }

    public void setAverage_time_queued(String average_time_queued) {
        this.average_time_queued = average_time_queued;
    }

    public String getAbandonment_time_queued() {
        return abandonment_time_queued;
    }

    public void setAbandonment_time_queued(String abandonment_time_queued) {
        this.abandonment_time_queued = abandonment_time_queued;
    }

    public double getNum_calls_queued_abandoned() {
        return num_calls_queued_abandoned;
    }

    public void setNum_calls_queued_abandoned(double num_calls_queued_abandoned) {
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
    }

    public String getAnswer_time_queued() {
        return answer_time_queued;
    }

    public void setAnswer_time_queued(String answer_time_queued) {
        this.answer_time_queued = answer_time_queued;
    }

    public double getNum_calls_queued_answered() {
        return num_calls_queued_answered;
    }

    public void setNum_calls_queued_answered(double num_calls_queued_answered) {
        this.num_calls_queued_answered = num_calls_queued_answered;
    }
}