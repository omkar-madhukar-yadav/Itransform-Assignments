package source;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void test() throws InsufficientBalanceException {
		
		BankAccount ob = new BankAccount("Omy",2000);
		
		assertEquals(1000,ob.cashWithdrawal(1000));
		
		assertThrows(InsufficientBalanceException.class,() -> ob.cashWithdrawal(2500));
		
	}
	
	

}
