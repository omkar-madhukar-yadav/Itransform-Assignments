package assignment.springcore.assignment.springcore.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	BankAccountRepoImpl reimpl;
	
	
	@Override
	public double withdraw(String accId, double bal) {
		
		double bal1 = reimpl.updateBalance(accId, -(bal));
		
		return bal1;
	}

	@Override
	public double deposite(String accId, double bal) {
		
		double bal1 = reimpl.updateBalance(accId, bal);
		return bal1;
	}

	@Override
	public double getBalance(String accId) {
		
		double b =reimpl.showBalance(accId);
		return b;
	}

}
