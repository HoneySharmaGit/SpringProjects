package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client_App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/test.xml");
		Car c1 = (Car) ap.getBean("c1");
		c1.getDetails();
		System.out.println();
		Car c2 = (Car) ap.getBean("c2");
		c2.getDetails();
	}
}
