package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10,25) == 35);
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk(){
		testee = new Calculator();
		assertTrue(testee.subtraction(25,  10) == 15);
	}
}
