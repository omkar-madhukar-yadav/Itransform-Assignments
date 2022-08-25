package assignment.springcore.assignment.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext appcon = SpringApplication.run(Application.class, args);
		
		Customer c = appcon.getBean(Customer.class);
		
		c.Display();
	
		
	}

}
