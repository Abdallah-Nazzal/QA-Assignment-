package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtMilk_RecipeTest {


	@Test(expected = RecipeException.class)
	public void testSetAmtMilk() throws RecipeException, NumberFormatException {
		
		String AmtMilk = "-5" ;
		
		double expected = 5.0;
		double actual = 0.0;
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtMilk(AmtMilk);
		
		actual = objRecipe.getAmtMilk();
		
		assertFalse(expected == actual);
		
		
		
	}
	@Test
	public void testSetAmtMilk1() throws RecipeException, NumberFormatException {
		
		String AmtMilk = "0";
		double expected = 5.0;
		double actual = 0.0;
		
		
		Recipe objRecipe = new Recipe();
		
		objRecipe.setAmtMilk(AmtMilk);
		
		actual = objRecipe.getAmtMilk();
		
		assertFalse(expected == actual);
		
	}
	@Test
     public void testSetAmtMilk2() throws RecipeException, NumberFormatException  {
	
	String AmtMilk = "5";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtMilk(AmtMilk);
	
	actual = objRecipe.getAmtMilk();
	
	assertTrue(expected == actual);
	
}

	@Test(expected = RecipeException.class)
     public void testSetAmtMilk3() throws RecipeException, NumberFormatException{
	
	String AmtMilk = "1.5";
	
	double expected = 1.5;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtMilk(AmtMilk);
	
	actual = objRecipe.getAmtMilk();
	
	assertFalse(expected == actual);
	
}
	@Test(expected = RecipeException.class)
     public void testSetAmtMilk4() throws RecipeException, NumberFormatException{
	
	String AmtMilk = "y";
	
	double expected = 5.0;
	double actual = 0.0;
	
	
	Recipe objRecipe = new Recipe();
	
	objRecipe.setAmtMilk(AmtMilk);
	
	actual = objRecipe.getAmtMilk();
	
	assertFalse(expected == actual);
	
}

}
