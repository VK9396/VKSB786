package com.it.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMatrial implements ICourseMaterial {

	
	 public JavaCourseMatrial() {
		 System.out.println("javaCourseMatrial () :: 0-args Parameter");
	 }
	@Override
	public String courseMaterial() {
		 System.out.println("javaCourseMaterial.courseMaterial()");
		return "1.OOPs. 2. Exception Handling , 3. Collection Framework";
	}

	@Override
	public double price() {
		System.out.println("javaCourseMaterial.price()");
		return 3000;
	}

}
