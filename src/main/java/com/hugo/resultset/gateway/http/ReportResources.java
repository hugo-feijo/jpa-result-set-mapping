package com.hugo.resultset.gateway.http;

import com.hugo.resultset.domain.Report;
import com.hugo.resultset.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportResources {
    @Autowired
    private ReportService reportService;

    @GetMapping(value = "/employee")
    public ResponseEntity<List<Report>> getReportWhereEmployeeHiredDateIsBefore(@RequestParam("hiredDate") Date hiredDate) {
        return ResponseEntity.ok(reportService.getReportWhereEmployeeHiredDateIsBefore(hiredDate));
    }
}
