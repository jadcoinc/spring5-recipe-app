package guru.springframework.recipeapp.services.impl;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import guru.springframework.recipeapp.domain.Recipe;
import guru.springframework.recipeapp.repositories.RecipeRepository;
import guru.springframework.recipeapp.services.CrudService;

@Service
public class RecipeServiceImpl implements CrudService<Recipe, Long> {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		System.out.println("1*********************************************************************");
		this.recipeRepository = recipeRepository;	
	}

	@Override
	public Set<Recipe> findAll() {
		Set<Recipe> recipes = (Set<Recipe>) recipeRepository.findAll();
		return recipes;
	}

	@Override
	public Recipe findById(Long id) {
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
