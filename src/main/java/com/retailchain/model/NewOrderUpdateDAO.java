package com.retailchain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "flipkart_order")
public class NewOrderUpdateDAO {
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Id
	 private String orderId;
	 private String orderDescription;
	 private String phoneNumber;
	 

}
