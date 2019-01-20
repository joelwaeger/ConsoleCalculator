package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	@Before
	public void setup(){
		Calculator testee;
		
	}
	
	@Test
	public void testSummeZweiPositiveIsOk(Calculator testee) {
		testee = new Calculator();
		assertTrue(testee.summe(10,25) == 35);
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(25,  10) == 15);
	}
	@Test
	public void testDivisionZweiPositiveIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(25,  10) == 15);
	}
	
}
