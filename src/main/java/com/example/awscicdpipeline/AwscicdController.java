package com.example.awscicdpipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class AwscicdController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

}
