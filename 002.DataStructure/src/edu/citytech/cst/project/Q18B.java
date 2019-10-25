package edu.citytech.cst.project;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q18B {

// try using both functional and using a method
// public static boolean isOverTime(Employee e) {
//
//// e.days.monday + e.days.tuesday + e.days.wendesday + + e.days.thursday + e.days.friday + e.days.saturday + e.days.sunday > 40
//
// return status; try returning method name
// }

	public static void main(String[] args) {

		/*
		 * 18. What is the average salary for all employees (class: Q18)?
		 * Cleaner verision
		 * 
		 */

		List<Employee> list = new EmployeeDAO().findAll();

		DoubleSummaryStatistics summary = list.stream().map(WeeklySalary::new).mapToDouble(m -> m.weeklySalary)
				.summaryStatistics();
		System.out.println(summary.getAverage());
//		System.out.println("avg:" + avg + " total:" + total );


	}

}
