package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteRecipe_RecipeBookTest {

	@Test
	public void testDeleteRecipe() {
		
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		int recipeToDelete = 0;
		
		objRecipe.setName("recipe");
		objRecipeBook.addRecipe(objRecipe);
		
		String expected = "recipe";
		String actual = objRecipeBook.deleteRecipe(recipeToDelete);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDeleteRecipe1() {
		
		RecipeBook objRecipeBook = new RecipeBook();

		int recipeToDelete = 0;
		
		assertNull(objRecipeBook.deleteRecipe(recipeToDelete));
	
	}
	

}
