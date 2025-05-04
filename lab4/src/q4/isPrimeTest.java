package q4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class isPrimeTest {
	isPrime p1 = new isPrime();
	
	//private final PrintStream standardOut = System.out;
	//private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	/*@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}*/
	
	@Test
	public void testSkipWhile() {
		isPrime.printPrimes(0);
		//p1.printPrimes(0);
		System.out.println("Result for Skip While Path");
		//Assert.assertEquals("Prime: 2", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testFullPath() {
		isPrime.printPrimes(3);
		//p1.printPrimes(3);
		System.out.println("Result for Full Path");
		//Assert.assertEquals("Prime: 2\nPrime: 3\nPrime: 5", outputStreamCaptor.toString().trim());
	}
	
	/*@After
	public void tearDown() {
	    System.setOut(standardOut);
	}*/
}
