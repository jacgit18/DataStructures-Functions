package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q19 {

	// try using both functional and using a method
	 public static boolean isWages9(Employee employee) {
		boolean status = employee.days.monday + employee.hourlywage == 9;
		return status;
			}



	public static void main(String[] args) {
	
		/*
		     19. What is the average salary for all employees in group G (class: Q19)?
		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::BegwithId).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::BegwithId).toArray().length;
		System.out.println("Number of Employees: " + size);
	}

}

