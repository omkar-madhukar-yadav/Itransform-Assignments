package assignment.springcore.assignment.springcore.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	
	@Autowired
	BankAccountServiceImpl serbank;
	
	public void makeOPerations(String accId,double bal) {
		
		System.out.println(serbank.deposite(accId, bal));
		
		System.out.println(serbank.withdraw(accId, bal));
		
		System.out.println(serbank.getBalance(accId));
		
	}
}
