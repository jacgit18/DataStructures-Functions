package edu.citytech.cst.model;

import static edu.citytech.cst.function.EmployeeFunction.*;

import edu.citytech.cst.function.EmployeeFunction;

public class WeeklySalary implements Comparable<WeeklySalary> {
	public String id;
	public String gender;
	public String region;

	public float hourlyWage;

	public float weeklyHours; 
	public float weeklySalary;
	
	
	public WeeklySalary(Employee e) {
		

		this.gender = e.gender.substring(0, 1).toUpperCase();
		
		this.id = e.empid;
		this.region = e.region;
		this.hourlyWage = e.hourlywage;
		this.weeklyHours = EmployeeFunction.getWeeklyHours(e);
		this.weeklySalary = getweeklySalary(this);
		
	}
	
	@Override
	public String toString() {
//		return "WeeklySalary [id=" + id + ", hourlyWage=" + hourlyWage + ", weeklyHours=" + weeklyHours
//				+ ", weeklySalay=" + weeklySalary + "]";
		
		return "WeeklySalary [id=" + id +  ", weeklyHours=" + weeklyHours + ", region=" + region
				+  ", gender=" + gender + "]";
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
