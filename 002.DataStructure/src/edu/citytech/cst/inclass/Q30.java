package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q30 {
	/**
	 * 
	 *
	 *  
	 *   30.What is the average salary of the people that live in Brooklyn,Queens and Staten Island who are Female?
	 *  
	 *
	 * 
	 */

	public static void main(String[] args) {
		

		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::Gender2).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::Gender2).toArray().length;
		System.out.println("Number of Employees: " + size);

	}

}
