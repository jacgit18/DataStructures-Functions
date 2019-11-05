package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q26 {
	/**
	 * 
	 * 26.Display the highest paid person in Bronx, in this question am looking for the employee Id only.
	 *
	 * 
	 */

	public static void main(String[] args) {

		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::Gender).filter(EmployeeFunction::bxBourough).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::bxBourough).toArray().length;
		System.out.println("Number of Employees: " + size);

		
	}

}
