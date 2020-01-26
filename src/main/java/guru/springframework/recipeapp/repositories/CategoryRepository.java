package guru.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
