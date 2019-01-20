package ch.bbw.ConsoleCalculator;

public class Calculator {
	
	public double summe( double summand1, double summand2) {
		
		return summand1 + summand2;
	}
	public int subtraction(int value1, int value2) {
		
		return value1 - value2;
	}
	public int division(int value1, int value2) {
			
		return value1 / value2;
	}
	int sum(int value1, int value2) {
        long tester = (long) value1 + (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }

    int subtractiontest(int value1, int value2){
        long tester = (long)value1 - (long) value2;
        overflowhandler(tester);
        return (int)tester;
    }

    int multiplication(int value1, int value2){
        long tester = (long) value1 * (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }

    int divisiontest(int value1, int value2){
        long tester = (long) value1 / (long) value2;
        if (tester == 0){
            throw new ArithmeticException("Result can't be 0");
        }
        return (int) tester;
    }


    private void overflowhandler(long tester) {
        if (tester > Integer.MAX_VALUE) {
            throw new ArithmeticException("Result is too big");
        }
        if (tester < Integer.MIN_VALUE) {
            throw new ArithmeticException("Result is too small");
        }
    }
}
 