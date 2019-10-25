package edu.citytech.cst.project;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q06 {
	/*
	 6. What is the total amount of money paid out on a Monday?  
		 Note this is done by calculating hours worked on a Monday 
		 multiplied with their hourly wage.
	 */
	public static void main(String[] args) {
		ex1();
		ex2();
	}
	
	public static void ex1() {


	List<Employee> list = new EmployeeDAO().findAll();
	float total = 0;

	for (Employee employee : list) {
		if (employee.hourlywage >= 15) {
			System.out.println(employee);
			total = total + employee.days.monday * employee.hourlywage;
			
		}
		
	}
		
		System.out.println("the total is " + total);
		
	}
	
	// Functional way
	public static void ex2() {

			List<Employee> list = new EmployeeDAO().findAll();
			
			ToDoubleFunction<Employee> x = e -> e.days.monday * e.hourlywage;
			
			OptionalDouble total = list.stream()
					.filter(e -> e.hourlywage >= 15_000)
//					list.stream().mapToDouble(x)
			    .mapToDouble(x)
			 // what is a, c and x 
				.reduce((a,c) -> a + c);
//			list.stream().mapToDouble(x)
			
//			.forEach(System.out::println);;
			
			System.out.println(total.isEmpty());
			System.out.println(total);

				
				
			}

}
