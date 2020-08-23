package com.retailchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.retailchain.controller.X;
import com.retailchain.model.RefundResponse;
import com.retailchain.serviceImpl.EmployeeStatusImpl;

@SpringBootApplication
public class RetailchainApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(RetailchainApplication.class, args);
		RefundResponse refund = context.getBean(RefundResponse.class);
		RefundResponse refundtwo = context.getBean(RefundResponse.class);

		refund.show();
		refundtwo.show();
	}

	@Bean
	public EmployeeStatusImpl employeeStatus() {
		System.out.println("inside employee instantiate");
		EmployeeStatusImpl emp = new EmployeeStatusImpl();
		return emp;
	}

	@Bean
	public X update() {
		System.out.println("inside x class");
		X update = new X();
		return update;

	}

	@Bean
	public RestTemplate resttemplate() {
		//RestTemplate restTemplate = new RestTemplate();
		//HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		//requestFactory.setConnectTimeout(9000);
		//requestFactory.setReadTimeout(9000);
		//restTemplate.setRequestFactory(requestFactory);
		return new RestTemplate();
	}
}
