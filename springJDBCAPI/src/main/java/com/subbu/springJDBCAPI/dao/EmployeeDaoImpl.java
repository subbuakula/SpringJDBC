package com.subbu.springJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subbu.springJDBCAPI.model.Employee;
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {

	private static final String SELECT_QUERY ="Select * from working.employee;";
	
	@Autowired
	private DataSource dataSource;
//	private Connection conn;
	public EmployeeDaoImpl()
	{
		System.out.println("EmployeeDaoImpl Object is created..!!");
	}
	List <Employee> employees = new ArrayList<>();
	@Override
	public List<Employee> getEmployeeData() 
	{		
		try (Connection conn = dataSource.getConnection();
			 PreparedStatement prstmt = conn.prepareStatement(SELECT_QUERY);)
		{	
		    ResultSet rs = prstmt.executeQuery();
		    
		    while(rs.next())
		    {
		    	Employee emp = new Employee();
		    	emp.setEmpId(rs.getInt("empId"));
		    	emp.setEmpName(rs.getString("empName"));
		    	emp.setEmpCity(rs.getString("empCity"));
		    	
		    	employees.add(emp);
		    }
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return employees;
	}

}
