package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q14 {

	// try using both functional and using a method
	 public static boolean isWages9(Employee employee) {
		boolean status = employee.days.monday + employee.hourlywage == 9;
		return status;
			}



	public static void main(String[] args) {
	
		/*
		     14. Based on question 12, who is the highest paid employee in group G (class: Q14)?

		 * 
		 */
		 
			List<Employee> list = new EmployeeDAO().findAll();

//			list.stream().filter(EmployeeFunction::BegwithId)
//			.max(EmployeeFunction.getweeklySalary()).forEach(System.out::println);
			
			

			long size = list.stream().filter(EmployeeFunction::BegwithId).toArray().length;
			System.out.println("Number of Employees: " + size);
		
		
//		List<Employee> list = new EmployeeDAO().findAll();		
//		list.stream().map(WeeklySalary::new)
////		.filter(EmployeeFunction.isovertime) // get employee with ot
//		.sorted()
//		.skip(9)// helps find a specific thing in the list
//		.limit(1)// was 10 before which displayed top 10
//		.forEach(System.out::println);
//		
//		long size = list.size();
//		System.out.println("Number of Employees: " + size);

	}

}

