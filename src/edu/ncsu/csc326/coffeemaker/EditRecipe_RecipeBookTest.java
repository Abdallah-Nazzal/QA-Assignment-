package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class EditRecipe_RecipeBookTest {

	@Test
	public void testEditRecipe() {
		
		RecipeBook objRecipeBook = new RecipeBook();
		Recipe objRecipe = new Recipe();
		int recipeToEdit = 0;
		
		objRecipe.setName("recipe");
		objRecipeBook.addRecipe(objRecipe);
		
		String expected = "recipe";
		String actual = objRecipeBook.editRecipe(recipeToEdit, objRecipe);
		
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testEditRecope1() {
		
		RecipeBook objrRecipeBook = new RecipeBook();
		
		int recipeToEdit = 0;
		
		Recipe newRecipe = new Recipe();
		
		assertNull(objrRecipeBook.editRecipe(recipeToEdit, newRecipe));
	}

}