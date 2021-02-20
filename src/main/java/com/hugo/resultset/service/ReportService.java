package com.hugo.resultset.service;

import com.hugo.resultset.domain.Report;
import com.hugo.resultset.repository.report.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public List<Report> getReportWhereEmployeeHiredDateIsBefore(Date hiredDate) {
        return reportRepository.getReportWhereEmployeeHiredDateIsBefore(hiredDate);
    }
}
