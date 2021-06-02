package com.it.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c")
//@Primary
public class CCourseMaterial implements ICourseMaterial {

	public CCourseMaterial() {
		System.out.println("CCourseMaterial :: 0-args Param Constructoru");
	}
	
	@Override
	public String courseMaterial() {
		System.out.println("CCourseMaterial.courseMaterial()");
		return "1.C BAsice , 2.C Functions , 3. C Gaming Labriry";
	}

	@Override
	public double price() {
		System.out.println("CCourseMaterail.price()");
		
		return 1500;
	}
	
	public String offer() {
		return "free";
	}

}
