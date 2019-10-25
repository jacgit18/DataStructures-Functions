package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q09 {

 public static boolean isOverTime(Employee employee) {
	boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
			+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
	return status;
		}

	public static void main(String[] args) {

		/*
		 * 9. This question is regarding overt time hours and pay only. What is the
		 * amount paid in overtime only for all the employees? Overtime pay is
		 * calculated by hours greater than 40 at a rate * 1.5 * hourly wage.Example an
		 * employee works 42 hours at 10.00 an hour, therefore they worked 2 hours over
		 * time at a rate of 15.00 (1.5 * 10.00) multiplied by 2 hours. Which means they
		 * are entitled to 30.00 of overtime pay.
		 * 
		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isHoursGt40 = e -> {

			if (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday + e.days.friday + e.days.saturday
					+ e.days.sunday > 40) {

			}
			return e.hourlywage * 1.5 * (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
					+ e.days.friday + e.days.saturday + e.days.sunday) > 40;

		};

//				if (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
//						+ e.days.friday + e.days.saturday + e.days.sunday > 40) {
//					
//				
//						};

//				Predicate<Employee> isHoursGtOTPay = e -> e.hourlywage * 1.5 > 0 ;

// isHoursGt40 = e -> e.
// IntStream.of(a).sum()

//for (int i = 0; i < list.size(); i++) {
//				List<Employee> list2 = list.stream().filter(isHoursGt40); 	

		list.stream().filter(isHoursGt40).forEach(System.out::println);

//}

		long size = list.stream().filter(isHoursGt40).toArray().length;
		System.out.println("Number of Employees: " + size);

	}

}
