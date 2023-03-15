package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("before test executed..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after executing  all test cases ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
	public void testAdd() {
		int b=5;
		int e =6;
		int expectedValue = 11;
		int actualValue =calc.add(b, e);
		assertEquals(expectedValue,actualValue);
		
		
	}
	
//	@Test
//	public void testAdd2() {
//		fail("Not yet implemented");
//	}

}
