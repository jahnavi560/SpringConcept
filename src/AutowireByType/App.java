package AutowireByType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/AutowireByType/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
	
		System.out.println("Autowire By Type");
		A a2 = (A) factory.getBean("ABean2");
		a2.displayInfo();
	
	
	}
}
