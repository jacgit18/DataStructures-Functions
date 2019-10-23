package edu.citytech.cst.project;

import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
/**
 * @author jac
 *
 */
class Grade {
	
	public Grade() {}

	public Grade(String id, float grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	public String id = "N/A"; 
	public float grade;
	
	@Override
	public String toString() {
		return "Grade [id=" + id + ", grade=" + grade + "]";
	}

	
}

public class E01 {
	


	public static void main(String[] args) {		
		e02();
	}
	
	public static void e01() {
		
		DoubleSummaryStatistics summary = Stream.of("g1:100","g2:95","g3:97","g4:90","g5:50")
		      .mapToDouble(e -> Float.valueOf(e.split(":")[1]))
		      .summaryStatistics();
		      //.average();
		
		System.out.println(summary);		
	
	}

	public static void e02() {
		
		Function<String, Grade> mapper = m -> {
	    	  String[] col = m.split(":");
	    	  String id = col[0];
	    	  float grade = Float.parseFloat(col[1]);
	    	  return new Grade(id, grade);		      
	      };
	      
	    Supplier<Stream<String>> supplier = () -> Stream.of("g1:100","g2:95","g3:97","g4:90","g5:50");
		
		Stream<Grade> s = supplier.get()
				                  .map(mapper)
				                  .filter(e -> true);		
		
        s.forEach(System.out::println);
        
        Grade avg = supplier.get().map(mapper).reduce(new Grade(), (a,c) -> {
        	a.grade += c.grade;
        	return a;
        });
        
        avg.grade = avg.grade / 5;
        
        System.out.println("avg: " + avg);
		
		
	
	}

}
