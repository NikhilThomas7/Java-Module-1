package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testcalculator {
	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
		
	}
	@Test
	public void testPower() {
//		fail("Not yet implemented");
		int inputBase =2;
		int exp =3;
		int expectedValue= 8;
		int actualvalue = calc.power(inputBase,exp);
		assertEquals(expectedValue,actualvalue);
	}
	@Test
	public void testPowerZero() {
		int inputBase = 0;
		int exp =0;
		int expectedValue =0;
		int actualValue = calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
				
		
	}

}
