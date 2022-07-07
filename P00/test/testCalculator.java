import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCalculator {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.add(a, b);
		
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		// Arrange
		int a = 8;
		int b = 7;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.substract(a, b);
		
		//Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		//Arrange
		int a = 2;
		int b = 3;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 6;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//Arrange
		int a = 8;
		int b = 4;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public int divide (int a, int b) {
		//here
		if (b==0) {
			throw new IllegalArgumentException("Division by zero is not supported");
		}
		return a / b;
	}
	
	@Test
	public void averageTest() {
		//Arrange
		int a = 8;
		int b = 4;
		int c = 2;
		int d = 1;
		int e = 10;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.calcAverage(a, b, c, d, e);
		
		//Assert
		int expected = 5;
		assertEquals(expected, actual);
	}

}
