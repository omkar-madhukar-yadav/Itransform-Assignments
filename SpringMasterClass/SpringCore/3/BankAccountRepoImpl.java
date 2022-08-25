package assignment.springcore.assignment.springcore.third;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepoImpl implements BankAccountRepo {

	List<BankAccount> repo =  Arrays.asList(
			new BankAccount("1","omkar","saving",5000),
			new BankAccount("2","Indranil","saving",6000),
			new BankAccount("3","swapnil","current",4000)
			
			);
	
	
	
	
	@Override
	public double showBalance(String accId) {
		
		 List<BankAccount> a =repo.stream().filter(p -> p.getAccountId().equals(accId)).collect(Collectors.toList());
		 
		 
		 
		 
		return 5000;
	}

	@Override
	public double updateBalance(String accId, double bal) {
		
		double b = bal + 5000;
		return b;
	}

}
