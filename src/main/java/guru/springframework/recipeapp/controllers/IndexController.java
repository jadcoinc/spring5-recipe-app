package guru.springframework.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.recipeapp.domain.Category;
import guru.springframework.recipeapp.domain.UnitOfMeasure;
import guru.springframework.recipeapp.repositories.CategoryRepository;
import guru.springframework.recipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
    
	@RequestMapping(value= {"", "/", "index"}, method=RequestMethod.GET)
    public String getIndexPage(Model model) {
		Category category = categoryRepository.findByDescription("American").get();
		UnitOfMeasure unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon").get();

		System.out.println("Category id: " + category.getId());
		System.out.println("Uom id: " + unitOfMeasure.getId());
		
    	return "index";
    }
    
}
