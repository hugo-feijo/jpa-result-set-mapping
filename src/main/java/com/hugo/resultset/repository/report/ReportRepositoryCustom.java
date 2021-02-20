package com.hugo.resultset.repository.report;

import com.hugo.resultset.domain.Report;

import java.sql.Date;
import java.util.List;

public interface ReportRepositoryCustom {
    List<Report> getReportWhereEmployeeHiredDateIsBefore(Date hiredDate);
}
