package initial.src.main.java.com.example.springboot.telefonia.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class LostCalls implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idLC")
    private int idLC;
    @Column(name = "dIni")
    private Date dIni;
    @Column(name = "dFin")
    private Date dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "lostCalls")
    private String lostCalls;
    @Column(name = "start_name")
    private String start_name;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "phone_number")
    private double phone_number;


    protected  LostCalls(){

    }
    public void LostCalls(int idLC,Date dIni, Date dFin, String service,String lostCalls, String start_name, String service_name, double phone_number){

        this.idLC = idLC;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.idLC = idLC;
        this.lostCalls = lostCalls;
        this.start_name = start_name;
        this.service_name = service_name;
        this.phone_number = phone_number;

    }

    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
        return String.format("LostCalls[idLC=%d, dIni ='%s', dFin ='%s', service ='%s',lostCalls='%s', start_name ='%s', service_name ='%s', phone_number ='%s']");
    }

    public int getIdLC() {

        return idLC;
    }

    public void setIdLC(int idLC) {

        this.idLC = idLC;
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
    public String getLostCalls() {

        return lostCalls;
    }

    public void setLostCalls(String lostCalls) {

        this.lostCalls = lostCalls;
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
