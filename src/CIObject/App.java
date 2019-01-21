package CIObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		/*Resource resource = new ClassPathResource("/CIObject/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee) factory.getBean("EmployeeBean");*/
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CIObject/applicationContext.xml");  
		Employee emp = (Employee) applicationContext.getBean("EmployeeBean");
		emp.displayInfo();
	}  
}
