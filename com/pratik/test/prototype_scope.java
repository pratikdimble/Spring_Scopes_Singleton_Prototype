package com.pratik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratik.entity.person;

public class prototype_scope {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/pratik/cfg/config.xml");
		person p1=(person)ctx.getBean("per");
		System.out.println("\n\t1.Person-->"+p1.hashCode());
		person p2=(person)ctx.getBean("per");
		System.out.println("\n\t1.Person-->"+p2.hashCode());
		if(p1.hashCode()==p2.hashCode())
			System.out.println("\t\tIn Singleton");
		else
			System.out.println("\t\tIn Prototype");

	}

}
