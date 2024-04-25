package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	 Product ptr=(Product)apc.getBean("pr");
	 System.out.println(ptr.getPid());
	 System.out.println(ptr.getPname());
	 System.out.println(ptr.getCategory());
	 System.out.println(ptr.getPrice());
	 System.out.println(ptr.getAdr().getArea());
	 System.out.println(ptr.getAdr().getPlotno());
	 System.out.println(ptr.getAdr().getCity());
	 System.out.println(ptr.getAdr().getState());
	 System.out.println(ptr.getAdr().getPincode());
}
}
