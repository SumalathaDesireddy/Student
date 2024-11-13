package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class HomeController {
	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee)context.getBean("emp");
		System.out.println(e.getEmName());
		System.out.println(e.getSalary());

	}
}
