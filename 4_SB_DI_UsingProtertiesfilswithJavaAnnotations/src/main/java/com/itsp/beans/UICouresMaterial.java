package com.itsp.beans;

import javax.inject.Named;

@Named("ui")
public class UICouresMaterial implements ICourseMaterial {

	
	public   UICouresMaterial() {
	     System.out.println("UI CourseMaterial-0-args Constructor");
	}
	@Override
	public String courseMaterial() {
		 System.out.println("UICoureseMaterial.courseMaterial()");
		return "1.HTML , 2.CSS, 3.BootStrap , 4.JavaScript";
	}

	@Override
	public double price() {
		System.out.println("UICourseMaterial.Price()");
		return 2000;
	}

}
