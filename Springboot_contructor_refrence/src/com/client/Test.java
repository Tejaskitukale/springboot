package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	 Person pc=(Person)apc.getBean("p");
	 System.out.println(pc.getPid());
	 System.out.println(pc.getPname());
	 System.out.println(pc.getPaddress());
	 System.out.println(pc.getContact().getSim());
	 System.out.println(pc.getContact().getContact());
}
}
