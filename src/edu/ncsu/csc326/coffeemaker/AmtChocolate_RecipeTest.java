package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtChocolate_RecipeTest {

	//@Test
	/*public void testGetAmtChocolate() {
		
	}*/

	@Test(expected = RecipeException.class)
	public void testSetAmtChocolate() throws RecipeException, NumberFormatException {
		
		String amtChocolate = "-5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtChocolate(amtChocolate);
		
		actual = objRecipe.getAmtChocolate();
		
		assertFalse(expected == actual);
		
		
		
	}
	@Test
	public void testSetAmtChocolate1() throws RecipeException, NumberFormatException {
		
		String amtChocolate = "0";
		double expected = 5.0;
		double actual = 0.0;
		
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtChocolate(amtChocolate);
		
		actual = objRecipe.getAmtChocolate();
		
		assertFalse(expected == actual);
		
	}
	@Test
     public void testSetAmtChocolate2() throws RecipeException, NumberFormatException  {
	
	String amtChocolate = "5";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtChocolate(amtChocolate);
	
	actual = objRecipe.getAmtChocolate();
	
	assertTrue(expected == actual);
	
}

	@Test(expected = RecipeException.class)
     public void testSetAmtChocolate3() throws RecipeException, NumberFormatException{
	
	String amtChocolate = "1.5";
	
	double expected = 1.5;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtChocolate(amtChocolate);
	
	actual = objRecipe.getAmtChocolate();
	
	assertFalse(expected == actual);
	
}
	@Test(expected = RecipeException.class)
     public void testSetAmtChocolate4() throws RecipeException, NumberFormatException{
	
	String amtChocolate = "y";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtChocolate(amtChocolate);
	
	actual = objRecipe.getAmtChocolate();
	
	assertFalse(expected == actual);
	
}


}
