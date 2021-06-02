package com.it.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	 
  @Autowired
 @Qualifier("c")
	   private  ICourseMaterial material; //Has-A Property
	
	public void preparation(String examName) {
		System.out.println("Preparation Start for "+examName);
		String courseContent = material.courseMaterial();
		double price = material.price();
		System.out.println("Preparation is going on using "+courseContent+"material with price :: "+price);
		System.out.println("Preparation is Completed for "+examName);
	}
	
	

}
