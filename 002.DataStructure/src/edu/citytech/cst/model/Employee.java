package edu.citytech.cst.model;

public class Employee {
	 String empid;
	public Day  days;
	public float hourlywage;
	
	/**
	 * What class is the super calling employee isn't extend 
	 * to any thing, might be calling it self since the class
	 *  isn,t extended to another parent class meaning employee
	 *  is the parent
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", days=" + days + ", hourlyWage=" + hourlywage + "]";
	}
	
}

