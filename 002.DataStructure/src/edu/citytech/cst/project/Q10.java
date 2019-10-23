package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q10 {

// try using both functional and using a method
// public static boolean isOverTime(Employee e) {
//
//// e.days.monday + e.days.tuesday + e.days.wendesday + + e.days.thursday + e.days.friday + e.days.saturday + e.days.sunday > 40
//
// return status;
// }


    //10
	public static void main(String[] args) {
	
		/*
		 10. How many employees are in group G?  The group is determined by the employee id.  
		 Example the id format is G-1000, Z-1423, or F-1000. Clue use the substring method 
		 to calculate the answer
		 * 
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isHoursGt40 = e -> (e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
				+ e.days.friday + e.days.saturday + e.days.sunday) > 40;

// isHoursGt40 = e -> e.
// IntStream.of(a).sum()

//for (int i = 0; i < list.size(); i++) {
//				List<Employee> list2 = list.stream().filter(isHoursGt40); 	

				list.stream().filter(isHoursGt40).map(e -> e.hourlywage * e.days.monday + e.days.tuesday + e.days.wendesday + e.days.thursday
						+ e.days.friday + e.days.saturday + e.days.sunday)
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
		
				.forEach(System.out::println);

				
				
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

		long size = list.stream().filter(isHoursGt40).toArray().length;
		System.out.println("Number of Employees: " + size);

	}

}
