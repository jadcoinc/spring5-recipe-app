package guru.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
