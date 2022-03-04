package com.example.springboot.telefonia.dto;

import java.util.Date;

public class CustomResponse {

    private int a_idAuthenticate;
    private String a_keyA;
    private String a_token;
    private int c_idCalls;
    private Date c_dIni;
    private Date c_dFin;
    private String c_service;
    private String c_start_name;
    private String c_service_name;
    private int c_phone_number;
    private int h_idHT;
    private Date h_dIni;
    private Date h_dFin;
    private String h_service;
    private String h_start_name;
    private String h_service_name;
    private double h_num_calls_answered;
    private Date h_handling_time;
    private Date h_average_handling_time;
    private Date h_talk_time_ine;
    private Date h_average_talk_time_in;
    private int l_idLC;
    private Date l_dIni;
    private Date l_dFin;
    private String l_service;
    private String l_start_name;
    private String l_service_name;
    private double l_phone_number;
    private int q_idQT;
    private Date q_dIni;
    private Date q_dFin;
    private String q_service;
    private String q_start_time;
    private String q_service_name;
    private double q_num_calls_queued;
    private Date q_total_time_queued;
    private Date q_average_time_queued;
    private Date q_abandonment_time_queued;
    private double q_num_calls_queued_abandoned;
    private Date q_answer_time_queued;
    private double q_num_calls_queued_answered;
    private int s_idS;
    private Date s_dIni;
    private Date s_dFin;
    private String s_service;
    private String s_start_name;
    private String s_service_name;
    private double s_phone_number;
    private String s_fcr;
    private String s_nps;
    private int s_cs;
    private String s_p1;
    private String s_p2;
    private String s_p3;
    private String s_p4;
    private String s_p5;
    private String s_p6;
    private String s_p7;
    private String s_p8;
    private String s_p9;

    public CustomResponse(int a_idAuthenticate,
                          String a_keyA,
                          String a_token,
                          int c_idCalls,
                          Date c_dIni,
                          Date c_dFin,
                          String c_service,
                          String c_start_name,
                          String c_service_name,
                          double c_phone_number,
                          int h_idHT,
                          Date h_dIni,
                          Date h_dFin,
                          String h_service,
                          String h_start_name,
                          String h_service_name,
                          double h_num_calls_answered,
                          Date h_handling_time,
                          Date h_average_handling_time,
                          Date h_talk_time_ine,
                          Date h_average_talk_time_in,
                          int l_idLC,
                          Date l_dIini,
                          Date l_dFin,
                          String l_service,
                          String l_start_name,
                          String l_service_name,
                          double l_phone_number,
                          int q_idQT,
                          Date q_dIini,
                          Date q_dFin,
                          String q_start_time,
                          String q_Service_name,
                          double q_num_calls_queued,
                          Date q_total_time_queued,
                          Date q_average_time_queued,
                          Date q_abandonment_time_queued,
                          double q_num_calls_queued_abandoned,
                          Date q_answer_time_queued,
                          double q_num_calls_queued_answered,
                          int s_idS,
                          Date s_dIini,
                          Date s_dFin,
                          String s_service,
                          String s_start_name,
                          String s_Service_name,
                          double s_phone_number,
                          String s_fcr,
                          String s_nps,
                          int s_cs,
                          String s_p1,
                          String s_p2,
                          String s_p3,
                          String s_p4,
                          String s_p5,
                          String s_p6,
                          String s_p7,
                          String s_p8,
                          String s_p9) {

                this.a_idAuthenticate = a_idAuthenticate;
                this.a_keyA = a_keyA;
                this.a_token = a_token;
                this.c_idCalls = c_idCalls;
                this.c_dIni = c_dIni;
                this.c_dFin = c_dFin;
                this.c_service = c_service;
                this.c_start_name = c_start_name;
                this.c_service_name = c_service_name;
                this.c_phone_number = (int) c_phone_number;
                this.h_idHT = h_idHT;
                this.h_dIni = h_dIni;
                this.h_dFin = h_dFin;
                this.h_service = h_service;
                this.h_start_name = h_start_name;
                this.h_service_name = h_service_name;
                this.h_num_calls_answered = h_num_calls_answered;
                this.h_handling_time = h_handling_time;
                this.h_average_handling_time = h_average_handling_time;
                this.h_talk_time_ine = h_talk_time_ine;
                this.h_average_talk_time_in = h_average_talk_time_in;
                this.l_idLC = l_idLC;
                this.l_dIni = l_dIini;
                this.l_dFin = l_dFin;
                this.l_service = l_service;
                this.l_start_name = l_start_name;
                this.l_service_name = l_service_name;
                this.l_phone_number = l_phone_number;
                this.q_idQT = q_idQT;
                this.q_dIni = q_dIini;
                this.q_dFin = q_dFin;
                this.q_service = q_service;
                this.q_start_time = q_start_time;
                this.q_service_name = q_Service_name;
                this.q_num_calls_queued = q_num_calls_queued;
                this.q_total_time_queued = q_total_time_queued;
                this.q_average_time_queued = q_average_time_queued;
                this.q_abandonment_time_queued = q_abandonment_time_queued;
                this.q_num_calls_queued_abandoned = q_num_calls_queued_abandoned;
                this.q_answer_time_queued = q_answer_time_queued;
                this.q_num_calls_queued_answered = q_num_calls_queued_answered;
                this.s_idS = s_idS;
                this.s_dIni = s_dIini;
                this.s_dFin = s_dFin;
                this.s_service = s_service;
                this.s_start_name = s_start_name;
                this.s_service_name = s_Service_name;
                this.s_phone_number = s_phone_number;
                this.s_nps = s_nps;
                this.s_cs = s_cs;
                this.s_p1 = s_p1;
                this.s_p2 = s_p2;
                this.s_p3 = s_p3;
                this.s_p4 = s_p4;
                this.s_p5 = s_p5;
                this.s_p6 = s_p6;
                this.s_p7 = s_p7;
                this.s_p8 = s_p8;
                this.s_p9 = s_p9;
    }

