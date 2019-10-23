package edu.citytech.cst.project;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;

public class T01 {
	
	

	public static void main(String[] args) {
		System.out.println("**First  method*****************************");
		ex01(args);
		System.out.println("********************************************");
		System.out.println(" ");
		
		System.out.println("**Second  method****************************");
		ex02(args);
		System.out.println("********************************************");
		System.out.println(" ");

		System.out.println("**Third  method*****************************");
		ex03(args);
		System.out.println("********************************************");
		System.out.println(" ");

		System.out.println("**Fourth  method****************************");
		ex04(args);
		System.out.println("********************************************");
		System.out.println(" ");

		System.out.println("**Fifth  method*****************************");
		ex05(args);
		System.out.println("********************************************");
		System.out.println(" ");

		System.out.println("**Sixth  method*****************************");
		ex06(args);
		System.out.println("********************************************");
		System.out.println(" ");

		System.out.println("**Seventh  method***************************");
		ex07(args);
		System.out.println("********************************************");



	}
	

	public static void ex01(String[] args) {

// original code in this method

		float number[] = { 90, 90, 90, 45};

		float avg = 0;
		float total = 0;

		float lowestscore = 0;

		for (float f : number) {

			lowestscore = f < lowestscore ? f : lowestscore;
			total += f;
		}

		avg = (total - lowestscore) / (number.length - 1);

		System.out.println(total);
		System.out.println(lowestscore);
		System.out.println(avg);

	}
	// original 
	
	// find avg by dropping lowest score
//	float number [] = {900,100, 90, 50, 40, 103, 20
//			
//	};
//	
//	float avg = 0;
//	float total = 0;
//	
//	for (int i = 0; i < number.length; i++) {
//	
//		total = total + number[i];
//		avg = total /number.length;
//	}
//	
//	

	public static void ex02(String[] args) {

		// find highest number
		int number[] = { 100, 90, 50, 40, 103, 20, 900};

		int max = number[0];

		for (int i = 0; i < number.length; i++) {

			if (max < number[i]) {
				max = number[i];
			}
			System.out.println(max);
		}

	}

	public static void ex03(String[] args) {

		// find highest number functional style
		int number[] = { 900, 100, 90, 50, 40, 103, 20};

		OptionalInt max = Arrays.stream(number)
				// .peek(System.out::println)
				.reduce((a, c) -> a = a > c ? a : c);
		System.out.println(max);

	}

// check

	public static void ex04(String[] args) {

		float number[] = { 1_000f, 90f, 90f, 90f, 45f};

		float avg = 0;
		float total = 0;

		float lowestscore = 150;
		float highestscore = 0;

		for (float f : number) {

			lowestscore = f < lowestscore ? f : lowestscore;
			highestscore = f > highestscore ? f : highestscore;

			total += f;
		}

		avg = (total - lowestscore - highestscore)/ (number.length -2);


		System.out.println(total);
		System.out.println(lowestscore);
		System.out.println(highestscore);
		System.out.println(avg);

	}

	public static void ex05(String[] args) {

		// functional version

		double number[] = { 1_000f, 90f, 90f, 90f, 45f};

		DoubleSummaryStatistics summary = Arrays.stream(number).summaryStatistics();

		// minus 1 is for lowest score
		double avg = summary.getAverage();
		double modifiedavg = (summary.getSum() - summary.getMin()) / (summary.getCount() - 1);
		double olympicavg = (summary.getSum() - summary.getMax() - summary.getMin()) / (summary.getCount() - 1);

		System.out.println(summary);
		System.out.println(avg);
		System.out.println(modifiedavg);
		System.out.println(olympicavg);

	}

	public static void ex06(String[] args) {

		String[] rows = { " A:100", "B:95", "C:100", "D:106"};

		// predicate must return boolean
		Predicate<String> predicate = e -> {
			String x = e.split(":")[1];
			float grade = Float.parseFloat(x);

			return grade > 95;
		};

		Arrays.stream(rows).filter(predicate).forEach(System.out::println);
	}
	
	
	public static void ex07(String[] args) {

		String row = "100, 95, 97, 75, 100";
		String[] grade = row.split(",");
		
		Function<String, Float> x = Float::parseFloat;  
		
		Optional<Float> lowest =
		Arrays.stream(grade)
//		.map(e -> Float.parseFloat(e))
		// alternative to commented out part
		.map(Float::parseFloat)
		.reduce((a, c) -> a < c ? a : c);
		
		System.out.println(lowest);
	
	}
	
	

}
