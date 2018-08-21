package com.cg.spring.Project.service;

import com.cg.spring.Project.bean.BankCustomer;

public interface TransactionService {

	public boolean checkDeb(BankCustomer customer);
	
	public boolean checkCre(BankCustomer customer);
	
	
	
}
