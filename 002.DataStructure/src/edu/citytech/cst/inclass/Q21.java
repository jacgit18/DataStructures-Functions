package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q21 {

	/**
	 * 21.How many males are in the employee data set? Note a new field call gender has been added.See Figure 1
	 */
	
	public static void main(String[] args) {
		
		
		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::Gender).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::Gender).toArray().length;
		System.out.println("Number of Employees: " + size);
		

		
		

	}

}
