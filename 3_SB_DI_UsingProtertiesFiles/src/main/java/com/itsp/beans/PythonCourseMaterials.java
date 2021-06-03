package com.itsp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("py")
 public class PythonCourseMaterials implements ICourseMaterial {

	
	 public PythonCourseMaterials() {
	   System.out.println("PythonCoureseMaterial- 0-args Constractour");
	}
	@Override
	public String courseMaterial() {
		 System.out.println("PythonCourseMaterials.courseMaterial()");
		return "1.core python , 2.OOPs , 3. Advance Python ";
			}

	@Override
	public double price() {
		 System.out.println("PythonCourseMaterial.Price()");
		return 10000;
	}

//	b.method()
	public void getMessage(String msg) {
		System.out.println("python Business Method");
	}
}
