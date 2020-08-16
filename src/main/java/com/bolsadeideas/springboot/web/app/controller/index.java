package com.bolsadeideas.springboot.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.entity.usuario;
import com.bolsadeideas.springboot.web.app.repository.EmployeeRepository;


@Controller
@RequestMapping
public class index {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/index")
	public String index() {
	
		
		return "index";
	}

	
	  @GetMapping("/usuarios")
	    public List<usuario> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	
}
