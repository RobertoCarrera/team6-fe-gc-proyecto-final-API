package com.jetxperience.service;

import java.util.List;
import com.jetxperience.dto.UsersIngredients;

public interface IUsersIngredientsService {

    public List<UsersIngredients> listUsersIngredients();
	
	public UsersIngredients newUserIngredient(UsersIngredients userIngredient);
	
	public UsersIngredients userIngredientById(int id);
	
	public UsersIngredients updateUserIngredient(UsersIngredients userIngredient);
	
	public void deleteUserIngredient(int id);
}