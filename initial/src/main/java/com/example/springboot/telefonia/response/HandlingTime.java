package com.example.springboot.telefonia.response;


import java.util.Date;

public class HandlingTime {

    private int idHT;
    private Date dIni;
    private Date dFin;
    private String service;
    private String start_name;
    private String service_name;
    private double num_calls_answered;
    private Date handling_time;
    private Date average_handling_time;
    private Date talk_time_in;
    private Date average_talk_time_in;

    public HandlingTime(int idHT, Date dIni, Date dFin, String service, String start_name, String service_name, double num_calls_answered, Date handling_time,
                        Date average_handling_time, Date talk_time_in, Date average_talk_time_in ){
        this.idHT = idHT;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this.num_calls_answered = num_calls_answered;
        this.handling_time = handling_time;
        this.average_handling_time = average_handling_time;
        this.talk_time_in = talk_time_in;
        this.average_talk_time_in = average_talk_time_in;
    }

    public HandlingTime() {

    }

    public HandlingTime(String s) {
    }


    public int getIdHT() {
        return idHT;
    }

    public void setIdHT(int idHT) {
        this.idHT = idHT;
    }

    public Date getDini(Date dini) {

        return dini;
    }
    public void setDIni(Date dIni) {

        this.dIni = dIni;
    }

    public Date getDFin(Date dFin) {

        return dFin;
    }

    public void setDFin(Date dFin) {

        this.dFin = dFin;
    }

    public String getService(String service) {

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

    @Override
    public String toString() {
        return "HandlingTime [idHT = " + idHT + "dIni=" + dIni + "dFin= " + dFin + "service= "+ service + "start_name=" + start_name + ",service_name=" + service_name + ", num_calls_answered=" + num_calls_answered + ", " +
       "handling_time=" + handling_time + ", average_handling_time=" + average_handling_time +", talk_time_in=" + talk_time_in +",average_talk_time_in=" + average_talk_time_in +"]";
    }


}

