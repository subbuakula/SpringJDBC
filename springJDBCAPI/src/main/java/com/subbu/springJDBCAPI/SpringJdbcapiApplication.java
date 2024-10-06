package com.subbu.springJDBCAPI;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subbu.springJDBCAPI.dao.EmployeeDaoImpl;
import com.subbu.springJDBCAPI.model.Employee;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcapiApplication.class, args);
		
		EmployeeDaoImpl empDao = context.getBean(EmployeeDaoImpl.class);
//		List<Employee> employees = empDao.getEmployeeData();
//		
//		for(Employee e: employees)
//		{
//			System.out.println(e);
//		}
		empDao.getEmployeeData().forEach(e -> System.out.println(e));
	}

}
