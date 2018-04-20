package lightfoot_OutLab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {
	
	@Test
	//EmptyArray Test
	void testOne() {
		int array[] = {};
		Exception e = assertThrows(IllegalArgumentException.class, () -> 
		{ChangeCoins.change(array, 50);});
		assertEquals("Array of size 0 is not allowed", e.getMessage());
	}

	@Test
	void testTwo() {
		fail("Not yet implemented");
	}
	
	@Test
	void testThree() {
		fail("Not yet implemented");
	}
	
	@Test
	void testFour() {
		fail("Not yet implemented");
	}

}
