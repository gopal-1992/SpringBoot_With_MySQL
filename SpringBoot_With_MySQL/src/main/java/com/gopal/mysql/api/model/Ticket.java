package com.gopal.mysql.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	@GeneratedValue
	private Integer id;
	private double amount;
	private String catagory;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int id, double amount, String catagory) {
		super();
		this.id = id;
		this.amount = amount;
		this.catagory = catagory;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
  
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", catagory=" + catagory + "]";
	}
}
