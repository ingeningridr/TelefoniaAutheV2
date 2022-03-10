package com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "\"Boomi_Survey\"")
public class Survey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "s_IdS")
    private int idS;
    @Column(name = "s_DIni")
    private String dIni;
    @Column(name = "s_DFin")
    private String dFin;
    @Column(name = "s_Service")
    private String service;
    @Column(name = "s_StartName")
    private String start_name;
    @Column(name = "s_ServiceName")
    private String service_name;
    @Column(name = "s_PhoneNumber")
    private double phone_number;
    @Column(name = "s_Fcr")
    private String fcr;
    @Column(name = "s_Nps")
    private String nps;
    @Column(name = "s_Cs")
    private int cs;
    @Column(name = "s_P1")
    private String p1;
    @Column(name = "s_P2")
    private String p2;
    @Column(name = "s_P3")
    private String p3;
    @Column(name = "s_P4")
    private String p4;
    @Column(name = "s_P5")
    private String p5;
    @Column(name = "s_P6")
    private String p6;
    @Column(name = "s_P7")
    private String p7;
    @Column(name = "s_P8")
    private String p8;
    @Column(name = "s_P9")
    private String p9;

    public Survey(){

    }

    public Survey(int idS, String dIni, String dFin, String service, String start_name, String service_name, double phone_number, String fcr, String nps, int cs, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9) {
        this.idS = idS;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_name = start_name;
        this.service_name = service_name;
        this.phone_number = phone_number;
        this.fcr = fcr;
        this.nps = nps;
        this.cs = cs;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
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

    public String getFcr() {
        return fcr;
    }

    public void setFcr(String fcr) {
        this.fcr = fcr;
    }

    public String getNps() {
        return nps;
    }

    public void setNps(String nps) {
        this.nps = nps;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public String getP7() {
        return p7;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public String getP8() {
        return p8;
    }

    public void setP8(String p8) {
        this.p8 = p8;
    }

    public String getP9() {
        return p9;
    }

    public void setP9(String p9) {
        this.p9 = p9;
    }
}
