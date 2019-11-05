package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q27 {
	/**
	 * 
	 * 
	 * 27.What employee worked the most of number of hours in the following regions Brooklyn, Queens, Bronx Region.
	 *  Show the following fields. In black board answer should be in the form of the 
	 * 
	 *  employee id;{id:”Y-1000”,weeklyHours: 41,region: “Brooklyn”}
	
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
