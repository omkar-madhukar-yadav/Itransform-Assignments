package assignment.springcore.assignment.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
//		ApplicationContext appcon = SpringApplication.run(Application.class, args);
	
		ClassPathXmlApplicationContext appcon = new ClassPathXmlApplicationContext("test.xml");
		
		Customer customer = appcon.getBean(Customer.class);
		
		customer.Display();
	
		
	}

}
