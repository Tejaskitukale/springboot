package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	 User us=(User)apc.getBean("u");
	 System.out.println(us.getUid());
	 System.out.println(us.getUname());
	 System.out.println(us.getPassword());
}
}
