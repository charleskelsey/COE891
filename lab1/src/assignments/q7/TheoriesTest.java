package assignments.q7;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest {
	//Uncomment 1 @DataPoints at a time to check for different situations
	
//	@DataPoints
//	public static int[] val1 () {
//		return new int[] {1, 2, 307, 400567};
//	}
	
//	@DataPoints
//	public static int[] val2 () {
//		return new int[] {0, -1, -10, -1234, 1, 10, 6789};
//	}
	
	@DataPoints
	public static int[] val3 () {
		return new int[] {0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
	}
	
	@Theory
	public void theory1(Integer a, Integer b) {
		Assume.assumeTrue(a > 0 && b > 0);
		
		// dont work on val3
		//assertTrue(a + b > a);
		//assertTrue(a + b > b);
		
		// The error occurs because of an integer overflow in the expression a + b. 
		// When adding 1 (from val3[4]) to Integer.MAX_VALUE (from val3[7]), 
		// the sum exceeds the range of int, leading to an overflow. 
		// In Java, integer overflow wraps around, causing unexpected results.
		
		// Use of (long) Casting. By casting a and b to long, we allow calculations
		// to handle values larger than the int range, preventing overflow.
		
		// this line ensures that the test only runs when the sum does not exceed
		// the maximum int value.
		Assume.assumeTrue((long) a + (long) b <= Integer.MAX_VALUE);
		
        assertTrue("a + b > a failed for a = " + a + ", b = " + b, a + b > a);
        assertTrue("a + b > b failed for a = " + a + ", b = " + b, a + b > b);
        
	}
	
	@Theory
	public void theory2(Integer a, Integer b) {
		//assertTrue(a + b == b + a); dont work on val3
		
		assertTrue("a + b != b + a for a = " + a + ", b = " + b, a + b == b + a);
	}
}
