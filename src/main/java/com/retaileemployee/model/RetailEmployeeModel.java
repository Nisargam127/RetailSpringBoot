package com.retaileemployee.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.retailchain.model.OrderResponseModel;
import com.retailchain.service.OrderService;


@Service
@Qualifier("RetailEmployee")
public class RetailEmployeeModel 
{
//	@Autowired
//	public RestTemplate restTemplate;
	
	private String employeeID;
	private String employeeName;
	private int employeePhoneNum;
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeePhoneNum() {
		return employeePhoneNum;
	}
	public void setEmployeePhoneNum(int employeePhoneNum) {
		this.employeePhoneNum = employeePhoneNum;
	}
	
	

}
