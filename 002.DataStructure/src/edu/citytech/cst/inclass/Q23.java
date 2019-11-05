package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q23 {

	/**
	 * 23.How many females live in Manhattan are in the employee dataset?		
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::Gender2).filter(EmployeeFunction::RichestBourough).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::RichestBourough).toArray().length;
		System.out.println("Number of Employees: " + size);

		
		
	}

}
