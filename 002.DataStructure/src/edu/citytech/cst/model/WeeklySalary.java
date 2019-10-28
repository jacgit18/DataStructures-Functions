package edu.citytech.cst.model;

import static edu.citytech.cst.function.EmployeeFunction.*;

import edu.citytech.cst.function.EmployeeFunction;

public class WeeklySalary implements Comparable<WeeklySalary> {
	public String id;
	public float hourlyWage;

	public float weeklyHours; 
	public float weeklySalary;
	
	
	public WeeklySalary(Employee e) {
		this.id = e.empid;
		this.hourlyWage = e.hourlywage;
		this.weeklyHours = EmployeeFunction.getWeeklyHours(e);
		this.weeklySalary = getweeklySalary(this);
	}
	
	@Override
	public String toString() {
		return "WeeklySalary [id=" + id + ", hourlyWage=" + hourlyWage + ", weeklyHours=" + weeklyHours
				+ ", weeklySalay=" + weeklySalary + "]";
	}

	
	
	@Override

	/*1 gt
	 * 0 eq
	 * -1 lt
	 * 
	 */
	public int compareTo(WeeklySalary o) {

		int status = Float.compare(this.weeklyHours, o.weeklyHours);
		return  status;
	}
	
	
	
}
