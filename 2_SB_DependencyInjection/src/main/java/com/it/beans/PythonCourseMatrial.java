package com.it.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("python")
//@Primary
public class PythonCourseMatrial implements ICourseMaterial {

	
	 public PythonCourseMatrial() {
		 System.out.println("PythonCourseMatrial () :: 0-args Parameter");
	 }
	@Override
	public String courseMaterial() {
		 System.out.println("PythonCourseMaterial.courseMaterial()");
		return "1.OOPs. 2. Exception Handling , 3. Python Advanced";
	}

	@Override
	public double price() {
		System.out.println("PythonCourseMaterial.price()");
		return 5000;
	}
	
	public String offer() {
		return "free";
	}

}
