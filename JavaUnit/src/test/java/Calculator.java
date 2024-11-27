import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator {
	cal c=new cal();
	@BeforeClass
	public static void m3() {
	System.out.println("Before all methods");
	}

	@AfterClass
	public static void m4() {
	System.out.println("After all methods");
	}

	@Before
	public void m1() {
	System.out.println("executes before each test case");
	}
	@After
	public void m2() {
	System.out.println("executes After each test case");
	}

	@Test
	public void subtest() {
		
		int r=c.sub(10,5);
		assertEquals(5,r);
	}
	@Test
	public void multest() {
		//cal c=new cal();
		int r=c.mul(10,5);
		assertEquals(50,r);
	}
	@Test
	public void addTest() {
	int s=c.add(20,10);
	assertEquals(30,s);
	}
	@Test
	public void Vald() {
		String s=c.val("admin","123");
		assertEquals("12",s);
	}

}
