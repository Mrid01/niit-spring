package com.niit.config;



import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.models.Customer;


public class TestSpring 
{
	public static void main(String[]args)
	{
		ApplicationContext appctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Customer c = (Customer)appctx.getBean("custBean");
		System.out.println("The customer details" +c.getCustId()+":"+ ""+c.getCustName()+":"+c.getCustAddress());
	}

}
