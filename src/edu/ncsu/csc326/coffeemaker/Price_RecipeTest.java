package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Price_RecipeTest {

	

	@Test (expected = RecipeException.class)
	public void testSetPrice() throws RecipeException {
		String Price = "-5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setPrice(Price);
		
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	public void testSetPrice1() throws RecipeException {
		String Price = "0";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setPrice(Price);
		
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	public void testSetPrice2() throws RecipeException {
		String Price = "5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setPrice(Price);
		
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	public void testSetPrice3() throws RecipeException {
		String Price = "y";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setPrice(Price);
		
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	public void testSetPrice4() throws RecipeException {
		String Price = "1.5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setPrice(Price);
		
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}

}
