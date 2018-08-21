package com.cg.spring.Project.bean;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_customer")
public class BankCustomer {

	@Id
	@Column(name = "Acc_num")
	private int accountNumber;

	public BankCustomer(int accountNumber, int cartId, String debitCardName, double debitCardNum,
			String creditCardName, double creditCardNum, int debitCvv, int creditCvv, double cbalance, Date debitExp,
			Date creditExp) {
		super();
		this.accountNumber = accountNumber;
		this.cartId = cartId;
		this.debitCardName = debitCardName;
		this.debitCardNum = debitCardNum;
		this.creditCardName = creditCardName;
		this.creditCardNum = creditCardNum;
		this.debitCvv = debitCvv;
		this.creditCvv = creditCvv;
		this.cbalance = cbalance;
		this.debitExp = debitExp;
		this.creditExp = creditExp;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	@Column(name="cart_id")
	private int cartId;
	
	@Column(name = "debit_name")
	private String debitCardName;

	public int getAccountNumber() {
		return accountNumber;
	}

	public BankCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDebitCardName() {
		return debitCardName;
	}

	public void setDebitCardName(String debitCardName) {
		this.debitCardName = debitCardName;
	}

	public double getDebitCardNum() {
		return debitCardNum;
	}

	public void setDebitCardNum(double debitCardNum) {
		this.debitCardNum = debitCardNum;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public double getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(double creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public int getDebitCvv() {
		return debitCvv;
	}

	public void setDebitCvv(int debitCvv) {
		this.debitCvv = debitCvv;
	}

	public int getCreditCvv() {
		return creditCvv;
	}

	public void setCreditCvv(int creditCvv) {
		this.creditCvv = creditCvv;
	}

	public double getCbalance() {
		return cbalance;
	}

	public void setCbalance(double cbalance) {
		this.cbalance = cbalance;
	}

	public Date getDebitExp() {
		return debitExp;
	}

	public void setDebitExp(Date debitExp) {
		this.debitExp = debitExp;
	}

	public Date getCreditExp() {
		return creditExp;
	}

	public void setCreditExp(Date creditExp) {
		this.creditExp = creditExp;
	}

	@Column(name = "debit_num")
	private double debitCardNum;

	@Column(name = "credit_name")
	private String creditCardName;

	@Column(name = "credit_num")
	private double creditCardNum;

	@Column(name = "debit_cvv")
	private int debitCvv;

	@Column(name = "credit_cvv")
	private int creditCvv;

	@Column(name = "cbalance")
	private double cbalance;
	
	@Column(name="debit_exp")
	private Date debitExp;
	
	@Column(name="credit_exp")
	private Date creditExp;
	
	
	
}
