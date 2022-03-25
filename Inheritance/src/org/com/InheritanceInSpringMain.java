package org.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceInSpringMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee) appContext.getBean("employeeBean");
		System.out.println("Employee name:" + emp.getName());
		System.out.println("Employee number:" + emp.getEmployeeNumber());
	}
}