import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

//	@Test
//	public void test() {
////		fail("Not yet implemented");
//		int[] numbers = {1, 4, 3, 8, 12};
//		int[] expected = {1, 3, 4, 8, 12};
//		Arrays.sort(numbers);
//		assertArrayEquals(expected, numbers);
//	}
	
	@Test(timeout = 100)
	public void testSort_Performance() {
		int [] array = {2, 4, 6, 8};
		for(int i = 0; i  < 10000000; i++) {
				array[0] = i;
				Arrays.sort(array);
		}
	}
	
//	@Test(expected = NullPointerException.class)
//	public void testNullArray() {
//		int[] numbers = null;
//		try {
//			Arrays.sort(numbers);
//		}
//		catch(NullPointerException exp) {
//			System.out.println("Test Success!");
//		}
//	}
	

}
