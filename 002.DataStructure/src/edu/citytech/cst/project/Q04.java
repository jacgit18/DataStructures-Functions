package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q04 {

	/**
	 * order of operations for large datasets use parallel streams to enable multi
	 * threading reduce function count, max, min , reduce Summary statistics filter
	 * first than sort or map after
	 * 
	 * @param employee
	 * @return
	 */
	public static boolean isSundayGT5(Employee employee) {
		
		boolean status = employee.days.sunday > 5 ;
		return status ;	
			}

	public static void main(String[] args) {

		/*
		 * 4. Find the number of employees that worked more than 5 hours on a Sunday
		 * (class: Q04).
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isSundayGT5 = emp -> emp.days.sunday > 5;
//
		list.stream().filter(isSundayGT5).forEach(System.out::println);
		
		// alternative way to above code but requires making a method

//		 list.stream().filter(Q04::isSundayGT5).forEach(System.out::println);
		
//		 long size = list.stream().filter(Q04::isSundayGT5).toArray().length;
//		 System.out.println("Number of Employees: " + size);
		 
		long size = list.stream().filter(isSundayGT5).toArray().length;
		System.out.println("Number of Employees: " + size);





	}

}
