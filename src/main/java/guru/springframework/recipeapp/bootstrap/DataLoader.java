package guru.springframework.recipeapp.bootstrap;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.recipeapp.domain.Category;
import guru.springframework.recipeapp.domain.Difficulty;
import guru.springframework.recipeapp.domain.Ingredient;
import guru.springframework.recipeapp.domain.Notes;
import guru.springframework.recipeapp.domain.Recipe;
import guru.springframework.recipeapp.repositories.CategoryRepository;
import guru.springframework.recipeapp.repositories.UnitOfMeasureRepository;

//@Component
//public class DataLoader implements CommandLineRunner {
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
	
	private Difficulty difficulty;
	private final CategoryRepository categoryRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;

	public DataLoader(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@Override
//	public void run(String... args) throws Exception {

	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Set<Ingredient> ingredients = new HashSet<>();
		Set<Category> categories = new HashSet<>();
		Set<Recipe> recipes = new HashSet<>();

		Recipe guacamoleRecipe = new Recipe();
		guacamoleRecipe.setDescription("placeholder for the recipe");
		guacamoleRecipe.setPrepTime(10);
		guacamoleRecipe.setCookTime(10);
		guacamoleRecipe.setServings(3);
		guacamoleRecipe.setSource("simplyrecipes.com");
		guacamoleRecipe.setUrl("https://www.simplyrecipes.com/recipes/perfect_guacamole/");
		guacamoleRecipe.setDifficulty(difficulty.MODERATE);

		// set-up ingredients
		Ingredient ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(2));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("ripe avocados");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(.25));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("teaspoon of salt, more to taste");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);
		
		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(1));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("tablespoon fresh lime juice or lemon juice");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(2));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("tablespoons to 1/4 cup of minced red onion or thinly sliced green onion");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(1.5));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("serrano chiles, stems and seeds removed, minced");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(2));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("tablespoons cilantro (leaves and tender stems), finely chopped");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(0));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("A dash of freshly grated black pepper");
		ingredient.setRecipe(guacamoleRecipe);
		
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(.5));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("ripe tomato, seeds and pulp removed, chopped");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(0));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("Red radishes or jicama, to garnish");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);

		ingredient = new Ingredient();
		ingredient.setAmount(new BigDecimal(0));
		ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Piece").get());
		ingredient.setDescription("Tortilla chips, to serve");
		ingredient.setRecipe(guacamoleRecipe);
		ingredients.add(ingredient);
		
		// set-up notes
		Notes notes = new Notes();
		notes.setRecipe(guacamoleRecipe);
		notes.setRecipeNotes("placeholder for recipe notes");
		
		recipes.add(guacamoleRecipe);
		
		// set-up categories
		Category category = new Category(); 
		category.setDescription("Mexican");
		category.setRecipes(recipes);
		categories.add(category);
	
		category = new Category(); 
		category.setDescription("American");
		category.setRecipes(recipes);
		categories.add(category);
		
		
		// finish setting-up the recipe
		guacamoleRecipe.setIngredients(ingredients);
		guacamoleRecipe.setNotes(notes);
		guacamoleRecipe.setCategories(categories);

	}

}
