package edu.citytech.cst.project;

import java.util.List;


import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q12 {

	// try using both functional and using a method
			public static boolean isEmployeeGts40SumTotal(Employee employee) {
				boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
						+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
				return status;
					}


	/*
    12. Using the map function create the following json object below (class: Q12):
        In this example the total number of hours worked is 41 hours.  1 of those hours 
        is over time, therefore they are entitled to 15.00 an hour.  The 15.00 was calculated
         by 1 * 1.5 (time and a half) * 10.00 an hour.  The regular pay is 40 * 10 = 400.Then 
         you add the 400 + 15 to get a total of 415.00

◦ {id: ”Y-1000”, hourlyWage: 10, weeklyHours: 41, weeklySalary:415}
◦ Use a sort function to find the highest paid worker (id). [LINK1, LINK2]
*/
	
	
	
	
	public static void main(String[] args) {
	
		
		List<Employee> list = new EmployeeDAO().findAll();		
		list.stream().map(WeeklySalary::new)
//		.filter(EmployeeFunction.isovertime) // get employee with ot
		.sorted()
//		.skip(9)// helps find a specific thing in the list
//		.limit(1)// was 10 before which displayed top 10
		.forEach(System.out::println);
		
		long size = list.size();
		System.out.println("Number of Employees: " + size);

	}

}

