package com.lan.provider.bus;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginService {

	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	
	@GetMapping("/login")
	public Map<String, String> login(@RequestBody LoginInputBean input){
		Map<String, String> result = new HashMap<>();
		
		result.put("username", input.getUsername());
		result.put("password", input.getPassword());
		
		logger.info("{}", result);
		
		return result;
	}
	
}
