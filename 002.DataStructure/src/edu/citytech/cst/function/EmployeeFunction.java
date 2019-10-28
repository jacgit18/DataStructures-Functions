package edu.citytech.cst.function;

import java.util.function.Predicate;

import edu.citytech.cst.model.Employee;
import edu.citytech.cst.model.WeeklySalary;

public class EmployeeFunction {

	
	public static float getWeeklyHours(Employee e) {
		float totalHourWorked =
				e.days.monday + e.days.tuesday + 
				e.days.wendesday + 
				e.days.thursday + 
				e.days.friday +
				e.days.saturday + 
				e.days.sunday ;	
		
		return totalHourWorked;
		
	}
	
	public static float getweeklySalary(WeeklySalary w) {
		
		float weeklySalary = 0f;
		float overtimePay = 0f;
		float regularPay = 0f;

		
		
		
		if (isovertime.test(w)){
			
			float otHours = w.weeklyHours - 40;
			overtimePay = otHours * 1.5f * w.hourlyWage;
			regularPay = 40 * w.hourlyWage;
		}else {
			regularPay = w.hourlyWage + w.weeklyHours;
		}
		
		weeklySalary = overtimePay + weeklySalary;
		
		return weeklySalary;
		
	}
	
	public static Predicate<WeeklySalary> isovertime = e -> e.weeklyHours > 40;
	
	public static boolean BegwithId(Employee sp) {

		String name = sp.getEmpid();

		if (name.startsWith("G"))
			return true;
		return false;
	}
	
	
}
