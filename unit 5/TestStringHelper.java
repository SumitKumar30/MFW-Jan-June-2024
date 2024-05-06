import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringHelper {

//	@Test
//	public void test() {
////		fail("Not yet implemented");
//		StringHelper helper = new StringHelper();
//		String actual = helper.truncateAInFirst2Positions("AABC");
//		String expected = "BG";
//		assertEquals(actual, expected);
//		
//	}
	
	@Test
	public void test2() {
		StringHelper h2 = new StringHelper();
		boolean actual = h2.areFirstAndLastTwoCharactersTheSame("BAVFCBBA");
//		boolean expected = true;
		assertTrue(actual);
	}

}
