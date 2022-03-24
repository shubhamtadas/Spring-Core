package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springMaven.configuration.ApplicationConfiguration;

public class SpringJavaConfigMain {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		  ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		  Country countryObj = (Country) appContext.getBean("countryObj");
		  String countryName=countryObj.getCountryName();
		  
		  System.out.println("Country name: "+ countryName);

	}

}
