package assignments.q8;

import assignments.q6.PrimeNumberChecker;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import org.junit.Test;

@RunWith(Theories.class)
public class q6TheoryTest {
	PrimeNumberChecker prime;
	
	@Before
	public void init () {
		prime = new PrimeNumberChecker();
	}
	
	@DataPoints
	public static Object[][] val () {
		return new Object[][] {
			{2, true}, 
			{6, false}, 
			{19, true}, 
			{22, false}, 
			{23, true}};
	}
	
	@Theory
	public void theory (Object[] a) {
		assertTrue(prime.isPrime((int) a[0]) == (boolean)a[1]);
	}

}
