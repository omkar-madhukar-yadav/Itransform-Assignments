package assignment.springcore.assignment.springcore.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import assignment.springcore.assignment.springcore.second.Application2;
import assignment.springcore.assignment.springcore.second.Question;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		
ApplicationContext appcon = SpringApplication.run(Test.class, args);
		
		BankAccountController q = appcon.getBean(BankAccountController.class);
		
		q.makeOPerations("1", 1000);
		

	}

}
