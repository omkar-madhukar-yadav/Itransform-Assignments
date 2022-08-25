package assignment.springcore.assignment.springcore.third;

public interface BankAccountService {

	
	public double withdraw(String accId, double bal);
	
	public double deposite(String accId, double bal);
	
	
	public double getBalance(String accId);
}
