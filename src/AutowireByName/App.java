package AutowireByName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/AutowireByName/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Autowire By Name");
		A a1 = (A) factory.getBean("ABean1");
		a1.displayInfo();
	
		
	}
}
