package StaticFacoryOwn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {  
		 Resource resource=new ClassPathResource("StaticFacoryOwn/applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(resource);  
		  A a=(A)factory.getBean("bean");  
		  a.print();
	
	}  
}
