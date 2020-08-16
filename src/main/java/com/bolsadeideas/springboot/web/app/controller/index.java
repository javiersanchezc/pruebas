package com.bolsadeideas.springboot.web.app.controller;

import org.springframework.core.ParameterizedTypeReference;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class index {
	
	@GetMapping("/index")
	public String index() {
	
		
		return "index";
	}

}
