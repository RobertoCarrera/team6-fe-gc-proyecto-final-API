package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.UsersIngredientsServiceImpl;
import com.jetxperience.dto.UsersIngredients;

@RestController
public class UsersIngredientsController {

	@Autowired
	UsersIngredientsServiceImpl usuarios_ingredientesServiceImpl;
	
	@GetMapping("/users_ingredients")
	public List<UsersIngredients> listUsersIngredients(){
		
		return usuarios_ingredientesServiceImpl.listUsersIngredients(); 
	}
	
	@GetMapping("/users_ingredients/{id}")
	public UsersIngredients usersIngredientsById(@PathVariable(name="id") int id) {
		
		UsersIngredients usersIngredients_byID = new UsersIngredients();
		
		usersIngredients_byID = usuarios_ingredientesServiceImpl.userIngredientById(id);
		
		System.out.println("Usuario_Platos byID: "+usersIngredients_byID);
		
		return usersIngredients_byID;
	}
	
	@PostMapping("/users_ingredients")
	public UsersIngredients newUserIngredient(@RequestBody UsersIngredients usersIngredients) {
		
		return usuarios_ingredientesServiceImpl.newUserIngredient(usersIngredients);
	}
	
	@DeleteMapping("/users_ingredients/{id}")
	public void deleteUserIngredient(@PathVariable(name="id") int id) {
		
		usuarios_ingredientesServiceImpl.deleteUserIngredient(id);
	}
}