package assignments.q1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayMultTest {
	int[] a1 = {1, 2, 3};
	int[] a2 = {2, 3, 4, 5};
	ArrayMult a;
	int[] m1;
	int[] m2;
	
	@Before
	public void setup () {
		a = new ArrayMult();
		m1 = a.mult(a1, a2);
		m2 = a.mult(a2, a1);
	}
	
	@Test
	public void testMult() {
		for (int i = 0; i < a1.length; i ++) {
			assertEquals(a1[i] * a2[i], m1[i]);
		}
		for (int i = 0; i < a1.length; i ++) {
			assertEquals(a1[i] * a2[i], m2[i]);
		}
	}

}
