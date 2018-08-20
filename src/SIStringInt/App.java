package SIStringInt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {  
		 Resource resource=new ClassPathResource("/SIStringInt/applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(resource);  
		 Student student=(Student)factory.getBean("StudentBean");  
	      student.displayInfo();  
	}  
}
