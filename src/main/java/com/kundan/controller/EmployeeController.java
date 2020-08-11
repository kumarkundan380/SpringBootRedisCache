package com.kundan.controller;

import java.util.List;

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

import com.kundan.model.Employee;
import com.kundan.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}
	
	@GetMapping("/one/{empId}")
	public Employee getOneEmployee(@PathVariable(value = "empId") Integer empId) {
		return employeeService.getOneEmployee(empId);
	}
	
	@PutMapping("/modify/{empId}")
	public Employee updateEmployee(@PathVariable(value = "empId") Integer empId, @RequestBody Employee employee) {
		return employeeService.updateEmployee(empId, employee);
	}
	
	@DeleteMapping("remove/{empId}")
	public void deleteEmployee(@PathVariable(value = "empId") Integer empId) {
		employeeService.deleteEmployee(empId);
	}

}
