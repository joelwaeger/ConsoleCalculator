package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	
	@Before
	public void setup(){
		testee = new Calculator();

	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10,25) == 35);
		
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk(){
		assertTrue(testee.subtraction(25,  10) == 15);
	}
	@Test
	public void testDivisionZweiPositiveIsOk(){
		assertTrue(testee.division(10,  2) == 5);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    ArrayList emptyList = new ArrayList();
	    Object o = emptyList.get(0);
	}

	@Test
	public void testSumme1PositiveUnd1NegativeIsOk(){
		assertTrue(testee.summe(25,  -10) == 15);
	}
	@Test
	public void testSummeNegativesResultatIsOk(){
		assertTrue(testee.summe(5,  -10) == -5);
	}
	@Test
	public void testSummeNullIsOk(){
		assertTrue(testee.summe(10,  -10) == 0);
	}
	@Test
	public void testSummeAddition0IsOk(){
		assertTrue(testee.summe(10,  0) == 10);
	}
	@Test
	public void testSummeMin_ValueIsOk(){
		assertTrue(testee.summe(Integer.MIN_VALUE, 1) == -2147483647);
	}
	@Test
	public void testSummeUeberMax_ValueIsOk(){
		assertEquals((long) Integer.MAX_VALUE + 1, testee.summe(2147483647, 1), 0);
	}
	@Test
	public void testSummeUnterMin_ValueIsOk(){
		assertEquals((long) Integer.MIN_VALUE + 1, testee.summe(-2147483648, 1), 0);
	}
	//Subtraction
	@Test
	public void testSubtraction1PositiveUnd1NegativeIsOk(){
		assertTrue(testee.subtraction(25,  10) == 15);
	}
	@Test
	public void testSubtractionNegativesResultatIsOk(){
		assertTrue(testee.subtraction(5,  10) == -5);
	}
	@Test
	public void testSubtractionNullIsOk(){
		assertTrue(testee.subtraction(10,  10) == 0);
	}
	@Test
	public void testSubtractionMax_ValueIsOk(){
		assertTrue(testee.subtraction(Integer.MAX_VALUE, 1) == 2147483646);
	}
	@Test
	public void testSubtractionBothNegativeIsOk( ){
		assertTrue(testee.subtraction(-10,  -10) == 0);
	}
	@Test
	public void testSubtractionUeberMax_ValueIsOk(){
		assertEquals((long) Integer.MAX_VALUE - 1, testee.subtraction(2147483647, 1));	}
	@Test
	public void testSubtractionsubtraction0IsOk(){
		assertTrue(testee.subtraction(10,  0) == 10);
		}
	//Division
		@Test
		public void testDivision1PositiveUnd1NegativeIsOk(){
			assertTrue(testee.division(10,  -2) == -5);
		}
		@Test
		public void testDivisionNegativesResultatIsOk(){
			assertTrue(testee.division(10,  -10) == -1);
		}
		@Test
		public void testDivision10IsOk(){
			assertTrue(testee.division(100,  10) == 10);
		}
		@Test
		public void testDivisionMax_ValueIsOk(){
			assertTrue(testee.division(Integer.MAX_VALUE, 1) == 2147483647);
		}
		@Test
		public void testDivisionBothNegativeIsOk(){
			assertTrue(testee.division(-10,  -10) == 1);
		}
		@Test
		public void testDivisionUeberMax_ValueIsOk(){
			assertEquals((long) Integer.MAX_VALUE / 1, testee.division(2147483647, 1));		}
		@Test
		public void testDivisionNegative10IsOk(){
			assertTrue(testee.division(-100,  10) == -10);
			}
}
