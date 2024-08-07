package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
 @Autowired
	EmployeeRepository employeeRepository;
	@PostMapping
	public  Employee saveEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@PutMapping
	public  Employee putdateEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
	@GetMapping
	public  List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
		
	}
	
	public  String deletEmployee(@RequestParam Integer empId) {
		employeeRepository.deleteById(empId);
		return "deleted successfully";
	}
}

