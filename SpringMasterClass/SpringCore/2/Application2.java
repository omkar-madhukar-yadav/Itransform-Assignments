package assignment.springcore.assignment.springcore.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		
		
		ApplicationContext appcon = SpringApplication.run(Application2.class, args);
		
		Question q = appcon.getBean(Question.class);
		
		q.display();
	
		
		
		
	
		
	}

}
