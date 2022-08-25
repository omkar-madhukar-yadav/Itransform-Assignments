package source;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException()
	{
		System.out.println("\nInsufficient Balanace");
	}
}
 
class BankAccount 
{
	static int acc=2018111;
	String name;
	int accno=acc;
	double balance;
	
	public BankAccount(String a,double c)
	{
		
		name=a;
		balance=c;
	}

	public double balanceEnquiry()
	{
		return balance;
	}
	public double cashWithdrawal(double amount) throws InsufficientBalanceException
	{
		if(amount< balance && amount != 0)
		{
			
			balance=balance-amount;
			return balance;
		}
		 
		
		else
			throw new InsufficientBalanceException();
	}
	
	
}
