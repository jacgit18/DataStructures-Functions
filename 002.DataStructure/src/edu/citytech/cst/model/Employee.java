package edu.citytech.cst.model;

public class Employee {



	String empid;
	String gender;
	String region;
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


	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
    public float getHourlywage() {
		return hourlywage;
	}


	public void setHourlywage(float hourlywage) {
		this.hourlywage = hourlywage;
	}


	public Day getDays() {
		return days;
	}


	public void setDays(Day days) {
		this.days = days;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", gender=" + gender + ", region=" + region + ", days=" + days
				+ ", hourlywage=" + hourlywage + "]";
	}


	
}

