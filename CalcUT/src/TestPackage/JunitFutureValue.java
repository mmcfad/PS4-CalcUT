package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CalcPackage.FutureValueCalc;

public class JunitFutureValue {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public final void testFutureValueCalc(){
		
		
		assertEquals(FutureValueCalc.futureValueCalc(1000, 5, 2), 1104.08, .01);
		assertEquals(FutureValueCalc.futureValueCalc(10000, 5, 2), 11040.81, .01);
		assertEquals(FutureValueCalc.futureValueCalc(10000, 3, 3.5), 11087.18, .01);
	}

}
