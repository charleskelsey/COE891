package q3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriclassTest {

    @BeforeClass
    public static void init() {
        System.out.println("Testing started");
    }

    @AfterClass
    public static void breakdown() {
        System.out.println("Testing is finished");
    }

    @Test
    public void isoTest() {
        System.out.println("Test 1 started");
        assertEquals("Isosceles", Triclass.classify(5, 5, 6));
        assertEquals("Isosceles", Triclass.classify(5, 5, 4));
        assertEquals("Isosceles", Triclass.classify(6, 5, 5));
        System.out.println("Isoceles");
        System.out.println("Test 1 finished");
    }

    @Test
    public void scalTest() {
        System.out.println("Test 2 started");
        assertEquals("Scalene", Triclass.classify(5, 6, 7));
        assertEquals("Scalene", Triclass.classify(5, 7, 9));
        System.out.println("Scalene");
        System.out.println("Test 2 finished");
    }

    @Test
    public void equilTest() {
        System.out.println("Test 3 started");
        assertEquals("Equilateral", Triclass.classify(5, 5, 5));
        assertNotEquals("Equilateral", Triclass.classify(9, 5, 5));
        System.out.println("Equilateral");
        System.out.println("Test 3 finished");
    }

    @Test
    public void invalidTest() {
        System.out.println("Test 4 started");
        assertEquals("Invalid", Triclass.classify(1, 1, 9)); // Triangle inequality
        assertEquals("Invalid", Triclass.classify(5, 5, 11)); // Out of range
        assertEquals("Invalid", Triclass.classify(0, 5, 5)); // Zero length
        System.out.println("Invalid");
        System.out.println("Test 4 finished");
    }
}
