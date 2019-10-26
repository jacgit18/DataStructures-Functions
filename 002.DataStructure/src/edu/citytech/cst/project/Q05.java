package edu.citytech.cst.project;

import java.util.List;
import java.util.function.Predicate;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q05 {

	public static boolean isGts40(Employee employee) {

		boolean status = employee.days.monday + employee.days.tuesday + employee.days.wendesday
				+ employee.days.thursday + employee.days.friday + employee.days.saturday + employee.days.sunday > 40;
		return status;

	}

	public static void main(String[] args) {

		/*************************************************************************************
		 * 5. Find the number of employees that worked more than a total of 40 hours for
		 * the entire week (class: Q05).
		 * 
		 * brackets < > declares type in this case Employee class List<Employee> list =
		 * new EmployeeDAO().findAll();
		 * 
		 * List is basically an interface where you create the body in the class your
		 * using. Something like this is invalid because List<Integer> list = new
		 * List<Integer>(); you can have an interface equal an interface so you do
		 * something like this List<Employee> list = new EmployeeDAO().findAll(); or
		 * this List<Integer> list = new ArrayList<Integer>(); where your equal to a
		 * concrete class and List is essential a ArrayList
		 * 
		 * this List<Integer> list = new List<Integer>(); is better to do because you
		 * can make any type of list instead just using a concrete class list where your
		 * limited 
		 * 
		 * 
		 * List is an interface or Blueprint for implementors like ArrayList or
		 * LinkedList. This essentially translates to the fact that List is more general
		 * whereas ArrayList and LinkedList are more specific ( or sophisticated ) if
		 * you say
		 * 
		 * List<Integer> list = new ArrayList<Integer>(); you cannot invoke a method
		 * ensureCapacity on list because this is an additional functionality supported
		 * only by ArrayList. Interfaces are used so that there is minimal code change
		 * in case the implementation changes in future. Tomorrow if you realize that it
		 * is more important for your application to allocate memory dynamically rather
		 * than having indexed access to your collection, you can just go ahead and
		 * change ArrayList to LinkedList. You need not worry about making any change to
		 * all the lines where list variable has been used.
		 * 
		 * Consider a hypothetical case where we allow assignment of base class to
		 * derived class in the following hierarchy.
		 * 
		 * Vehicle | / \ / \ Aeroplane Car
		 * 
		 * Aeroplane aeroplane = new Vehicle(); Car car = new Vehicle();
		 * 
		 * Now clearly aeroplane is an aerial vehicle and car is a land vehicle hence
		 * they cannot be the same therefore this assignment outright feels illogical.
		 * Even if the compiler allowed it, at runtime if someone executed
		 * aeroplane.fly() there will be no pointer in the virtual table pointing to the
		 * actual implementation of fly() because every vehicle dosen't fly and hence
		 * Vehicle did not have a fly method at all.
		 * 
		 * ///////////////////////////////////////////////////////////////////////////////////
		 * 
		 * for me,i see that the List declaration is better than ArrayList,why?
		 * 
		 * Because sometimes you will need to make changes in your code like switching
		 * your array to a LinkedList or whatever,if you are using List in your
		 * declaration,then there is no problem,but if you are using arraylist you need
		 * to change it to LinkedList in the whole code
		 * 
		 * that’s why using List is better because “List” Interface extends directly
		 * collection and when using methods like Collections.singletonList(); you won’t
		 * find a problem because they return a list so it’s a question of data
		 * structuring and what is your aim from the first time when you start coding if
		 * you started with ArrayList then you wanted to change to LinkedList there is
		 * some work to do,without mentioning if u you were using ArrayList
		 * methods,that’s why modelling in the first beginning is good :D
		 * 
		 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		Predicate<Employee> isHoursGt40 = e -> e.days.monday
				+ e.days.tuesday + e.days.wendesday + e.days.thursday + e.days.friday
				+ e.days.saturday + e.days.sunday > 40;
		
		list.stream().filter(isHoursGt40)
		.forEach(System.out::println);
	
		
		// Alternative way to above code but requires make a method

//				list.stream().filter(Q05::isGts40).forEach(System.out::println);
//
//				long size = list.stream().filter(Q05::isGts40).toArray().length;
//				System.out.println("Number of Employees: " + size);
				
	long size = list.stream().filter(isHoursGt40).toArray().length;
		System.out.println("Number of Employees: " + size);

		

	}

}
