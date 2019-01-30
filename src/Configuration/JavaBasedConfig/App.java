package Configuration.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/Configuration/JavaBasedConfig/applicationContext.xml");
		Employee employee = (Employee)applicationContext.getBean(Employee.class);
		employee.displayInfo();
	}  
}
