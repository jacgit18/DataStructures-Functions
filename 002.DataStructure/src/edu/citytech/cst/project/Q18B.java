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
			public static boolean isEmployeeGts40SumTotal(Employee employee) {
				boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
						+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
				return status;
					}

	public static void main(String[] args) {

		/*
		 * 18. What is the average salary for all employees (class: Q18)?
		 * Cleaner version
		 * 
		 */

		List<Employee> list = new EmployeeDAO().findAll();

		DoubleSummaryStatistics summary = list.stream().map(WeeklySalary::new).mapToDouble(m -> m.weeklySalary)
				.summaryStatistics();
		System.out.println(summary.getAverage());
//		System.out.println("avg:" + avg + " total:" + total );


	}

}
