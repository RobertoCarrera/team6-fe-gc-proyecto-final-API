package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.DishesIngredients;

public interface IDishesIngredientsDAO extends JpaRepository<DishesIngredients, Integer>{

}