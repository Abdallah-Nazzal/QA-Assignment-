package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtCoffee_RecipeTest {

	

	@Test(expected = RecipeException.class)
	public void testSetAmtCoffee() throws RecipeException, NumberFormatException {
		
		String AmtCoffee = "-5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtCoffee(AmtCoffee);
		
		actual = objRecipe.getAmtCoffee();
		
		assertFalse(expected == actual);
		
		
		
	}
	@Test
	public void testSetAmtCoffee1() throws RecipeException, NumberFormatException {
		
		String AmtCoffee = "0";
		double expected = 5.0;
		double actual = 0.0;
		
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtCoffee(AmtCoffee);
		
		actual = objRecipe.getAmtCoffee();
		
		assertFalse(expected == actual);
		
	}
	@Test
     public void testSetAmtCoffee2() throws RecipeException, NumberFormatException  {
	
	String AmtCoffee = "5";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtCoffee(AmtCoffee);
	
	actual = objRecipe.getAmtCoffee();
	
	assertTrue(expected == actual);
	
}

	@Test(expected = RecipeException.class)
     public void testSetAmtCoffee3() throws RecipeException, NumberFormatException{
	
	String AmtCoffee = "1.5";
	
	double expected = 1.5;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtCoffee(AmtCoffee);
	
	actual = objRecipe.getAmtCoffee();
	
	assertFalse(expected == actual);
	
}
	@Test(expected = RecipeException.class)
     public void testSetAmtCoffee4() throws RecipeException, NumberFormatException{
	
	String AmtCoffee = "y";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtCoffee(AmtCoffee);
	
	actual = objRecipe.getAmtCoffee();
	
	assertFalse(expected == actual);
	
}
	
	
}
