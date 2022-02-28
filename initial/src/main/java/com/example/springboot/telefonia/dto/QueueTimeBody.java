package com.example.springboot.telefonia.dto;

//import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class QueueTimeBody {

    private int idQT;
    private Date dIni;
    private Date dFin;
    private String service;
    private String start_name;
    private String service_name;
    private double num_calls_queued;
    private Date total_time_queued;
    private Date average_time_queued;
    private Date abandonment_time_queued;
    private double num_calls_queued_abandoned;
    private Date answer_time_queued;
    private double num_calls_queued_answered;

    public QueueTimeBody(int idQT, Date dIni, Date dFin, String service, String start_name, String service_name, double num_calls_queued, Date total_time_queued,
    Date average_time_queued, Date abandonment_time_queued, double num_calls_queued_abandoned, Date answer_time_queued,
    Date answer_time_queue, double num_calls_queued_answered){

        this.idQT = idQT;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this.num_calls_queued = num_calls_queued;
        this.total_time_queued = total_time_queued;
        this.average_time_queued = average_time_queued;
        this.abandonment_time_queued = abandonment_time_queued;
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
        this.answer_time_queued = answer_time_queued;
        this.num_calls_queued_answered = num_calls_queued_answered;
    }
    public void setQueueTime(QueueTimeBody queueTime) {

    }
    public int getIdQT() {
        return idQT;
    }

    public void setIdQT(int idQT) {
        this.idQT = idQT;
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

    public double getNum_calls_queued() {

        return num_calls_queued;
    }

    public void setNum_calls_queued(double num_calls_queued) {

        this.num_calls_queued = num_calls_queued;
    }

    public Date getTotal_time_queued() {

        return total_time_queued;
    }

    public void setTotal_time_queued(Date total_time_queued) {

        this.total_time_queued = total_time_queued;
    }

    public Date getAverage_time_queued() {

        return average_time_queued;
    }

    public void setAverage_time_queued(Date average_time_queued) {

        this.average_time_queued = average_time_queued;
    }

    public Date getAbandonment_time_queued() {

        return abandonment_time_queued;
    }

    public void setAbandonment_time_queued(Date abandonment_time_queued) {
        this.abandonment_time_queued = abandonment_time_queued;
    }
    public double getNum_calls_queued_abandoned() {

        return num_calls_queued_abandoned;
    }

    public void setNum_calls_queued_abandoned(double num_calls_queued_abandoned) {
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
    }
    public Date getAnswer_time_queued() {

        return answer_time_queued;
    }

    public void setAnswer_time_queued(Date answer_time_queued) {

        this.answer_time_queued = answer_time_queued;
    }

    public double getNum_calls_queued_answered() {

        return num_calls_queued_answered;
    }

    public void setNum_calls_queued_answered(double num_calls_queued_answered) {
        this.num_calls_queued_answered = num_calls_queued_answered;
    }


}

