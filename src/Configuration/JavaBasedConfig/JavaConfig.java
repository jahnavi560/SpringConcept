package Configuration.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//java based
@Configuration
public class JavaConfig {

	//java based
	@Bean
	public Employee getEmp() {
		return new Employee(1, "jj", getAddress());
	}
	@Bean
	public Address getAddress() {
		return new Address("Bhuj", "Gujarat", "India");
	}
	
}
