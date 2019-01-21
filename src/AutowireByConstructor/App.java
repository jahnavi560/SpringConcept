package AutowireByConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
	/*	Resource resource = new ClassPathResource("/AutowireByConstructor/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
	
		System.out.println("Autowire By Constructor");
		A a3 = (A) factory.getBean("ABean3");
		a3.displayInfo();*/
	ApplicationContext ap = new ClassPathXmlApplicationContext("/AutowireByConstructor/applicationContext.xml");
	A a3 = (A) ap.getBean("ABean3");
	a3.displayInfo();
}
}
