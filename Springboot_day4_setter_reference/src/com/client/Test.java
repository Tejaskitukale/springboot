package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;



public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	
	Student St=(Student)apc.getBean("s");
	System.out.println(St.getRollno());
	System.out.println(St.getSname());
	System.out.println(St.getContact());
	System.out.println(St.getMarks());
	System.out.println(St.getAdr().getPincode());
	System.out.println(St.getAdr().getArea());
	System.out.println(St.getAdr().getHno());
}
}
