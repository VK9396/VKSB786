package com.itsp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
 public class JavaCourseMaterials implements ICourseMaterial {

	
	 public JavaCourseMaterials() {
	   System.out.println("JavaCoureseMaterial- 0-args Constractour");
	}
	@Override
	public String courseMaterial() {
		 System.out.println("JavaCourseMaterials.courseMaterial()");
		return "1.java fundamental , 2.OOPs , 3 Collection F/w ";
			}

	@Override
	public double price() {
		 System.out.println("JavaCourseMaterial.Price()");
		return 20000;
	}

//	b.method()
	public void getMessage(String msg) {
		System.out.println("Java Business Method");
	}
}
