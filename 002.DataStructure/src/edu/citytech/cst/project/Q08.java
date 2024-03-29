package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.function.EmployeeFunction;
import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class Q08 {

	// try using both functional and using a method
		public static boolean isEmployeeGts40SumTotal(Employee employee) {
			boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday + employee.days.thursday
					+ employee.days.friday + employee.days.saturday + employee.days.sunday > 40; 
					
					
					
			return status;
				}


		/*
		 * 8. This question is regarding overt time hours. What is the total number of
		 * overtime hours for the all the employees?
		 * add all employee overtime of employees
		 * 
		 */
	public static void main(String[] args) {
	

	
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isHoursGt40 = e -> e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
				+ e.days.friday + e.days.saturday + e.days.sunday > 40;
				

// isHoursGt40 = e -> e.
// IntStream.of(a).sum()

//for (int i = 0; i < list.size(); i++) {
//				List<Employee> list2 = list.stream().filter(isHoursGt40); 	

//				list.stream().filter(isHoursGt40).map(e -> e.hourlywage * e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
//						+ e.days.friday + e.days.saturday + e.days.sunday).
//				forEach(System.out::println);

				
				
				
//				 .reduce(0,
//					        (sum, e) -> {
//					            System.out.format("accumulator: sum=%s; person=%s\n", sum, e);
//					            return sum += e.;
//					        },
//					        (sum1, sum2) -> {
//					            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
//					            return sum1 + sum2;
//					        })
//				.collect(Collectors.reducing())
		

				
				
//list.stream().filter(isHoursGt40).max(e -> {
//			
//		})
//// .equals(String sum += list[i] )
//				list.parallelStream().filter(isHoursGt40)
//				.map(e -> e.hourlywage * e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
//						+ e.days.friday + e.days.saturday + e.days.sunday) 
//				.reduce(0,
//						        (sum, e) -> {
//						            System.out.format("accumulator: sum=%s; person=%s\n", sum, e);
//						            return sum += e.;
//						        },
//						        (sum1, sum2) -> {
//						            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
//						            return sum1 + sum2;
//						        })
//				.forEach(System.out::println);
//}


//		long size = list.stream().filter(isHoursGt40).toArray().length;
//		System.out.println("Number of Employees: " + size);
//		
		
				// was thinking modulo

		list.stream().map(WeeklySalary::new).filter(EmployeeFunction.isovertime).
		sorted().forEach(System.out::println);
//		list.stream().filter(isEmpGts40).forEach(System.out::println);


		long size = list.stream().filter(Q08::isEmployeeGts40SumTotal).toArray().length;
		System.out.println("Number of Employees: " + size);
		
		

	}

}
