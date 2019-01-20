package tests;

import static org.junit.Assert.*;
import static classes.Calculator.*;

import org.junit.Test;

public class CalculatorTest {
	
	double result;
	double a=3;
	double b=9;

	@Test
	public void addition_passTwoNumbers_returnsSum() {
		result=addition(a, b);
		assertEquals(12.0, result, 1);
	}
	
	@Test
	public void subtraction_passTwoNumbers_returnsDifference() {
		result=substraction(a, b);
		assertEquals(-6.0, result, 1);
	}
	
	@Test
	public void multiplication_passTwoNumbers_returnsProduct() {
		result=multiplication(a, b);
		assertEquals(27, result, 1);
	}
	
	@Test
	public void division_passTwoNumbers_returnsResult() {
		result=division(a, b);
		assertEquals(0.3333, result, 1);
	}
	
	@Test (expected=java.lang.ArithmeticException.class) 
	public void division_passZeroAndAnotherNumber_returnException() {
		result=division(0, b);
	}

}