    public int getA_idAuthenticate() {
        return a_idAuthenticate;
    }

    public void setA_idAuthenticate(int a_idAuthenticate) {
        this.a_idAuthenticate = a_idAuthenticate;
    }

    public String getA_keyA() {
        return a_keyA;
    }

    public void setA_keyA(String a_keyA) {
        this.a_keyA = a_keyA;
    }

    public String getA_token() {
        return a_token;
    }

    public void setA_token(String a_token) {
        this.a_token = a_token;
    }

    public int getC_idCalls() {
        return c_idCalls;
    }

    public void setC_idCalls(int c_idCalls) {
        this.c_idCalls = c_idCalls;
    }

    public Date getC_dIni() {
        return c_dIni;
    }

    public void setC_dIni(Date c_dIni) {
        this.c_dIni = c_dIni;
    }

    public Date getC_dFin() {
        return c_dFin;
    }

    public void setC_dFin(Date c_dFin) {
        this.c_dFin = c_dFin;
    }

    public String getC_service() {
        return c_service;
    }

    public void setC_service(String c_service) {
        this.c_service = c_service;
    }

    public String getC_start_name() {
        return c_start_name;
    }

    public void setC_start_name(String c_start_name) {
        this.c_start_name = c_start_name;
    }

    public String getC_service_name() {
        return c_service_name;
    }

    public void setC_service_name(String c_service_name) {
        this.c_service_name = c_service_name;
    }

    public int getC_phone_number() {
        return c_phone_number;
    }

    public void setC_phone_number(int c_phone_number) {
        this.c_phone_number = c_phone_number;
    }

    public int getH_idHT() {
        return h_idHT;
    }

    public void setH_idHT(int h_idHT) {
        this.h_idHT = h_idHT;
    }

    public Date getH_dIni() {
        return h_dIni;
    }

    public void setH_dIni(Date h_dIni) {
        this.h_dIni = h_dIni;
    }

    public Date getH_dFin() {
        return h_dFin;
    }

    public void setH_dFin(Date h_dFin) {
        this.h_dFin = h_dFin;
    }

