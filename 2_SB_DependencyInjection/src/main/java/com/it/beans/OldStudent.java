package com.it.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oldstd")
//@Primary
public class OldStudent {
	
	@Autowired
	@Qualifier("dotNet")
	private ICourseMaterial material;
	
	public OldStudent() {
		System.out.println("OldStudent ::: 0-arg Constructor");
	}
	
	public void courseOffer(String courseName) {
		System.out.println("================OFFER COURSE =================");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Start Preparation for Old Student");
		String content = material.courseMaterial();
		double price = material.price();
		String offer = material.offer();
		System.out.println("Old Student Preparation Going ON "+courseName+" with Offer "+offer);
	}

}
