package com.cg.spring.Project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transactions")
public class Transactions {

	@Id
	@Column(name="admin_id")
	private int adminId;
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Column(name="cap_revenue")
	private double capRevenue;

	public double getCapRevenue() {
		return capRevenue;
	}

	public void setCapRevenue(double capRevenue) {
		this.capRevenue = capRevenue;
	}

	public Transactions(double capRevenue) {
		super();
		this.capRevenue = capRevenue;
	}

	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
