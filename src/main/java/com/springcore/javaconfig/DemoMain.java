package com.springcore.javaconfig;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/NewFile.xml");
		Student student = context.getBean("firstClass", Student.class);
		System.out.println(student);
	}
}
