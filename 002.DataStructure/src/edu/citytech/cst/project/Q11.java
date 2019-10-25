package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q11 {

// try using both functional and using a method
 public static boolean isWages9(Employee employee) {
	boolean status = employee.days.monday + employee.hourlywage == 9;
	return status;
		}



	public static void main(String[] args) {
	
		/*
		     11. Find the number of employees that make $9 an hour (class: Q11).
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isWages9 = e -> e.hourlywage == 9 ;
				
		list.stream().filter(isWages9).forEach(System.out::println);

				
				
//		list.stream().filter(Q11::isWages9).forEach(System.out::println);

		
//		long size = list.stream().filter(Q11::isWages9).toArray().length;
//		System.out.println("Number of Employees: " + size);


		long size = list.stream().filter(isWages9).toArray().length;
		System.out.println("Number of Employees: " + size);
		
		
		
		
		
		
		
	}

}

