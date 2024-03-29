package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)
public class PrimeNumberTest {

	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber PrimeNumber;
	
	@Before
	public void initialize() {
		PrimeNumber = new PrimeNumber();
		
	}

	public PrimeNumberTest(Integer inputNumber, Boolean expectedResult, paramtest.PrimeNumber primeNumber) {
//		super();
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
//		PrimeNumber = primeNumber;
	}
	@Parameterized.Parameters
	public static Collection PrimeNumber(){
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{10,true}}
		
				);
	}
	
	

}
