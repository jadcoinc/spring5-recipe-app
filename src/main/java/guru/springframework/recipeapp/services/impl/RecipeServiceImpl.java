package guru.springframework.recipeapp.services.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.recipeapp.domain.Recipe;
import guru.springframework.recipeapp.repositories.RecipeRepository;
import guru.springframework.recipeapp.services.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;	
	}

	@Override
	public Set<Recipe> findAll() {
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
		return recipes;
	}

	@Override
	public Optional<Recipe> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe save(Recipe object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Recipe object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
