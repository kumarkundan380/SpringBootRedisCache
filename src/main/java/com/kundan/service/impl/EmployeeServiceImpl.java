package com.kundan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kundan.exception.ResourceNotFoundException;
import com.kundan.model.Employee;
import com.kundan.repository.EmployeeRepository;
import com.kundan.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Integer empId,Employee employee) {
		Employee emp = employeeRepository.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Employee Not Found "+empId));
		emp.setEmpName(employee.getEmpName());
		emp.setEmpSal(employee.getEmpSal());
		return employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		Employee employee = employeeRepository.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Employee not found "+empId));
		employeeRepository.delete(employee);

	}

	@Override
	public Employee getOneEmployee(Integer empId) {
		return employeeRepository.findById(empId).orElseThrow(()-> new ResourceNotFoundException("Employee Not Found "+empId));
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

}
