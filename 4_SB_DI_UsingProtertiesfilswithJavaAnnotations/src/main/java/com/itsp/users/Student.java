package com.itsp.users;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import com.itsp.beans.ICourseMaterial;

//@Component("std")
@Named("std")
public class Student {
	//@Autowired
	@Inject
	@Resource(name="cid")
	//@Qualifier("cid") 
	//@Named("py")
	private ICourseMaterial material;
	
	
	public void preprationKit(String kitName) {
		System.out.println("Preparation Kit Name :"+kitName);
		String course = material.courseMaterial();
		double fee = material.price();
		System.out.println("Preparation Going on using "+course+" with price "+fee);
		System.out.println("Preparation is Complete for  "+kitName);
	}

}
