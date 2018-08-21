package com.cg.spring.Project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.Project.bean.BankCustomer;
import com.cg.spring.Project.bean.Cart;
import com.cg.spring.Project.bean.Transactions;
import com.cg.spring.Project.dao.CapTransactionDao;
import com.cg.spring.Project.dao.CartDao;
import com.cg.spring.Project.dao.TransactionDao;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao dao;

	@Autowired
	CartDao cartdao;

	@Autowired
	CapTransactionDao capdao;

	@Override
	public boolean checkDeb(BankCustomer customer) {

		Optional<BankCustomer> tempCust = dao.findById(customer.getAccountNumber());

		BankCustomer temp = tempCust.get();

		double amount = cartdao.findById(temp.getCartId()).get().getCartAmount();

		// checking debit card details
		if (temp.getDebitCardNum() == customer.getDebitCardNum()
				&& temp.getDebitCardName().equals(customer.getDebitCardName())
				&& temp.getDebitCvv() == customer.getDebitCvv() && temp.getDebitExp().equals(customer.getDebitExp())) {

			// debit from customer account
			if (temp.getCbalance() >= amount) {

				temp.setCbalance(temp.getCbalance() - amount);
				dao.save(temp);

				//update cart amount
				cartdao.findById(temp.getCartId()).get().setCartAmount(0);
				
				// crediting to capRevenue
				Transactions trans = capdao.findById(1).get();

				double initialRev = trans.getCapRevenue();

				trans.setCapRevenue(initialRev + amount);

				if (capdao.save(trans).getCapRevenue() != initialRev) {

					return true;
				}

			}

		}
		return false;

	}

	@Override
	public boolean checkCre(BankCustomer customer) {
		
		Optional<BankCustomer> tempCust = dao.findById(customer.getAccountNumber());

		BankCustomer temp = tempCust.get();

		double amount = cartdao.findById(temp.getCartId()).get().getCartAmount();

		// checking debit card details
		if (temp.getCreditCardNum() == customer.getCreditCardNum()
				&& temp.getCreditCardName().equals(customer.getCreditCardName())
				&& temp.getCreditCvv() == customer.getCreditCvv() && temp.getCreditExp().equals(customer.getCreditExp())) {

			// debit from customer account
			if (temp.getCbalance() >= amount) {

				temp.setCbalance(temp.getCbalance() - amount);
				dao.save(temp);

				//update cart amount
				cartdao.findById(temp.getCartId()).get().setCartAmount(0);
				
				// crediting to capRevenue
				Transactions trans = capdao.findById(1).get();

				double initialRev = trans.getCapRevenue();

				trans.setCapRevenue(initialRev + amount);

				if (capdao.save(trans).getCapRevenue() != initialRev) {

					return true;
				}

			}

		}
		return false;
	}

	
}
