package com.cg.spring.Project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.Project.bean.Transactions;

@Repository("capdao")
public interface CapTransactionDao extends CrudRepository<Transactions, Integer> {

}
