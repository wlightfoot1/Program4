package lightfoot_OutLab4;
/*
 * Westin Lightfoot, Benjimin Naylor, Brenden Smith 
 * CSCI232
 * Program 4
 * 
 * Contains 4 tests using JUnit to test the ChangeCoins.class: 
 * Small, Medium, High Value Tests and Empty Array Test
 * 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Tests {
	
	@Test
	//EmptyArray Test
	void testForEmptyArray() {
		int input[] = {};
		Exception e = assertThrows(IllegalArgumentException.class, () -> 
		{ChangeCoins.change(input, 50);});
		assertEquals("No Change Available", e.getMessage());
		System.out.println("Empty Array Test Passed");
	}

	@Test //70 cent test
	void testMediumValues() {
		int[] input = {1, 5, 10, 25, 50};
		int[] expected = {50, 10, 10};
        int[] output = ChangeCoins.change(input, 70);
        assertArrayEquals(expected, output);
        System.out.println("Medium Value Test Passed");
	}
	
	@Test //96 cent test
	void testHighValues() {
		int[] input = {1, 5, 10, 25};
		int[] expected = {25, 25, 25, 10, 10, 1};
        int[] output = ChangeCoins.change(input, 96);
        assertArrayEquals(expected, output);
        System.out.println("High Value Test Passed");
	}
	
	@Test //33 cent test
	void testSmallValues() {
        int[] input = {1, 5, 10, 25};
        int[] expected = {25, 5, 1, 1, 1};
        int[] output = ChangeCoins.change(input, 33);
        assertArrayEquals(expected, output);
        System.out.println("Small Value Test Passed");
	}

}
