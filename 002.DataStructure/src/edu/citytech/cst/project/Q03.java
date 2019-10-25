package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q03 {
	

		public static boolean isGts10(Employee emp) {


				boolean status =emp.hourlywage > 10 ;	
				return status;
				
				
			
			
				}

	
	public static void main(String[] args) {
		
		/* 3. Find the number of employees that worked make more than $10 an hour   */
		List<Employee> list = new EmployeeDAO().findAll();
		
		Predicate<Employee> isWagesGt10 = emp -> emp.hourlywage > 10;
		
		list.stream().filter(isWagesGt10)
		.forEach(System.out::println);
		
// aleternative way to above code but requires make a method
		
//		list.stream().filter(Q03::isGts10).forEach(System.out::println);
//		
//		
//		long size = list.stream().filter(Q03::isGts10).toArray().length;
//		System.out.println("Number of Employees: " + size);
		
		long size = list.stream().filter(isWagesGt10).toArray().length;
		System.out.println("Number of Employees: " + size);
		
		
		

		

	}

}
