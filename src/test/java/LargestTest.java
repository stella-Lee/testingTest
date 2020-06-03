import static org.junit.Assert.*;
import org.junit.Test;

public class LargestTest {

	@Test
	public void test1() {
		assertEquals(9, Largest.largest(new int[] {7,8,9}));
	}
	
	@Test
	public void test2() {
		assertEquals(9, Largest.largest(new int[] {9,8,7}));
	}
	
	@Test
	public void test3() {
		assertEquals(20, Largest.largest(new int[] {8,20,7}));
	}
	
	@Test
	public void testEmpty() {
	    try {
	      Largest.largest(new int[] {});
	      fail("Should have thrown an exception");
	    } catch (RuntimeException e) {
	      assertTrue(true);
	    }
	  }


}
