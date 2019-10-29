package edu.citytech.cst.project;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q20 {

	// try using both functional and using a method
	 public static boolean isWages9(Employee employee) {
		boolean status = employee.days.monday + employee.hourlywage == 9;
		return status;
			}



	public static void main(String[] args) {
	
		/*
		     20. How many employees have a salary greater than the average salary (class: Q20)?

		 * 
		 */
		//fuxed
		List<Employee> list = new EmployeeDAO().findAll();

		DoubleSummaryStatistics summary = (DoubleSummaryStatistics) list.stream();
		
		Predicate<Employee> isHoursGt40 = e -> (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
				+ e.days.friday + e.days.saturday + e.days.sunday) > 40;



				list.stream().filter(isHoursGt40).map(e -> e.hourlywage * e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
						+ e.days.friday + e.days.saturday + e.days.sunday)

		
				.forEach(System.out::println);

				
				


		long size = list.stream().filter(isHoursGt40).toArray().length;
		System.out.println("Number of Employees: " + size);

		
		
		
	}
	
	public static void ex05(String[] args) {

		// functional version

		double number[] = { 1_000f, 90f, 90f, 90f, 45f};

		DoubleSummaryStatistics summary = Arrays.stream(number).summaryStatistics();

		// minus 1 is for lowest score
		double avg = summary.getAverage();
		double modifiedavg = (summary.getSum() - summary.getMin()) / (summary.getCount() - 1);
		double olympicavg = (summary.getSum() - summary.getMax() - summary.getMin()) / (summary.getCount() - 1);

		System.out.println(summary);
		System.out.println(avg);
		System.out.println(modifiedavg);
		System.out.println(olympicavg);

	}


}

