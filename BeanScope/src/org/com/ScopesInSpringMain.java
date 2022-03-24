package org.com;
 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class ScopesInSpringMain{
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Country countryObj1 = (Country) appContext.getBean("CountryBean");
		countryObj1.setCountryName("India");
		System.out.println("Country Name:"+countryObj1.getCountryName());
		 
		//getBean called second time
		Country countryObj2 = (Country) appContext.getBean("CountryBean");
		System.out.println("Country Name:"+countryObj2.getCountryName());
	}
}