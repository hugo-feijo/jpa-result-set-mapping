package com.hugo.resultset.config;

import com.hugo.resultset.domain.Report;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.MappedSuperclass;
import javax.persistence.SqlResultSetMapping;

@MappedSuperclass
@SqlResultSetMapping(
        name = "report_mapping",
        classes = {
                @ConstructorResult(
                        targetClass = Report.class,
                        columns = {
                                @ColumnResult(name = "employeeName", type = String.class),
                                @ColumnResult(name = "job", type = String.class),
                                @ColumnResult(name = "description", type = String.class),
                                @ColumnResult(name = "companyName", type = String.class),
                                @ColumnResult(name = "ein", type = String.class)
                        }

                )
        }
)
public abstract class ResultSetMappingConfig {
}
