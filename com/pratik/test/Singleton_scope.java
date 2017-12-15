package com.pratik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratik.entity.employee;

public class Singleton_scope {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/pratik/cfg/config.xml");
		employee e1=(employee)ctx.getBean("emp");
		System.out.println("\n\t1)Employee--->"+e1.hashCode());
		employee e2=(employee)ctx.getBean("emp");
		System.out.println("\n\t2)Employee--->"+e1.hashCode());
		
		if(e1.hashCode()==e2.hashCode())
		{
			System.out.println("\t\tYou are in Singleton");
		}
		else
			System.out.println("\t\tExit");

	}

}
