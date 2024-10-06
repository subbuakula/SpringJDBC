package com.subbu.springJDBCAPI.model;

import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private int empId;
	private String empName;
	private String empCity;

	
	public Employee() {
//		super();
	}


	public Employee(int empId, String empName, String empCity) {
//		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}
	
	
	

}
