package q3;

import org.junit.Test;
import static org.junit.Assert.*;

public class q3Test {
	@Test
    public void test1() {
        int[] numbers = {20};
        System.out.println("Running test1 with input: {20}");
        try {
            q3.computeStats(numbers);
            System.out.println("Test passed: No exception thrown.");
        } catch (Exception e) {
            System.out.println("Test failed: Exception thrown - " + e.getMessage());
            fail("Exception thrown: " + e.getMessage());
        }
    }
	
	@Test
    public void test2() {
        int[] numbers = {5, 10, 15};
        System.out.println("Running test2 with input: {5, 10, 15}");
        try {
            q3.computeStats(numbers);
            System.out.println("Test passed: No exception thrown.");
        } catch (Exception e) {
            System.out.println("Test failed: Exception thrown - " + e.getMessage());
            fail("Exception thrown: " + e.getMessage());
        }
    }
}
