package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;

public class Client_App {

	public static void main(String[] args) {

		// load XML Configuration File.
		Resource r = new ClassPathResource("resource/test.xml");

		// load the XML into IOC container.
		BeanFactory f = new XmlBeanFactory(r); // it creates Singleton Classes
											   // and, lazy loading
		
		Test t1=(Test) f.getBean("t");
		Test t2=(Test) f.getBean("t");
		Test t3=(Test) f.getBean("t");

	}

}
