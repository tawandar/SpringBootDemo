package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller will not work in this case since we a returning String a rest response
@RestController
public class AppConfiguration {

	
	@RequestMapping("/hello")
	public String hellloWorld()
	{
		return "Hello World";
		
	}
}
