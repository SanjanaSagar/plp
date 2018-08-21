package com.cg.spring.Project.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@Column(name="cart_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	
	
	
	@Column(name="cart_amt")
	private double cartAmount;



	public int getCartId() {
		return cartId;
	}



	public Cart(int cartId, double cartAmount) {
		super();
		this.cartId = cartId;
		this.cartAmount = cartAmount;
	}



	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setCartId(int cartId) {
		this.cartId = cartId;
	}



	public double getCartAmount() {
		return cartAmount;
	}



	public void setCartAmount(double cartAmount) {
		this.cartAmount = cartAmount;
	}
	
	
	/*@ManyToMany(cascade=CascadeType.ALL)
	private List<Product> products;*/
	
	
}
