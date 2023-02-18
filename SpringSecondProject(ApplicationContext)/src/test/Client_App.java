package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Client_App {

	public static void main(String[] args) {
		
		// load resource and add it into IOC container.
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/test.xml");
		
		Test t1=(Test) ap.getBean("t"); // early loading or eager loading.

	}

}
