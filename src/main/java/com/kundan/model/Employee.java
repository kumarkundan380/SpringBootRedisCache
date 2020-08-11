package com.kundan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

	private static final long serialVersionUID = 270294658212025434L;
	
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "empSal")
	private Double empSal;

}
