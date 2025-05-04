package assignments.q2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle t1;
	Triangle t2;
	Triangle t3;
	Triangle t4;
	Triangle t5;
	
	@Before
	public void setup () {
		t1 = new Triangle (3, 4, 5);
		t2 = new Triangle (5, 4, 3);
		t3 = new Triangle (8, 5, 5);
		t4 = new Triangle (5, 5, -5);
		t5 = new Triangle (3, 4, 100);
	}
	
	//What will happen if the user creates a triangle with new Triangle(3,4,100)?
	//Triangle is not valid because 1 side must be less than the sum of both sides according to Heron's law
	@Test 
	public void testTriangle5Valid () {
		 assertTrue(t5.side1 < t5.side2 + t5.side3);
		 assertTrue(t5.side2 < t5.side1 + t5.side3);
		 assertFalse(t5.side3 < t5.side1 + t5.side2);
	}
	
	//Test methods for calculating the area of t1, t2, and t3.
	@Test
	public void testTriangleArea1 () {
		double s = (t1.side1 + t1.side2 + t1.side3) * 0.5;
		double area = Math.sqrt(s * (s - t1.side1) * (s - t1.side2) * (s - t1.side3));
		try {
			assertEquals(area, t1.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testTriangleArea2 () {
		double s = (t2.side1 + t2.side2 + t2.side3) * 0.5;
		double area = Math.sqrt(s * (s - t2.side1) * (s - t2.side2) * (s - t2.side3));
		try {
			assertEquals(area, t2.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testTriangleArea3 () {
		double s = (t3.side1 + t3.side2 + t3.side3) * 0.5;
		double area = Math.sqrt(s * (s - t3.side1) * (s - t3.side2) * (s - t3.side3));
		try {
			assertEquals(area, t3.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	//Test method to verify whether or not the area of t1 and t2 are the same
	@Test
	public void testTriangleEquality() {
		try {
			double area1 = t1.calculateArea();
			double area2 = t2.calculateArea();
			assertEquals(area1, area2, 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}	
	}
	
	@Test	//Negative test case
	public void testNegative () {
		try {
			double area = t4.calculateArea();
		} catch (Exception e) {
			assertEquals("Side lengths must be positive.", e.getMessage());
		}
	}

}
