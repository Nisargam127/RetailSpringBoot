package com.retailchain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retailchain.RetailchainApplication;
import com.retailchain.model.OrderDetailsModel;
import com.retailchain.model.OrderResponseModel;
import com.retailchain.model.PojoClass;
import com.retailchain.model.RefundResponse;
import com.retailchain.repository.OrderUpdateRepository;
import com.retailchain.repository.PojoRepository;
import com.retailchain.service.OrderService;
import com.retailchain.serviceImpl.ABC;
import com.retailchain.serviceImpl.EmployeeStatusImpl;

import com.retaileemployee.model.RetailEmployeeModel;

@RestController
@RequestMapping("/retail")
public class RetailController {
	@Autowired(required = true)
	@Qualifier("Def")
	private OrderService orderserviceDef;

	@Autowired(required = true)
	@Qualifier("ABC")
	private OrderService orderserviceAbc;

	@Autowired(required = true)
	public EmployeeStatusImpl emp;

	/*
	 * @Autowired public OrderUpdateDAO orderDAO;
	 */

	/*
	 * @Autowired OrderUpdateRepository orderUpdate;
	 */

	/*
	 * @Autowired(required=true)
	 * 
	 * @Qualifier("RetailEmployee") private OrderService orderserviceRetailEmployee;
	 */

	// @Autowired
	// public X update;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String databaseLogin() {
		System.out.println("Login to database");
		return "Login to database";
	}

	@GetMapping(value = "/orderDetails/{orderDescription}")
	public PojoClass orderDetails(@PathVariable String  orderDescription ) {

		//System.out.println("orderID is " + orderID);
	PojoClass	pojoOrder = orderserviceDef.orderRetrival(orderDescription);
		return pojoOrder;
		

	}

	@PutMapping(value = "/orderCancel")
	public OrderResponseModel orderDetail(@RequestParam String orderID, @RequestParam String phoneNum) {
		OrderResponseModel response = orderserviceDef.orderCancel(orderID);
		return response;

	}

	
	  @PutMapping(value = "/orderUpdate")
	  public OrderResponseModel orderDetails(@RequestParam String orderID ,@RequestParam String phoneNum) {
	  
	 OrderResponseModel response = orderserviceAbc.orderUpdate(orderID);
	 
	  return response; }
	
	@PutMapping(value = "/orderInsert")
	public String orderInsert(@RequestBody OrderDetailsModel orderDetailsBody) {
		String orderID = orderDetailsBody.getOrderID();
		String orderDate = orderDetailsBody.getOrderDate();
		String orderDescription = orderDetailsBody.getOrderDescription();
		String orderUserId = orderDetailsBody.getOrderUserId();

		System.out.println("orderedProductID is " + orderID + " " + " OrderDate is" + orderDate + " "
				+ "OrderDescription is" + orderDescription + " " + "OrderUserId is" + orderUserId);
		return "abc";
		// return "orderedProductName is " + orderName + " " + "orderID is" +" " +
		// orderID +" " + "phoneNum is " + phoneNum;
	}

	@DeleteMapping(value = "/employeeDetail")
	public RetailEmployeeModel employeeDetail(@RequestBody RetailEmployeeModel retailEmployeeBody) {
		RetailEmployeeModel retail = new RetailEmployeeModel();
		String employeeID = retailEmployeeBody.getEmployeeID();
		String employeeName = retailEmployeeBody.getEmployeeName();
		int employeePhoneNum = retailEmployeeBody.getEmployeePhoneNum();

		System.out.println("orderedProductID is " + employeeID + " " + " name is " + employeeName + " " + "num is "
				+ employeePhoneNum);

		return retail;
	}

	@GetMapping(value = "/orderInsert/{orderId}")
	public OrderResponseModel orderUpdate(@PathVariable String orderId) {

		// OrderResponseModel orderAbc = orderserviceAbc.orderUpdate();
		OrderResponseModel orderResponseModel = new OrderResponseModel();
		orderResponseModel.setOrderID(orderId);
		orderResponseModel.setOrderStatus("success");
		System.out.println("orderedProductID is " + orderResponseModel);
		return orderResponseModel;
	}

	/*
	 * public static void main(String[] args) { ConfigurableApplicationContext
	 * context = SpringApplication.run(RetailchainApplication.class, args);
	 * RefundResponse refund = context.getBean(RefundResponse.class); RefundResponse
	 * refundtwo = context.getBean(RefundResponse.class);
	 * 
	 * refund.show(); refundtwo.show(); }
	 */
	@PostMapping(value = "/detailUpdate")
	public String detailUpdate(@RequestParam String updateId) {
		X.update();

		return "am calling detailUpdate Method";

	}
}
