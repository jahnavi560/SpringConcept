package annotationConfigVScomponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("\nOnly beans defination----------------------");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/1beans.xml");

		System.out.println("\nBeans with setter properties----------------------");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/2beans-with-prop.xml");

		System.out.println("\nOnly Annotation config. only activate annotations----------------------");
		ApplicationContext context3 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/3only-annotation-config.xml");

		System.out.println("\nOnly Annotation config with bean defination----------------------");
		ApplicationContext context4 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/4annotation-config-with-beans.xml");
		
		System.out.println("\nOnly Component scan. it will do both define bean and activate annotations----------------------");
		ApplicationContext context5 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/5only-component-scan.xml");
		
		System.out.println("\nComponent scan and Annotation config ----------------------");
		ApplicationContext context6 = new ClassPathXmlApplicationContext("/annotationConfigVScomponentScan/6component-scan-with-annotation-config.xml");

		/*
		 * Strange !! With above configuration 6th we are discovering beans two times
		 * and activating annotations two times as well. But output got printed one time
		 * only. Why? Because spring is intelligent enough to register any configuration
		 * processing only once if it is registered multiple tiles using same or
		 * different ways. Cool !!
		 */

	}
}
