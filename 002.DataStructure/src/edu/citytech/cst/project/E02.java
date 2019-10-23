package edu.citytech.cst.project;

import java.util.stream.Stream;
/**
 * @author jac
 *
 */
class Tax {
	float rate;
	float salary;
	float balance;
	
	public Tax(float balance) {	
		this.balance = balance;	
	}
	
	public Tax(float rate, float salary) {		
		this.rate = rate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Tax [rate=" + rate + ", salary=" + salary + ", balance=" + balance + "]";
	}		
}

public class E02 {
	
	
	public static void main(String[] args) {
		
		Stream<Tax> stream = Stream.of(new Tax(.10f,97_00f)
				 ,new Tax(.12f,39_475f)
				 ,new Tax(.22f,84_200f)
				 ,new Tax(.24f,160_725f));
		
		
		stream.reduce(new Tax(10_000), (a,c) -> {
			
				System.out.println(c);
			      
		    	  a = c;
		    	  return a;
		      });		
	}
}
