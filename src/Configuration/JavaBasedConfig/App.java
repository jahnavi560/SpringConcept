package Configuration.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = (Employee)applicationContext.getBean(Employee.class);
		employee.displayInfo();
	}  
}
