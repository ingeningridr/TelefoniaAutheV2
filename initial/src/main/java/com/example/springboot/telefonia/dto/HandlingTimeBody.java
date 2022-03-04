package com.example.springboot.telefonia.dto;



import java.util.Date;

public class HandlingTimeBody {

    private static int idHT;
    private Date dIni;
    private Date dFin;
    private String service;
    private Date start_time;
    private String service_name;
    private double num_calls_answered;
    private Date handling_time;
    private Date average_handling_time;
    private Date talk_time_in;
    private Date average_talk_time_in;

    public HandlingTimeBody(int IdHT, Date dIni, Date dFin, String service, Date start_time, String service_name, double num_calls_answered, Date handling_time,
    Date average_handling_time, Date talk_time_in, Date average_talk_time_in ){

        this.idHT = IdHT;
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


    public HandlingTimeBody(String s) {
    }

    public static int getIdHT() {
        return idHT;
    }

    public void setIdHT(int idHT) {
        this.idHT = idHT;
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

    public void setService(String sefvice) {

        this.service = sefvice;
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

    public double getNum_calls_answered() {

        return num_calls_answered;
    }

    public void setNum_calls_answered(double num_calls_answered) {

        this.num_calls_answered = num_calls_answered;
    }

    public Date getHandling_time() {

        return handling_time;
    }

    public void setHandling_time(Date handling_time) {

        this.handling_time = handling_time;
    }

    public Date getAverage_handling_time() {

        return average_handling_time;
    }

    public void setAverage_handling_time(Date average_handling_time) {
        this.average_handling_time = average_handling_time;
    }

    public Date getTalk_time_in() {

        return talk_time_in;
    }

    public void setTalk_time_in(Date talk_time_in) {

        this.talk_time_in = talk_time_in;
    }

    public Date getAverage_talk_time_in() {

        return average_talk_time_in;
    }

    public void setAverage_talk_time_in(Date average_talk_time_in) {

        this.average_talk_time_in = average_talk_time_in;
    }

    public void setToken(String token) {

    }
    public void setHandlingTime(String handlingTimename) {

    }

}

