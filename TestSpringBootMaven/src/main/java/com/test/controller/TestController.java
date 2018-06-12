package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "green";
	}
	
	@RequestMapping("/helloblue")
	public String sayHelloBlue()
	{
		return "re";
	}

}
