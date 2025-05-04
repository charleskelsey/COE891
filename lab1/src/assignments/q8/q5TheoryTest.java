package assignments.q8;

import assignments.q5.Fibonacci;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class q5TheoryTest {
	Fibonacci fib;
	
	@Before 
	public void init () {
		fib = new Fibonacci();
	}
	
	@DataPoints
	public static int[][] val () {
		return new int[][] {
			{0, 0}, 
			{1, 1}, 
			{2, 1}, 
			{3, 2}, 
			{4, 3}, 
			{5, 5}, 
			{6, 8}, 
			{7, 13}, 
			{8, 21}, 
			{9, 34}
		};
	}
	
	@Theory
	public void theory (int[] a) {
		assertTrue(fib.compute(a[0]) == a[1]);
	}

}
