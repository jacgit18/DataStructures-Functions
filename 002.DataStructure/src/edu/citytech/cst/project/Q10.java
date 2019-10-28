package edu.citytech.cst.project;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;

public class Q10 {

// try using both functional and using a method
 public static boolean isOverTime(Employee employee) {
	boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
			+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
	return status;
		}

    
	public static void main(String[] args) {
	
		/*
		 10. How many employees are in group G?  The group is determined by the employee id.  
		 Example the id format is G-1000, Z-1423, or F-1000. Clue use the substring method 
		 to calculate the answer
		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(EmployeeFunction::BegwithId).forEach(System.out::println);
		
		

		long size = list.stream().filter(EmployeeFunction::BegwithId).toArray().length;
		System.out.println("Number of Employees: " + size);
		

	}

}

