package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtSugar_RecipeTest {

	@Test(expected = RecipeException.class)
	public void testSetAmtSugar() throws RecipeException, NumberFormatException {
		
		String AmtSugar = "-5";
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtSugar(AmtSugar);
		
		actual = objRecipe.getAmtSugar();
		
		assertFalse(expected == actual);
		
		
		
	}
	@Test
	public void testSetAmtSugar1() throws RecipeException, NumberFormatException {
		
		String AmtSugar = "0";
		double expected = 5.0;
		double actual = 0.0;
		
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtSugar(AmtSugar);
		
		actual = objRecipe.getAmtSugar();
		
		assertFalse(expected == actual);
		
	}
	@Test
     public void testSetAmtSugar2() throws RecipeException, NumberFormatException  {
	
	String AmtSugar = "5";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtSugar(AmtSugar);
	
	actual = objRecipe.getAmtSugar();
	
	assertTrue(expected == actual);
	
}

	@Test(expected = RecipeException.class)
     public void testSetAmtSugar3() throws RecipeException, NumberFormatException{
	
	String AmtSugar = "1.5";
	
	double expected = 1.5;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtSugar(AmtSugar);
	
	actual = objRecipe.getAmtSugar();
	
	assertFalse(expected == actual);
	
}
	@Test(expected = RecipeException.class)
     public void testSetAmtSugar4() throws RecipeException, NumberFormatException{
	
	String AmtSugar = "y";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtSugar(AmtSugar);
	
	actual = objRecipe.getAmtSugar();
	
	assertFalse(expected == actual);
	
}
	
	
}
