package com.retailchain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponseModel {
	private String orderID;
	private String orderDescription;
	private String orderDate;
	private String orderUserId;
	private String phoneNumber;
	private String releaseDate;
	private String orderStatus;

}
