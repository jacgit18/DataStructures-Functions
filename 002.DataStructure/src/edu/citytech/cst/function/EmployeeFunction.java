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
	
	public static float getYearlySalary(Employee e) {
		float totalyearlySalary =
				e.days.monday + e.days.tuesday + 
				e.days.wendesday + 
				e.days.thursday + 
				e.days.friday +
				e.days.saturday + 
				e.days.sunday * 52;	
		
		return totalyearlySalary;
		
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
	
	public static boolean Gender(Employee sp) {

		String gender = sp.getGender();

		if (gender.equals("male"))
			return true;
		return false;
	}
	
	public static boolean Gender2(Employee sp) {

		String gender = sp.getGender();

		if (gender.startsWith("f"))
			return true;
		return false;
	}


	public static boolean RichestBourough(Employee sp) {

		String bourough = sp.getRegion();
		// use .equals for strings

		if (bourough.startsWith("M"))
			return true;
		return false;
	}
	
	public static boolean bxBourough(Employee sp) {

		String bourough = sp.getRegion();
		// use .equals for strings

		if (bourough.equals("Bronx"))
			return true;
		return false;
	}
	
}
