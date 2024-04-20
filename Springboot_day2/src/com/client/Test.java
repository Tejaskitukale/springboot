package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	Student s1= (Student) apc.getBean("st");
	System.out.println(s1.getRollno());
	System.out.println(s1.getSname());
	System.out.println(s1.getContact());
	System.out.println(s1.getMarks());
		
}
}
