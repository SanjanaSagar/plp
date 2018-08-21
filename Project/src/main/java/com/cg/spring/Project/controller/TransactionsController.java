package com.cg.spring.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.spring.Project.bean.BankCustomer;
import com.cg.spring.Project.service.TransactionService;

@Controller
public class TransactionsController {

	@Autowired
	TransactionService service;

	@RequestMapping("/PaymentMethod")
	public String paymentMethod() {

		return "PaymentMethod";
	}

	@RequestMapping(value="/debit", method = RequestMethod.GET)
	public String debit(@ModelAttribute("deb") BankCustomer customer) {

		return "Debit";

	}

	@RequestMapping(value="/Credit", method = RequestMethod.GET)
	public String credit(@ModelAttribute("cre") BankCustomer customer) {

		return "Credit";

	}

	@RequestMapping("/Cod")
	public String cod() {

		return "Cod";
	}

	@RequestMapping(value="/checkdebit", method = RequestMethod.POST)
	public String checkDebit(@ModelAttribute("deb") BankCustomer customer,BindingResult bindingResult) {

		if (service.checkDeb(customer)) {

			return "Success";
		} else {
			return "Fail";

		}

	}

	@RequestMapping(value="/checkcredit", method = RequestMethod.GET)
	public String checkCredit(@ModelAttribute("cre") BankCustomer customer) {
		
		if (service.checkCre(customer)) {

			return "Success";
		} else {
			return "Fail";

		}

	}
	

}
