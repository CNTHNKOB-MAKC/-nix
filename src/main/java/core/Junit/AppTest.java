package core.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

/*import static org.junit.Assert.*;
import static org.junit.Assert.False;*/
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
 
  
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

 
	
	//positive
	@Test
	
	
	public void testAssertEquals () {
		 String s = "saa";
		 int a = 2;
		assertEquals("error", a, 2);
	}
	
	@Test
	
	
	
	public void testAssertSame  () {
		Boolean t = false;
		assertSame("error", t, false);
		}
	
	@Test
	
	
	
	public void testAssertFalse  () {
		Boolean t = false;
		assertFalse ("error", t);
		}
	
	@Test
	
	
	
	public void testAssertTrue  () {
		Boolean t = true;
		assertTrue("failuer should be true", t);
		}
	 
	
	//negative
	
	@Test
	
	
	
	public void testAssertEqualsNegative  () {
		
		assertEquals("I think itis an error because goal is negative test case", 4, 5);
		}
	
	@Test
	
	
	
	public void testAssertSameNegative  () {
		
		double d =  2;
		assertSame ("failure is positive result", d,4);
		}
	
	@Test
	
	
	
	public void testAssertFalseNegative  () {
		Boolean d = true;
		String e = "dfgef";
		String t = "dfgef";
		assertFalse( "whathappaned ? again a failure",  d);
		}
	
	@Test
	
	
	
	public void testAssertTrueNegative  () {
		Boolean s = false;
		assertTrue ("failure should be true", s);
		}
	
	

	
	
	//ignored
	@Ignore
@Test
	
	
	
	public void testAssertEqualsNegative1  () {
		
		assertEquals("I think itis an error because goal is negative test case", 4, 5);
		}
	@Ignore
	@Test
	
	
	
	public void testAssertSameNegative1  () {
		
		double d =  2;
		assertSame ("failure is positive result", d,4);
		}
	@Ignore
	@Test
	
	
	
	public void testAssertFalseNegative1  () {
		Boolean d = true;
		String e = "dfgef";
		String t = "dfgef";
		assertFalse( "whathappaned ? again a failure",  d);
		}
	@Ignore
	@Test
	
	
	
	public void testAssertTrueNegative1  () {
		Boolean s = false;
		assertTrue ("failure should be true", s);
		}
	

}
