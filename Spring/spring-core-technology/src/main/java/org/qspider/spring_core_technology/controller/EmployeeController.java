package org.qspider.spring_core_technology.controller;

import org.qspider.spring_core_technology.dto.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeController {
public static void main(String[] args) {
	
	
//	BeanFactory beanFactory=new ClassPathXmlApplicationContext("mySpring.xml");
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring.xml");
	Employee employee=(Employee) applicationContext.getBean("employee");

	System.out.println("Employee ID: " + employee.getId());
	System.out.println("Employee Name: " + employee.getName());

	employee.getLaptop();
}
}
