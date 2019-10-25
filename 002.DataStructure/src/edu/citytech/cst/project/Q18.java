package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q18 {

// try using both functional and using a method
// public static boolean isOverTime(Employee e) {
//
//// e.days.monday + e.days.tuesday + e.days.wendesday + + e.days.thursday + e.days.friday + e.days.saturday + e.days.sunday > 40
//
// return status;
// }



	public static void main(String[] args) {
	
		/*
		    18. What is the average salary for all employees (class: Q18)?

		 * 
		 */
		
		List<Employee> list = new EmployeeDAO().findAll();		
		List<WeeklySalary> wlist = list.stream().map(WeeklySalary::new).collect(Collectors.toList());
		
		float total = 0, avg = 0;
		for (WeeklySalary weeklySalary: wlist) {
			total = total + weeklySalary.weeklySalary;
			
		}
		avg = total / wlist.size();
		System.out.println("avg:" + avg + " total:" + total );
//		
		long size = list.size();
		System.out.println("Number of Employees: " + size);
	}

}

