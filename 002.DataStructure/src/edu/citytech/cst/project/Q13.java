package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q13 {

	// try using both functional and using a method
	 public static boolean isHoursGt40(Employee employee) {
		boolean status = employee.days.monday + employee.hourlywage == 9;
		return status;
			}



	public static void main(String[] args) {
	
		/*
		    13. What is the highest paid salary, looking for a dollar amount (class: Q13)?

		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

//		Predicate<Employee> isHoursGt40 = e -> (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
//				+ e.days.friday + e.days.saturday + e.days.sunday) > 40;


		

				list.stream().map(WeeklySalary::new).sorted().limit(1).forEach(System.out::println);

				
		long size = list.stream().toArray().length;
		System.out.println("Number of Employees: " + size);

	}

}

