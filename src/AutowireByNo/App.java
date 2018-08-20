package AutowireByNo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/AutowireByNo/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("No Autowire");
		A a1 = (A) factory.getBean("ABean4");
		a1.displayInfo();
	
		
	}
}
