package com.bolsadeideas.springboot.web.app.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.web.app.entity.usuario;
import com.bolsadeideas.springboot.web.app.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class Userimp {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	  @GetMapping("/usuarios")
	    public List<usuario> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	
	
	
	

}
