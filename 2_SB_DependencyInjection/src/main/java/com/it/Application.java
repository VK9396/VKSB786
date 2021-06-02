package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.it.beans.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//get Ioc Container
		ApplicationContext context =SpringApplication.run(Application.class, args);
		
		//get Target Spring bean class Object
		Student st = context.getBean("stud",Student.class);
		
		//invoke b.method
		st.preparation("TCS-interview");
		
		//close container
		((ConfigurableApplicationContext)context).close();
	
	
	}

}
