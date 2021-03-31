package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddRecipe_RecipeBookTest {

	@Test
	public void testAddRecipe() {
		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
			
		assertTrue(objRecipeBook.addRecipe(objRecipe));
		
		}
	
	@Test
	public void testAddRecipe1() {

		RecipeBook objRecipeBook = new RecipeBook();
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName("recipe");
		
		Recipe objRecipe2 = new Recipe();
		objRecipe2.setName("recipe");
		
		objRecipeBook.addRecipe(objRecipe);
		
		assertFalse(objRecipeBook.addRecipe(objRecipe2));
		
		}
	
}
