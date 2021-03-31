package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToString_RecipeTest {

	@Test
	public void testToString() {
		
		Recipe objRecipe = new Recipe();

         
            //Test for empty strings
            objRecipe.setName("");
            assertEquals("",objRecipe.toString());
            //Test for null input values
            objRecipe.setName(null);
            assertEquals("",objRecipe.getName());
            
}
	

}
