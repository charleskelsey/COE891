package q2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import q2.Function;

public class FunctionTest {
	Function q;
	
	@Before
	public void init () {
		q = new Function();
	}
	
	@Test
	public void testFuncAB () {
		assertEquals(1, q.func(2, 3));
	}
	
	@Test
	public void testFuncBA () {
		assertEquals(1, q.func(3, 2));
	}

	@Test
	public void testFuncEq () {
		assertEquals(0, q.func(2, 2));
	}
	
}
