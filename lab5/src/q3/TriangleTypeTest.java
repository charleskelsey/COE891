package q3;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTypeTest {
	private final TriangleType triangleType = new TriangleType();

    private void printResult(int s1, int s2, int s3, Triangle expected, Triangle actual) {
        System.out.println("Testing triangle(" + s1 + ", " + s2 + ", " + s3 + ") -> Expected: " 
                           + expected + ", Got: " + actual);
    }

    @Test
    public void testInvalid_NonPositive() {
        Triangle result;
        
        result = triangleType.triangle(0, 1, 1);
        printResult(0, 1, 1, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);

        result = triangleType.triangle(1, 0, 1);
        printResult(1, 0, 1, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);

        result = triangleType.triangle(1, 1, 0);
        printResult(1, 1, 0, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);
    }

    @Test
    public void testInvalid_TriangleInequality() {
        Triangle result;

        result = triangleType.triangle(1, 1, 3);
        printResult(1, 1, 3, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);

        result = triangleType.triangle(3, 1, 1);
        printResult(3, 1, 1, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);

        result = triangleType.triangle(1, 3, 1);
        printResult(1, 3, 1, Triangle.INVALID, result);
        assertEquals(Triangle.INVALID, result);
    }

    @Test
    public void testEquilateralTriangle() {
        Triangle result = triangleType.triangle(2, 2, 2);
        printResult(2, 2, 2, Triangle.EQUILATERAL, result);
        assertEquals(Triangle.EQUILATERAL, result);
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle result;

        result = triangleType.triangle(2, 2, 3);
        printResult(2, 2, 3, Triangle.ISOSCELES, result);
        assertEquals(Triangle.ISOSCELES, result);

        result = triangleType.triangle(2, 3, 2);
        printResult(2, 3, 2, Triangle.ISOSCELES, result);
        assertEquals(Triangle.ISOSCELES, result);
    }

    @Test
    public void testScaleneTriangle() {
        Triangle result;

        result = triangleType.triangle(3, 4, 5);
        printResult(3, 4, 5, Triangle.SCALENE, result);
        assertEquals(Triangle.SCALENE, result);
    }
}
