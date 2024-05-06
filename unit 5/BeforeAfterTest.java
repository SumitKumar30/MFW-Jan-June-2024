import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {

	static int count = 0;
	
	@BeforeClass
	public static void before() {
		System.out.println("Startup - creating DB connection");
	}
	
	@Before
	public void setup() {
	
		System.out.println("Before Test "+(++count));
	}
	
	@Test
	public void test1() {
//		fail("Not yet implemented");
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2() {
//		fail("Not yet implemented");
		System.out.println("Test 2 executed");
	}
	
	@After
	public void teardown() {
		System.out.println("After Test "+count);
	}
	
	@AfterClass
	public static void after() {
		System.out.println("Closing DB Connection");
	}
}
