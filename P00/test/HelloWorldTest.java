import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
        
	    System.out.println("This is the testcase for HelloWorld");
	    String str1="This is the testcase for HelloWorld";
	    String str2="This is the testcase for HelloWorld";
	    assertEquals(str1, str2);

	}
	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented")
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, c);
			fail("Expected  an IllegalArgumentException to be thrown");
			
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported",  e.getMessage()  );
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	

}
