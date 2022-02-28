package initial.src.main.java.com.example.springboot.telefonia.Entity;

import org.springframework.web.bind.annotation.RequestParam;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class HandlingTime implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idHT")
    private int idHT;
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
    @Column(name = "num_calls_answered")
    private double num_calls_answered;
    @Column(name = "handling_time")
    private Date handling_time;
    @Column(name = "average_handling_time")
    private Date average_handling_time;
    @Column(name = "talk_time_in")
    private Date talk_time_in;
    @Column(name = "average_talk_time_in")
    private Date average_talk_time_in;


    protected HandlingTime(){

    }
    public void HandlingTime(int idHT, Date dIni, Date dFin, String service, String start_name, String  service_name, double num_calls_answered,
    Date handling_time, Date average_handling_time, Date talk_time_in, Date average_talk_time_in ){

       this.idHT = idHT;
       this.dIni = dIni;
       this.dFin = dFin;
       this.service = service;
       this.start_name = start_name;
       this.service_name = service_name;
       this.num_calls_answered = num_calls_answered;
       this.handling_time = handling_time;
       this.average_handling_time = average_handling_time;
       this.talk_time_in = talk_time_in;
       this.average_talk_time_in = average_talk_time_in;


    }
    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
        return String.format("HandlingTime[idHT=%d,dIni ='%s', dFin ='%s', service ='%s',start_name='%s', service_name ='%s', num_calls_answered ='%s', handling_time ='%s', average_handling_time ='%s',talk_time_in ='%s', average_talk_time_in ='%s']");
    }

    public int getIdHT() {

        return idHT;
    }

    public void setIdHT(int idHT) {

        this.idHT = idHT;
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

}
