package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
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

		Predicate<Employee> isHoursGt40 = e -> (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
				+ e.days.friday + e.days.saturday + e.days.sunday) > 40;


				list.stream().filter(isHoursGt40).map(e -> e.hourlywage * e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
						+ e.days.friday + e.days.saturday + e.days.sunday)

		
				.forEach(System.out::println);

				
				



		long size = list.stream().filter(isHoursGt40).toArray().length;
		System.out.println("Number of Employees: " + size);

	}

}

