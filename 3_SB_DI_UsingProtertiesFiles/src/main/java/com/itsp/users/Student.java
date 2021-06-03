package com.itsp.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.itsp.beans.ICourseMaterial;

@Component("std")
public class Student {
	@Autowired
	@Qualifier("cid") 
	private ICourseMaterial material;
	
	
	public void preprationKit(String kitName) {
		System.out.println("Preparation Kit Name :"+kitName);
		String course = material.courseMaterial();
		double fee = material.price();
		System.out.println("Preparation Going on using "+course+" with price "+fee);
		System.out.println("Preparation is Complete for  "+kitName);
	}

}
