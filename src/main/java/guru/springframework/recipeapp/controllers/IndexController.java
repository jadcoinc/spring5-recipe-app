package guru.springframework.recipeapp.controllers;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.recipeapp.domain.Recipe;
import guru.springframework.recipeapp.services.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}
    
	@RequestMapping(value= {"", "/", "index"}, method=RequestMethod.GET)
    public String getIndexPage(Model model) {

		Set<Recipe> recipes = recipeService.findAll();
		
		model.addAttribute("recipes", recipeService.findAll());
    	return "index";
    }
    
}
