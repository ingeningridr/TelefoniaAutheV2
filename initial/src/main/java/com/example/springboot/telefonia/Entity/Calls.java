package initial.src.main.java.com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Calls implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idCalls")
    private int idCalls;
    @Column(name = "dIni")
    private Date dIni;
    @Column(name = "dFin")
    private Date dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "start_time")
    private String service_name;
    @Column(name = "phone_number")
    private double phone_number;



    protected  Calls(){

    }

    public void Calls(int idCalls, Date dIni, Date dFin, String service, Date start_time, String service_name, double phone_number ){
        this.idCalls = idCalls;
        this.dIni = dIni;
        this.dFin = dFin;
        this.service = service;
        this.start_time = start_time;
        this.service_name = service_name;
        this.phone_number = phone_number;


    }
    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
        return String.format("Calls[idCalls=%d, dIni ='%s', dFin ='%s', service ='%s', start_time ='%s', service_name ='%s', phone_number ='%s']");
    }

    public int getIdCalls() {

        return idCalls;
    }

    public void setIdCalls(int idCalls) {

        this.idCalls = idCalls;
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

    public double getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(double phone_number) {

        this.phone_number = phone_number;
    }


}
