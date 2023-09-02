package com.jetxperience.service;

import com.jetxperience.dto.Ingredients;
import java.util.List;

public interface IIngredientsService {

	public List<Ingredients> listIngredients();
	
	public Ingredients newIngredient(Ingredients ingredient);
	
	public Ingredients ingredientByID(int id);
	
	public Ingredients updateIngredient(Ingredients ingredient);
	
	public void deleteIngredient(int id);
}