import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException()
	{
		System.out.println("\nInsufficient Balanace");
	}
}
 
class IllLegalBankTransactionException extends Exception
{
	public IllLegalBankTransactionException()
	{
		System.out.println("\nYou must enter the Positive value");

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
	public boolean cashWithdrawal(double amount) throws InsufficientBalanceException,IllLegalBankTransactionException
	{
		if(amount< balance && amount != 0)
		{
			if (amount < 0)
			{
				throw new IllLegalBankTransactionException();
			}
			balance=balance-amount;
			return true;
		}
		 
		
		else
			throw new InsufficientBalanceException();
	}
	
	
}

public class Bank
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		BankAccount acc1=new BankAccount("Omkar",1000);
		try
		{
			System.out.println("\nAccount Balance : "+acc1.balanceEnquiry());
			System.out.println("\nEnter withdrawal amount :");
			double aa=s.nextDouble();
			if(acc1.cashWithdrawal(aa))
			{
				System.out.print("\nAmount Drawn successfully");
				System.out.print("\nRemaining Balance : "+acc1.balance);
			}
			else
			{
				System.out.println("\nUnsuccessful Transaction");
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
		catch(IllLegalBankTransactionException e)
		{
			System.out.println(e);
		}



}
}