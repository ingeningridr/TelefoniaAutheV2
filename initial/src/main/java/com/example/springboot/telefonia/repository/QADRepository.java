package initial.src.main.java.com.example.springboot.telefonia.repository;

import initial.src.main.java.com.example.springboot.telefonia.dto.CustomResponse;
import initial.src.main.java.com.example.springboot.telefonia.Entity.Authenticate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class QADRepository implements CrudRepository<Authenticate, Long> {

    @Query("select new com.example.springboot.dto.CustomResponse (Authenticate, Calls, HandlingTime, LostCalls, QueueTime, Survey," +
            "    a.idAuthenticate," +
            "    a.keyA," +
            "    a.token," +
            "    c.idCalls," +
            "    c.dIini," +
            "    c.dFin," +
            "    c.service," +
            "    c.start_time," +
            "    c.service_name," +
            "    c.phone_number," +
            "    h.idHT," +
            "    h.dIini," +
            "    h.dFin," +
            "    h.service," +
            "    h.start_time," +
            "    h.service_name," +
            "    h.num_calls_answered," +
            "    h.handling_time," +
            "    h.average_handling_time," +
            "    h.talk_time_ine," +
            "    h.average_talk_time_in," +
            "    l.idLC," +
            "    l.dIini," +
            "    l.dFin," +
            "    l.service," +
            "    l.start_time," +
            "    l.service_name," +
            "    l.phone_number," +
            "    q.idQT," +
            "    q.dIini," +
            "    q.dFin," +
            "    q.service," +
            "    q.queueTime," +
            "    q.start_name," +
            "    q.Service_name," +
            "    q.num_calls_queued," +
            "    q.total_time_queued," +
            "    q.average_time_queued," +
            "    q.abandonment_time_queued," +
            "    q.num_calls_queued_abandoned," +
            "    q.answer_time_queued," +
            "    q.num_calls_queued_answered," +
            "    s.idS," +
            "    s.dIini," +
            "    s.dFin," +
            "    s.service," +
            "    s.survey," +
            "    s.start_time," +
            "    s.Service_name," +
            "    s.phone_number," +
            "    s.fcr," +
            "    s.nps," +
            "    s.cs," +
            "    s.p1," +
            "    s.p2," +
            "    s.p3," +
            "    s.p4," +
            "    s.p5," +
            "    s.p6," +
            "    s.p7," +
            "    s.p8," +
            "    s.p9," +
            "    a.idAuthenticate, SUM(a.idAuthenticate) as canAtidad, c.idCalls + '-' + c.idCalls as consecutivo, h.idHT + '-' + h.idHT as consecutivo, l.idLC + '-' + l.idLC as consecutivo, l.idQT + '-' + l.idQT as consecutivo, , l.idS + '-' + l.idS as consecutivo) from Authenticate a, Calls c, HandlingTime h, LostCalls l, QueueTime q, Survey s" +
            "    WHERE a.Authenticate = 'idAuthenticate' AND" +
            "    a.keyA  = 'CCoD_Application'  AND" +
            "    a.keyA  = 'MFh5dndvXzAmTVFPb1l4Vj92bFAsbz5pKil8Ingw'  AND" +
            "    a.idAuthenticate > 0 AND " +
            "    AND c.idCalls = '1' AND " +
            "    c.dIni = '1' AND " +
            "    c.dFin = '2022-02-24' AND " +
            "    c.service = '2022-02-24' AND " +
            "    c.start_time = 'x' AND " +
            "    c.service_name = 'x' AND " +
            "    c.phone_number= '3142776417' AND " +
            "    AND h.idHT  = '1'  AND" +
            "    h.dIini = '2022-02-24' AND " +
            "    h.dFin = '2022-02-24' AND " +
            "    h.service = 'x' AND " +
            "    h.start_time = 'x' AND " +
            "    h.service_name= 'x' AND " +
            "    h.num_calls_answered= '2' AND " +
            "    h.handling_time= '2022-02-24' AND " +
            "    h.average_handling_time= '2022-02-24' AND " +
            "    h.talk_time_ine= '2022-02-24' AND " +
            "    h.average_talk_time_in= '2022-02-24' AND " +
            "    AND l.idLC= '1' AND " +
            "    l.dIini= '2022-02-24' AND " +
            "    l.dFin= '2022-02-24' AND " +
            "    l.service= 'x' AND " +
            "    l.start_time= 'x' AND " +
            "    l.service_name= '1' AND " +
            "    l.phone_number= '3142776417' AND " +
            "    AND q.idQT = '1' AND " +
            "    q.dIini = '2022-02-24' AND " +
            "    q.dFin = '2022-02-24' AND " +
            "    q.service = 'QueueT' AND " +
            "    q.queueTime = CURRENT_TIMESTAMP AND " +
            "    q.start_time = 'x' AND " +
            "    q.Service_name = 'x' AND " +
            "    q.num_calls_queued = '2' AND " +
            "    q.total_time_queued = '2022-02-24' AND " +
            "    q.average_time_queued = '2022-02-24' AND " +
            "    q.abandonment_time_queued = '2022-02-24' AND " +
            "    q.num_calls_queued_abandoned = '1' AND " +
            "    q.answer_time_queued = '2022-02-24' AND " +
            "    q.num_calls_queued_answered = '1' AND " +
            "    AND s.idS = '1' AND " +
            "    s.dIini = '2022-02-24' AND " +
            "    s.dFin = '2022-02-24' AND " +
            "    s.service = 'x' AND " +
            "    s.survey = '1' AND " +
            "    s.start_name = 'x' AND " +
            "    s.Service_name = 'x' AND " +
            "    s.phone_number = '3142776417' AND " +
            "    s.fcr = '1' AND " +
            "    s.nps = '1' AND " +
            "    s.cs = '1' AND " +
            "    s.p1 = '0' AND " +
            "    s.p2 = '0' AND " +
            "    s.p3 = '0' AND " +
            "    s.p4 = '0' AND " +
            "    s.p5 = '0' AND " +
            "    s.p6 = '0' AND " +
            "    s.p7 = '0' AND " +
            "    s.p8 = '0' AND " +
            "    s.p9 = '0' AND " +
            "    a.Authenticate > 0 AND " +
            "    ORDER BY a.Authenticate 'idAuthenticate' AND+, " +
            "    c.Calls 'idCalls' AND+, " +
            "    h.HT 'idHandlingTime' AND+, " +
            "    l.LostCalls 'idLC'  AND+, " +
            "    q.idQueueTime idLC' AND, " +
            "    s.idS idSurvey' = Authenticate")

    List<CustomResponse> getInfoFromQAD() {

        return null;
    }


    @Override
    public <S extends Authenticate> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Authenticate> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Authenticate> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Authenticate> findAll() {
        return null;
    }

    @Override
    public Iterable<Authenticate> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Authenticate entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Authenticate> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
