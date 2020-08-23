package com.retailchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailchain.model.NewOrderUpdateDAO;
import com.retailchain.model.OrderUpdateDAO;

@Repository
public interface OrderUpdateRepository extends JpaRepository<OrderUpdateDAO, String>{
	 OrderUpdateDAO findAllByOrderId(String orderId);
	
}