package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}
	@Test
	public void testIndexOutOfBoundsExceptionNotRaised() 
	    throws IndexOutOfBoundsException {
	 
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}
	@Test
	public void testSumme1PositiveUnd1NegativeIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(25,  -10) == 15);
	}
}
