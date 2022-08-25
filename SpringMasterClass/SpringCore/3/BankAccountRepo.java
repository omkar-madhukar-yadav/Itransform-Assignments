package assignment.springcore.assignment.springcore.third;

public interface BankAccountRepo {
	
	public double showBalance(String accId);
	
	public double updateBalance(String accId,double bal);
	

}
