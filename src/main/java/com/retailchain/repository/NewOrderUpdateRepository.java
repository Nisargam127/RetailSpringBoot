package com.retailchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retailchain.model.NewOrderUpdateDAO;

@Repository
public interface NewOrderUpdateRepository extends JpaRepository<NewOrderUpdateDAO, String> {
	NewOrderUpdateDAO findAllByOrderId(String orderId);
	
	
}

