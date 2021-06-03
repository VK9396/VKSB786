package com.itsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.itsp.users.Student;

@SpringBootApplication
@ImportResource("com/itsp/cfg/context.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		Student std = context.getBean("std",Student.class);
		std.preprationKit("Amcat Exam");
		//close the container;
		((ConfigurableApplicationContext)context).close();
	}

}
