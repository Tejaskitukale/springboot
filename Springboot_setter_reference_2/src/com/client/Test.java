
package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;
import com.model.Supplier;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/config/config.xml");
	Product pro=(Product) apc.getBean("pro");
	System.out.println(pro.getPid());
	System.out.println(pro.getPname());
	System.out.println(pro.getCategory());
	System.out.println(pro.getPrice());
	System.out.println(pro.getSup().getSid());
	System.out.println(pro.getSup().getSname());
	System.out.println(pro.getSup().getContacts());
	System.out.println(pro.getSup().getAdr().getArea());
	System.out.println(pro.getSup().getAdr().getPlotno());
	System.out.println(pro.getSup().getAdr().getCity());
	System.out.println(pro.getSup().getAdr().getState());
	System.out.println(pro.getSup().getAdr().getPincode());
	
}
}