    public String getH_service() {
        return h_service;
    }

    public void setH_service(String h_service) {
        this.h_service = h_service;
    }

    public String getH_start_name() {
        return h_start_name;
    }

    public void setH_start_name(String h_start_name) {
        this.h_start_name = h_start_name;
    }

    public String getH_service_name() {
        return h_service_name;
    }

    public void setH_service_name(String h_service_name) {
        this.h_service_name = h_service_name;
    }

    public double getH_num_calls_answered() {
        return h_num_calls_answered;
    }

    public void setH_num_calls_answered(double h_num_calls_answered) {
        this.h_num_calls_answered = h_num_calls_answered;
    }

    public Date getH_handling_time() {
        return h_handling_time;
    }

    public void setH_handling_time(Date h_handling_time) {
        this.h_handling_time = h_handling_time;
    }

    public Date getH_average_handling_time() {
        return h_average_handling_time;
    }

    public void setH_average_handling_time(Date h_average_handling_time) {
        this.h_average_handling_time = h_average_handling_time;
    }

    public Date getH_talk_time_in() {
        return h_talk_time_ine;
    }

    public void setH_talk_time_in(Date h_talk_time_in) {
        this.h_talk_time_ine = h_talk_time_in;
    }

    public Date getH_average_talk_time_in() {
        return h_average_talk_time_in;
    }

    public void setH_average_talk_time_in(Date h_average_talk_time_in) {
        this.h_average_talk_time_in = h_average_talk_time_in;
    }

    public int getL_idLC() {
        return l_idLC;
    }

    public void setL_idLC(int l_idLC) {
        this.l_idLC = l_idLC;
    }

    public Date getL_dIni() {
        return l_dIni;
    }

    public void setL_dIni(Date l_dIni) {
        this.l_dIni = l_dIni;
    }

    public Date getL_dFin() {
        return l_dFin;
    }

    public void setL_dFin(Date l_dFin) {
        this.l_dFin = l_dFin;
    }

    public String getL_service() {
        return l_service;
    }

    public void setL_service(String l_service) {
        this.l_service = l_service;
    }

    public String getL_start_name() {
        return l_start_name;
    }

    public void setL_start_name(String l_start_name) {
        this.l_start_name = l_start_name;
    }

    public String getL_service_name() {
        return l_service_name;
    }

    public void setL_service_name(String l_service_name) {
        this.l_service_name = l_service_name;
    }

    public double getL_phone_number() {
        return l_phone_number;
    }

    public void setL_phone_number(double l_phone_number) {
        this.l_phone_number = l_phone_number;
    }

    public int getQ_idQT() {
        return q_idQT;
    }

    public void setQ_idQT(int q_idQT) {
        this.q_idQT = q_idQT;
    }

    public Date getQ_dIni() {
        return q_dIni;
    }

    public void setQ_dIni(Date q_dIni) {
        this.q_dIni = q_dIni;
    }

    public Date getQ_dFin() {
        return q_dFin;
    }

    public void setQ_dFin(Date q_dFin) {
        this.q_dFin = q_dFin;
    }

    public String getQ_service() {
        return q_service;
    }

    public void setQ_service(String q_service) {
        this.q_service = q_service;
    }


    public String getQ_start_name() {
        return q_start_time;
    }

    public void setQ_start_name(String q_start_name) {
        this.q_start_time = q_start_name;
    }

    public String getQ_service_name() {
        return q_service_name;
    }

    public void setQ_service_name(String q_service_name) {
        this.q_service_name = q_service_name;
    }

    public double getQ_num_calls_queued() {
        return q_num_calls_queued;
    }

    public void setQ_num_calls_queued(double q_num_calls_queued) {
        this.q_num_calls_queued = q_num_calls_queued;
    }

    public Date getQ_total_time_queued() {
        return q_total_time_queued;
    }

    public void setQ_total_time_queued(Date q_total_time_queued) {
        this.q_total_time_queued = q_total_time_queued;
    }

