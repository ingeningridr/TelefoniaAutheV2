package initial.src.main.java.com.example.springboot.telefonia.Entity;

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

    private Object GenerationType;
    @Id
    @GeneratedValue(strategy= javax.persistence.GenerationType.AUTO)
    @Column(name = "idQT")
    private int idQT;
    @Column(name = "idQT")
    private Date dIni;
    @Column(name = "dFin")
    private Date dFin;
    @Column(name = "service")
    private String service;
    @Column(name = "queueTime")
    private Date queueTime;
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "num_calls_queued")
    private double num_calls_queued;
    @Column(name = "total_time_queued")
    private Date total_time_queued;
    @Column(name = "average_time_queued")
    private Date average_time_queued;
    @Column(name = "abandonment_time_queued")
    private Date abandonment_time_queued;
    @Column(name = "num_calls_queued_abandoned")
    private double num_calls_queued_abandoned;
    @Column(name = "answer_time_queued")
    private Date answer_time_queued;
    @Column(name = "num_calls_queued_answered")
    private double num_calls_queued_answered;



protected QueueTime(){

}
    public void LostCalls(int idQT, Date dIni, Date dFin, String service,Date queueTime, Date start_time, String service_name, double num_calls_queued,
    Date total_time_queued, Date average_time_queued, Date abandonment_time_queued, double num_calls_queued_abandoned,
    Date answer_time_queued, double num_calls_queued_answered){

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

    @Override
    //This toString method print outs the Ld_det properties.
    public String toString() {
    return String.format("QueueTime[idQT=%d,dIni ='%s', dFin ='%s', service ='%s', queueTime='%s', start_name ='%s', service_name ='%s', num_calls_queued ='%s', total_time_queued ='%s', average_time_queued ='%s', abandonment_time_queued ='%s', num_calls_queued_abandoned='%s', answer_time_queued='%s', num_calls_queued_answered='%s']");
    }

    public int getIdQT() {

        return idQT;
    }

    public void setIdQT(int idQT) {

        this.idQT = idQT;
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

    public Date getQueueTime() {

        return queueTime;
    }

    public void setQueueTime(Date queueTime) {

        this.queueTime = queueTime;
    }

    public Date getStart_time() {

        return start_time;
    }

    public void setStart_name(Date start_time) {

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