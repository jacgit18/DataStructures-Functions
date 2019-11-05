package edu.citytech.cst.inclass;

import java.util.List;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q29 {

	/**
	 * 

	 *  
	 *  29.What is the average salary of the people that live in Brooklyn?
	 *  
	
	 * 
	 */

	public static void main(String[] args) {

		List<Employee> list = new EmployeeDAO().findAll();		
	List<WeeklySalary> wlist = list.stream().map(WeeklySalary::new).collect(Collectors.toList());
		

//		list.stream().map(WeeklySalary::new).filter(EmployeeFunction::Gender).collect(Collectors.toList());
		
		
		

		long size = list.stream().filter(EmployeeFunction::bxBourough).toArray().length;
		System.out.println("Number of Employees: " + size);
		
		
		float total = 0, avg = 0;
		for (WeeklySalary weeklySalary: wlist) {
			total = total + weeklySalary.weeklySalary;
			
		}
		avg = total / wlist.size();
		System.out.println("avg:" + avg + " total:" + total );
//		
//		long size = list.size();
//		System.out.println("Number of Employees: " + size);
	
		
	}

}
