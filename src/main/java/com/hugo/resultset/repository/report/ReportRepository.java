package com.hugo.resultset.repository.report;

import com.hugo.resultset.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReportRepository extends JpaRepository<Employee, UUID>, ReportRepositoryCustom {
}
