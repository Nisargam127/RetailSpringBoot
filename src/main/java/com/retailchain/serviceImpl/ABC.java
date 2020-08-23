package com.retailchain.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.retailchain.model.NewOrderUpdateDAO;
import com.retailchain.model.OrderResponseModel;
import com.retailchain.model.OrderUpdateDAO;
import com.retailchain.model.PojoClass;
import com.retailchain.repository.NewOrderUpdateRepository;
import com.retailchain.repository.OrderUpdateRepository;
import com.retailchain.service.OrderService;


@Service
@Qualifier("ABC")
public class ABC implements OrderService{
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	public OrderUpdateRepository orderRepository;
    
/*	@Autowired
	public  NewOrderUpdateRepository neworderRepository;*/
	
	public static String abc (String phoneNum)
	{
		
		System.out.println("am abc method");
		return "word";
		
	}
	
	
	public  String updateOrder(String orderID ) {
		OrderUpdateDAO orderUpdate = new OrderUpdateDAO();
		orderUpdate.setOrderId(orderID);
		orderUpdate.setOrderDescription("liking shoes");
		orderUpdate.setPhoneNumber("123456789");
		
		orderRepository.saveAndFlush(orderUpdate);
		
		OrderUpdateDAO orderUpdateTwo = new OrderUpdateDAO("abc007", "liking dress", "321456");
		orderRepository.saveAndFlush(orderUpdateTwo);
		
		return "pass";
	}
	

	@Override
	public OrderResponseModel orderUpdate(String orderID) {
		
		/*System.out.println("am inside abc class");
     	String url="http://127.0.0.1:9001/api/v1/retail/orderCancel?orderID=MNBV12&phoneNum=142536";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, null, String.class);
    	//System.out.println(response.getStatusCode());
    	System.out.println(response.getHeaders());
		System.out.println(response.getBody());
		/*String url="http://127.0.0.1:9001/api/v1/retail/detailUpdate?updateId=156";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, null, String.class);
	
		System.out.println(response.getBody());*/
	OrderUpdateDAO orderUpdate = new OrderUpdateDAO();
		orderUpdate.setOrderId(orderID);
		orderUpdate.setOrderDescription("liking shoes");
		orderUpdate.setPhoneNumber("123456789");
		
		orderRepository.save(orderUpdate);
		
	/*	OrderUpdateDAO orderUpdateTwo = new OrderUpdateDAO("abc007", "liking dress", "321456");
		orderRepository.save(orderUpdateTwo);*/
		
		
	/*	NewOrderUpdateDAO neworderUpdate = new NewOrderUpdateDAO();
		neworderUpdate.setOrderId(orderID);
		neworderUpdate.setOrderDescription("liking earings");
		neworderUpdate.setPhoneNumber("123456789");
		
		neworderRepository.save(neworderUpdate);*/
		return null;
		
		
	}


	@Override
	public OrderResponseModel orderCancel(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PojoClass orderRetrival(String orderDescription) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
