package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSub {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testsub() {
		int b=5;
		int e =6;
		int expectedValue = -1;
		int actualValue =calc.sub(b, e);
		assertEquals(expectedValue,actualValue);
		
		
	}

}
