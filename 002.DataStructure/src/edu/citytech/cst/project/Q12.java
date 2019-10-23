package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q12 {

// try using both functional and using a method
// public static boolean isOverTime(Employee e) {
//
//// e.days.monday + e.days.tuesday + e.days.wendesday + + e.days.thursday + e.days.friday + e.days.saturday + e.days.sunday > 40
//
// return status;
// }



	public static void main(String[] args) {
	
		/*
		     12. Using the map function create the following json object below (class: Q12):
                 In this example the total number of hours worked is 41 hours.  1 of those hours 
                 is over time, therefore they are entitled to 15.00 an hour.  The 15.00 was calculated
                  by 1 * 1.5 (time and a half) * 10.00 an hour.  The regular pay is 40 * 10 = 400.Then 
                  you add the 400 + 15 to get a total of 415.00

        ◦ {id: ”Y-1000”, hourlyWage: 10, weeklyHours: 41, weeklySalary:415}
        ◦ Use a sort function to find the highest paid worker (id). [LINK1, LINK2]
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

