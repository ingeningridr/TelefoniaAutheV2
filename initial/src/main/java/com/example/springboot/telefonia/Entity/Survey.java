package initial.src.main.java.com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Survey implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idS")
    private int idS;
    @Column(name = "dIni")
    private Date dIni;
    @Column(name = "dFin")
    private Date dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "start_name")
    private String start_name;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "phone_number")
    private double phone_number;
    @Column(name = "fcr")
    private String fcr;
    @Column(name = "nps")
    private String nps;
    @Column(name = "cs")
    private int cs;
    @Column(name = "p1")
    private String p1;
    @Column(name = "p2")
    private String p2;
    @Column(name = "p3")
    private String p3;
    @Column(name = "p4")
    private String p4;
    @Column(name = "p5")
    private String p5;
    @Column(name = "p6")
    private String p6;
    @Column(name = "p7")
    private String p7;
    @Column(name = "p8")
    private String p8;
    @Column(name = "p9")
    private String p9;

    protected Survey(){

    }

    public void Survey(int idS,Date dIni, Date dFin, String service, String start_name, String service_name, double phone_number,
    String fcr, String nps, int cs, String p1, String p2, String p3, String p4, String p5, String p6,
     String p7, String p8, String p9){

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
    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
     return String.format("Survey[idS=%d, dIni ='%s', dFin ='%s', service ='%s',survey='%s', start_name ='%s', service_name ='%s', phone_number ='%s', fcr ='%s', nps ='%s', cs ='%s', p1='%s', p2='%s', p3='%s', p4='%s', p5='%s',p6='%s', p7='%s', p8='%s', p9='%s']");
    }

    public int getIdS() {

        return idS;
    }

    public void setIdS(int idS) {

        this.idS = idS;
    }

    public Date getdIni() {

        return dIni;
    }

    public void setdIni(Date dIni) {

        this.dIni = dIni;
    }

    public Date getdFin() {

        return dFin;
    }

    public void setdFin(Date dFin) {

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
