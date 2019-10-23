package edu.citytech.cst.project;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q01 {

	public static void main(String[] args) {
		
		/* 1.	Find the number of employees  */
		List<Employee> list = new EmployeeDAO().findAll();		
		list.forEach(System.out::println);
		
		long size = list.size();
		System.out.println("Number of Employees: " + size);

	}

}
