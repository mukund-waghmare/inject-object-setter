package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= new ClassPathXmlApplicationContext("comf.xml");
		
		Student student=(Student)con.getBean("student");
		
		System.out.println(student);
	}

}
