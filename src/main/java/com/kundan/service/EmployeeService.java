package com.kundan.service;

import java.util.List;

import com.kundan.model.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(Integer empId,Employee employee);
	
	public void deleteEmployee(Integer empId);
	
	public Employee getOneEmployee(Integer empId);
	
	public List<Employee> getAllEmployee();

}
