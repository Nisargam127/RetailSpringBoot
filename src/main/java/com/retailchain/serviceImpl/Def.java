package com.retailchain.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.retailchain.model.NewOrderUpdateDAO;
import com.retailchain.model.OrderResponseModel;
import com.retailchain.model.PojoClass;
import com.retailchain.repository.NewOrderUpdateRepository;
import com.retailchain.repository.PojoRepository;
import com.retailchain.service.OrderService;

@Component
@Qualifier("Def")
public class Def implements OrderService{
	
@Autowired
	public RestTemplate restTemplate;

@Autowired
public  NewOrderUpdateRepository neworderRepository;
@Autowired
public PojoRepository pojo;


@Override
public OrderResponseModel orderCancel(String orderID) {
	NewOrderUpdateDAO neworderUpdate = new NewOrderUpdateDAO();
	neworderUpdate.setOrderId("n127");
	neworderUpdate.setOrderDescription("liking earings");
	neworderUpdate.setPhoneNumber("8904462383");
	
	neworderRepository.save(neworderUpdate);
	
	PojoClass pojoclass = new PojoClass();
	pojoclass.setOrderId("xyz");
	pojoclass.setOrderDescription("liking cosmetics");
	pojoclass.setPhoneNumber("9538262100");
	
	pojo.save(pojoclass);
	
	
	
	
	return null;
}


@Override
public OrderResponseModel orderUpdate(String orderID) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public PojoClass orderRetrival(String orderDescription ) {
	// TODO Auto-generated method stub
	
PojoClass orderFetch = pojo.findAllByOrderId(orderDescription);
String orderDescriptiontwo = "liking cosmetics";
PojoClass orderFetchTwo = pojo.findAllByOrderDescription(orderDescriptiontwo);

	return orderFetchTwo;

}




	/*@Override
	public OrderResponseModel orderUpdate() {
	/*String url="http://127.0.0.1:9001/api/v1/retail/detailUpdate?updateId=156";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, null, String.class);
	
	    System.out.println(response.getBody());
	    System.out.println(response.getStatusCode());
		System.out.println("am inside def class");
		// TODO Auto-generated method stub*/

		//return null;
	}



