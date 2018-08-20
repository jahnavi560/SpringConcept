package CIObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/CIObject/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee) factory.getBean("EmployeeBean");
		emp.displayInfo();
	}  
}
