package assignments.q6;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private final int input;
    private final boolean expected;

    public PrimeNumberCheckerTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] {
            { 2, true },
            { 6, false },
            { 19, true },
            { 22, false },
            { 23, true }
        });
    }

    @Test
    public void testIsPrime() {
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        assertEquals(expected, primeNumberChecker.isPrime(input));
    }
}
