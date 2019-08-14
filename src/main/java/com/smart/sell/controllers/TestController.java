package com.smart.sell.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/test")
	String test(){
		return "Rest Controller Invoked";
	}

}
