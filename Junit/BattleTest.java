package source;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BattleTest {

	 MinMax b;
	
	@BeforeEach
	@Test
	 void initialize() {
	
			b = new MinMax();
		
	}
	
	@DisplayName("To Find MINMAX")
	@Test
	void testB() {
		
		
		int[] arr = {10,56,23,47};
	assertArrayEquals(new int[] {56,10},b.findMinMax(arr));
		
//	assertThrows(ArrayIndexOutOfBoundsException.class ,() -> b.findMinMax(arr));
		
		
	}
	
	@DisplayName("For Object")
	@Test
	void testM() {
		
		
		int[] arr = {10,56,23,47};
		List<Integer> li = Arrays.asList(56,10);
		
		assertEquals(li, b.getMinMax(arr));
		
	}

}
