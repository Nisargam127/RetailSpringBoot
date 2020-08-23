package com.retailchain.service;

import org.springframework.stereotype.Component;

import com.retailchain.model.OrderResponseModel;
import com.retailchain.model.PojoClass;

public interface OrderService {
	public OrderResponseModel orderUpdate(String orderID);

	public OrderResponseModel orderCancel(String orderID);
	
	public PojoClass orderRetrival(String orderDescription);
		
	

}
