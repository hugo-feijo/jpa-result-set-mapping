package com.hugo.resultset.repository.report;

import com.hugo.resultset.domain.Report;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Date;
import java.util.List;

@Repository
public class ReportRepositoryImpl implements ReportRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Report> getReportWhereEmployeeHiredDateIsBefore(Date hiredDate) {
        Query query = em.createNativeQuery(
                "SELECT "                       +
                        "e.name AS employeeName, " +
                        "e.job, "                  +
                        "e.description, "          +
                        "c.name AS companyName, "  +
                        "c.ein "                   +
                   "FROM "                         +
                        "employee e "              +
                   "INNER JOIN "                   +
                        "company c "               +
                   "ON "                           +
                        "c.id = e.id_company "      +
                   "WHERE "                         +
                        "e.hired_date < DATE(?1)","report_mapping");
        query.setParameter(1, hiredDate);

        return query.getResultList();
    }

}
