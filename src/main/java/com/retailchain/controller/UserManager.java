package com.retailchain.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserManager {

@RequestMapping(value="/update",method=RequestMethod.GET)
@Bean
public String userUpdate()
{
	return "updated susscessfully";
	
}
}
