package testexceptions;

import static org.junit.Assert.*;

import org.junit.Test;

import firsttest.InvalidTransactionAmountException;

public class TellerTest {
	
	Teller teller = new Teller();
	
	@Test(expected = InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		teller.validateTransaction("EUR",-100);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValidateUnacceptedCurrency() {
		teller.validateTransaction("AUSD", 100);
		
	}
	
	
}
