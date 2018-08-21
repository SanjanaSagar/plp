package com.cg.spring.Project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.Project.bean.BankCustomer;

@Repository("dao")
public interface TransactionDao extends CrudRepository<BankCustomer, Integer>{

}
