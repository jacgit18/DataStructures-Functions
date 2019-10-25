package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q07 {

// try using both functional and using a method
	public static boolean isEmployeeGts40(Employee employee) {

		boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
				+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
		return status;

	}

	public static void main(String[] args) {

		/*
		 * 7. This question is regarding overt time hours. Over time hours are hours
		 * greater than 40 hours. How many employees are entitled to over time?
		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isEmployyeGts40 = e -> e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
				+ e.days.friday + e.days.saturday + e.days.sunday > 40;

		list.stream().filter(isEmployyeGts40).forEach(System.out::println);
		
		// Alternative way to above code but requires make a method

//		list.stream().filter(Q05::isGts40).forEach(System.out::println);
//
//		long size = list.stream().filter(Q05::isGts40).toArray().length;
//		System.out.println("Number of Employees: " + size);

		long size = list.stream().filter(isEmployyeGts40).toArray().length;
		System.out.println("Number of Employees Eligiable for Overtime: " + size);

	}

}
