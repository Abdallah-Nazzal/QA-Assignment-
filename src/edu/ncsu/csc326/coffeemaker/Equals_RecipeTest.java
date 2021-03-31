package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Equals_RecipeTest {

	@Test
	public void testEqualsObject() throws RecipeException, NumberFormatException {
	

			 Recipe objRecipe1 = new Recipe();
			 Recipe objRecipe2 = new Recipe();
			 
			 assertEquals(objRecipe1.equals(objRecipe1), objRecipe2.equals(objRecipe1)); 
		
			 
			 objRecipe1.setName("R1");
			 assertNotEquals(objRecipe1.equals(objRecipe1), objRecipe2.equals(objRecipe1)); 
			 
			 objRecipe2.setName(null);
			 objRecipe2.setPrice("3");
			 assertNotEquals(objRecipe1.equals(objRecipe1), objRecipe2.equals(objRecipe1));
			 
			 
		
			 }
			

	

}
