package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class Name_RecipeTest {

	
	@Test
	public void testSetName() {
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setName(null);
		assertNotNull(objRecipe.getName());
	}

}
