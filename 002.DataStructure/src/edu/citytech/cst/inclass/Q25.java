package edu.citytech.cst.inclass;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q25 {
	
	
	/**
	 * 25. Display all the people that are in Queens or Brooklyn show the following fields using the map function.
 * 			Create a class with the following attributes
	 * 		For the gender field display on F–female and M-male
	 * 		{id:“Y-1000”,weeklyHours: 41,region: “Brooklyn”, gender: “F”}
	 * 
	 * 		How many employees meet the criteria?
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> list = new EmployeeDAO().findAll();
		

		list.stream().map(WeeklySalary::new)
//		.filter(EmployeeFunction.RichestBourough(bour)) 
		.sorted()
//		.skip(9)
//		.limit(1)
		.forEach(System.out::println);		
		
		
		

//		long size = list.stream().filter(EmployeeFunction::RichestBourough).toArray().length;
//		System.out.println("Number of Employees: " + size);
		

//		long size = list.stream().filter(EmployeeFunction::RichestBourough).toArray().length;
//		System.out.println("Number of Employees: " + size);
		
		
		long size = list.size();
		System.out.println("Number of Employees: " + size);

		
	}
	
}
