package assignments.q3;

import static org.junit.Assert.*;
import org.junit.Test;

public class RETest {
	// VALID test cases must contain parenthesis
	@Test
	public void testValidPhoneNumberWithNoSpaces() {
		assertTrue(RE.checkPhoneNumber("(123)123-1234"));
	}

	@Test
	public void testValidPhoneNumberWithSpaces() {
	    assertTrue(RE.checkPhoneNumber("(123) 456 - 7890"));
	}
	
	// INVALID test cases
	@Test
	public void testInvalidPhoneNumberMissingParentheses() {
	    assertFalse(RE.checkPhoneNumber("123 123 - 1234"));
	}
	
	@Test
    public void testInvalidPhoneNumberWithLetters() {
        assertFalse(RE.checkPhoneNumber("(123) ABC - 7890"));
    }
	
	@Test
    public void testInvalidPhoneNumberWithExtraCharacters() {
        assertFalse(RE.checkPhoneNumber("(123) 456 - 7890 x123"));
    }

}
