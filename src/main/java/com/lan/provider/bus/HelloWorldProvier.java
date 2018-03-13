package com.lan.provider.bus;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldProvier {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldProvier.class);
	
	@GetMapping("/hello")
	public Map<String, String> hello(){
		Map<String, String> result = new HashMap<>();
		
		result.put("k1", "v1");
		result.put("k2", "v2");
		result.put("k3", "v3");
		
		logger.info("{}", result);
		
		return result;
	}
	
}
