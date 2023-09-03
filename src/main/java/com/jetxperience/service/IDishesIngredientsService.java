package com.jetxperience.service;

import com.jetxperience.dto.DishesIngredients;
import java.util.List;

public interface IDishesIngredientsService {

	public List<DishesIngredients> listDishesIngredients();
	
	public DishesIngredients newDishIngredients(DishesIngredients dishIngredient);
	
	public DishesIngredients dishIngredientById(int id);
	
	public DishesIngredients updateDishesIngredients(DishesIngredients dishIngredient);
	
	public void deleteDishIngredient(int id);
}