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
		assertTrue(testee.division(25,  10) == 15);
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
		assertTrue(testee.summe(25,  -10) == 15);
	}
	@Test
	public void testSummeNegativesResultatIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(5,  -10) == -5);
	}
	@Test
	public void testSummeNullIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(10,  -10) == 0);
	}
	@Test
	public void testSummeMax_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(Integer.MAX_VALUE, 1) == -2147483647);
	}
	@Test
	public void testSummeMin_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(Integer.MIN_VALUE, 1) == -2147483647);
	}
	@Test
	public void testSummeUeberMax_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(10,  -10) == 0);
	}
	@Test
	public void testSummeUnterMin_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.summe(10,  -10) == 0);
	}
	//Subtraktion
	@Test
	public void testSubtraction1PositiveUnd1NegativeIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(25,  -10) == 15);
	}
	@Test
	public void testSubtractionNegativesResultatIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(5,  -10) == -5);
	}
	@Test
	public void testSubtractionNullIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(10,  -10) == 0);
	}
	@Test
	public void testSubtractionMax_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(Integer.MAX_VALUE, 1) == -2147483647);
	}
	@Test
	public void testSubtractionMin_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(Integer.MIN_VALUE, 1) == -2147483647);
	}
	@Test
	public void testSubtractionUeberMax_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(10,  -10) == 0);
	}
	@Test
	public void testSubtractionUnterMin_ValueIsOk(Calculator testee){
		testee = new Calculator();
		assertTrue(testee.subtraction(10,  -10) == 0);
	}

}
