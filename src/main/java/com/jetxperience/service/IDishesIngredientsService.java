package com.jetxperience.service;

import com.jetxperience.dto.DishesIngredients;
import java.util.List;

public interface IDishesIngredientsService {

	public List<DishesIngredients> listDishesIngredients();
	
	public List <DishesIngredients> findAllIngredientsByDish(int dish);
	
	public DishesIngredients newDishIngredient(DishesIngredients dishIngredient);
	
	public DishesIngredients dishIngredientById(int id);
	
	public DishesIngredients updateDishIngredient(DishesIngredients dishIngredient);
	
	public void deleteDishIngredient(int id);
}