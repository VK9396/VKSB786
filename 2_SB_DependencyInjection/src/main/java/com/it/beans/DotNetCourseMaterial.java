package com.it.beans;

import org.springframework.stereotype.Component;

@Component("dotNet")
public class DotNetCourseMaterial implements ICourseMaterial {

	@Override
	public String courseMaterial() {
	 System.out.println("DotNetCourseMaterial.courseMaterial()");
		return "1.C# , 2. OPPs";
	}

	@Override
	public double price() {
		 System.out.println("DotNewCourseMaterial.price()");
		return 4000;
	}
	public String offer() {
		return "free";
	}

}
