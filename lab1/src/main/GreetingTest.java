package main;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import com.javatpoint.logic.*;

public class GreetingTest {
	Greeting g;
	@Before
	public void init() {
		g = new Greeting();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", g.sayHello());
	}

}
