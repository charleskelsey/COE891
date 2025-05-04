package assignments.q5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciTest {

	private final int input;
    private final int expected;

    public FibonacciTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {0, 0}, // Fibonacci(0) = 0
            {1, 1}, // Fibonacci(1) = 1
            {2, 1}, // Fibonacci(2) = 1
            {3, 2}, // Fibonacci(3) = 2
            {4, 3}, // Fibonacci(4) = 3
            {5, 5}, // Fibonacci(5) = 5
            {6, 8}, // Fibonacci(6) = 8
            {7, 13}, // Fibonacci(7) = 13
            {8, 21}, // Fibonacci(8) = 21
            {9, 34}  // Fibonacci(9) = 34
        });
    }

    @Test
    public void testFibonacci() {
        assertEquals(expected, Fibonacci.compute(input));
    }

}
