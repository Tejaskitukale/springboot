package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Labor;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	 Labor lab=(Labor)apc.getBean("la");
	 System.out.println(lab.getLid());
	 System.out.println(lab.getName());
	 System.out.println(lab.getCompany());
	 System.out.println(lab.getSalary());
}
}
