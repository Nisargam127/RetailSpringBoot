package com.retailchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailchain.model.OrderUpdateDAO;
import com.retailchain.model.PojoClass;
@Repository
public interface PojoRepository extends JpaRepository<PojoClass, String> {
	PojoClass findAllByOrderId(String orderId);
	PojoClass findAllByOrderDescription(String orderDescription);
}
