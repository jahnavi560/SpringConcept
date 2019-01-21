package Configuration.AnnotationBasedConfig;

import org.springframework.stereotype.Component;

@Component(value="EmployeeBean")
public class Employee {
	private String name;
	private int id;
	
	
	public void displayInfo() {
		 System.out.println("Employee Called");  
	}
	
}
