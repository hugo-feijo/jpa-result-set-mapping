package com.hugo.resultset.repository.employee;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ReportRepositoryImpl implements ReportRepositoryCustom {

    @PersistenceContext
    private EntityManager em;


}
