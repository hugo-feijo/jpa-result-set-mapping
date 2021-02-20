package com.hugo.resultset.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    private String employeeName;
    private String job;
    private String description;
    private String companyName;
    private String ein;
}
