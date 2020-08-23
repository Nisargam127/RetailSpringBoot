package com.retailchain.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class RefundResponse {
	private String OrderId;
	private String RefundStatus;
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getRefundStatus() {
		return RefundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		RefundStatus = refundStatus;
	}
	public RefundResponse()
	{
		System.out.println("object created");
	}
	
public String show()
{
	System.out.println("pojo class");
	return "learning component anotation";
	
}
}
