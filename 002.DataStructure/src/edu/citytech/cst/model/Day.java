package edu.citytech.cst.model;

public class Day {
	
	public float monday;
	public float tuesday;
	public float wendesday; // misspelled in json file so misspelled in code to match
	public float thursday;
	public float friday;
	public float saturday;
	public float sunday;
	@Override
	public String toString() {
		return "Day [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wendesday + ", thursday=" + thursday
				+ ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}
	
	

}
