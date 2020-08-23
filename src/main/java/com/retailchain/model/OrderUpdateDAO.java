package com.retailchain.model;

import java.beans.JavaBean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;


@Entity
@javax.persistence.Table(name = "amazon_order")
public class OrderUpdateDAO {
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
 
 public OrderUpdateDAO(String orderId,String orderDescription, String phoneNumber  )
 {
	 this.orderId=orderId;
	 this.orderDescription=orderDescription;
	 this.phoneNumber=phoneNumber;
	 
 }
 
 public OrderUpdateDAO()
 {
	 
 }
 
}


