package main;

import static org.junit.Assert.*;
import org.junit.Test;
//import com.javatpoint.logic.*;

public class CalculationTest {
	@Test
	public void testFindMax() {
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
	}

}