    public Date getQ_average_time_queued() {
        return q_average_time_queued;
    }

    public void setQ_average_time_queued(Date q_average_time_queued) {
        this.q_average_time_queued = q_average_time_queued;
    }

    public Date getQ_abandonment_time_queued() {
        return q_abandonment_time_queued;
    }

    public void setQ_abandonment_time_queued(Date q_abandonment_time_queued) {
        this.q_abandonment_time_queued = q_abandonment_time_queued;
    }

    public double getQ_num_calls_queued_abandoned() {
        return q_num_calls_queued_abandoned;
    }

    public void setQ_num_calls_queued_abandoned(double q_num_calls_queued_abandoned) {
        this.q_num_calls_queued_abandoned = q_num_calls_queued_abandoned;
    }

    public Date getQ_answer_time_queued() {
        return q_answer_time_queued;
    }

    public void setQ_answer_time_queued(Date q_answer_time_queued) {
        this.q_answer_time_queued = q_answer_time_queued;
    }

    public double getQ_num_calls_queued_answered() {
        return q_num_calls_queued_answered;
    }

    public void setQ_num_calls_queued_answered(double q_num_calls_queued_answered) {
        this.q_num_calls_queued_answered = q_num_calls_queued_answered;
    }

    public int getS_idS() {
        return s_idS;
    }

    public void setS_idS(int s_idS) {
        this.s_idS = s_idS;
    }

    public Date getS_dIni() {
        return s_dIni;
    }

    public void setS_dIni(Date s_dIni) {
        this.s_dIni = s_dIni;
    }

    public Date getS_dFin() {
        return s_dFin;
    }

    public void setS_dFin(Date s_dFin) {
        this.s_dFin = s_dFin;
    }

    public String getS_service() {
        return s_service;
    }

    public void setS_service(String s_service) {
        this.s_service = s_service;
    }

    public String getS_start_name() {
        return s_start_name;
    }

    public void setS_start_name(String s_start_name) {
        this.s_start_name = s_start_name;
    }

    public String getS_service_name() {
        return s_service_name;
    }

    public void setS_service_name(String s_service_name) {
        this.s_service_name = s_service_name;
    }

    public double getS_phone_number() {
        return s_phone_number;
    }

    public void setS_phone_number(double s_phone_number) {
        this.s_phone_number = s_phone_number;
    }

    public String getS_FCR() {
        return s_fcr;
    }

    public void setS_FCR(String s_fcr) {
        this.s_fcr = s_fcr;
    }

    public String getS_NPS() {
        return s_nps;
    }

    public void setS_NPS(String s_nps) {
        this.s_nps = s_nps;
    }

    public int getS_CS() {
        return s_cs;
    }

    public void setS_CS(int s_cs) {
        this.s_cs = s_cs;
    }

    public String getS_p1() {
        return s_p1;
    }

    public void setS_p1(String s_p1) {
        this.s_p1 = s_p1;
    }

    public String getS_p2() {
        return s_p2;
    }

    public void setS_p2(String s_p2) {
        this.s_p2 = s_p2;
    }

    public String getS_p3() {
        return s_p3;
    }

    public void setS_p3(String s_p3) {
        this.s_p3 = s_p3;
    }

    public String getS_p4() {
        return s_p4;
    }

    public void setS_p4(String s_p4) {
        this.s_p4 = s_p4;
    }

    public String getS_p5() {
        return s_p5;
    }

    public void setS_p5(String s_p5) {
        this.s_p5 = s_p5;
    }

    public String getS_p6() {
        return s_p6;
    }

    public void setS_p6(String s_p6) {
        this.s_p6 = s_p6;
    }

    public String getS_p7() {
        return s_p7;
    }

    public void setS_p7(String s_p7) {
        this.s_p7 = s_p7;
    }

    public String getS_p8() {
        return s_p8;
    }

    public void setS_p8(String s_p8) {
        this.s_p8 = s_p8;
    }

    public String getS_p9() {
        return s_p9;
    }

    public void setS_p9(String s_p9) {
        this.s_p9 = s_p9;
    }
}
