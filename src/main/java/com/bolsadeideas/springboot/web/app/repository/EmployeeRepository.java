package com.bolsadeideas.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.web.app.entity.usuario;

public interface  EmployeeRepository extends JpaRepository<usuario,Long> {
	

}
