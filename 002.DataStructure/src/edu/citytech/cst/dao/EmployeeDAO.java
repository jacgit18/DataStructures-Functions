package edu.citytech.cst.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

import edu.citytech.cst.model.Employee;

public class EmployeeDAO {
	
	private static List<Employee> list = new ArrayList<>();
	
	
	static {

		String fileName = "/data/exam1/employee-data.json";
		Gson gson = new Gson();

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.map(json ->	{				
				Employee e = gson.fromJson(json, Employee.class);				
				return e;
		    })
			.forEach(list::add);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

	public List<Employee> findAll() {
		return list;
	}

}
