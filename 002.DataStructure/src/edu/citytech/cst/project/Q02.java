package edu.citytech.cst.project;

import java.util.List;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.Employee;

public class Q02 {

	public static boolean isHoursGT5(Employee emp) {

		boolean status = emp.days.monday > 5;
		return status;

	}

	public static void main(String[] args) {
		/*
		 * 2.Find the number of employees that worked more than 5 hours on a Monday
		 * (class: Q02).
		 */
		List<Employee> list = new EmployeeDAO().findAll();

		list.stream().filter(Q02::isHoursGT5).forEach(System.out::println);

		long size = list.stream().filter(Q02::isHoursGT5).toArray().length;

		System.out.println("Number of Employees: " + size);

	}

}
