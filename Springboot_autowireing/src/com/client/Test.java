package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	 Student st=(Student)apc.getBean("s");
	 System.out.println(st.getRollno());
	 System.out.println(st.getName());
	 System.out.println(st.getMarks());
	 System.out.println(st.getAdr().getArea());
	 System.out.println(st.getAdr().getPincode());
}
}
