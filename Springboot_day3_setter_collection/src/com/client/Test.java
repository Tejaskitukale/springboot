package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.College;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	College co=(College)apc.getBean("c");
	System.out.println(co.getCname());
	System.out.println(co.getDepartment());
	System.out.println(co.getCourse());
	
	//using enhance for loop
	//for(String c:co.getCname()) {
		//System.out.println(c);
		
//	}
	//for(String c:co.getDepartment()) {
		//System.out.println(c);
	//}
//	using iteration lambala expression
//	 co.getCname().forEach(a ->{
//	 System.out.println(a);
//		 });
//	 co.getDepartment().forEach(b ->{
//		 System.out.println(b);
//			 });
//	 co.getCourse().forEach((k,v)->{
//		 System.out.println(k+"="+v);
//	 });
	//method references
	co.getCname().forEach(System.out::println);
	co.getDepartment().forEach(System.out::println);
}
}
