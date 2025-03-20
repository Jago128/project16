package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import classes.ArrayOperations;

class ArrayOperationsTest {
	
	@Test
	public void testFindMax() {
	       int i[] = {3,200,-1};
	       int max=ArrayOperations.findMax(i);
	       assertEquals(200, max);
	}

}
