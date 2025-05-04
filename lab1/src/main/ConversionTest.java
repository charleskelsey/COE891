package main;

//Sections 1 and 2
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ConversionTest {
	// Section 4
	@Test
	// Section 5
	public void testTempConversion() throws Throwable {
		//section 6 Given
		Conversion underTest = new Conversion();
		
		// Section 7: When
		double temperature = 80.0d;
		String unit = "";
		
		// Section 8
		double result = underTest.tempConversion(temperature, unit);
		
		// Section 9: Then - assertions for result of method tempConversion
		assertEquals(176.0d, result, 0.0);
	}
}
