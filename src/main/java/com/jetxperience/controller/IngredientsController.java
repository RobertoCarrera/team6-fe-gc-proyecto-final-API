package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.IngredientsServiceImpl;
import com.jetxperience.dto.Ingredients;

@RestController
public class IngredientsController {

	@Autowired
	IngredientsServiceImpl ingredientsServiceImpl;
	
	@GetMapping("/ingredients")
	public List<Ingredients> listIngredients(){
		
		return ingredientsServiceImpl.listIngredients(); 
	}
	
	@GetMapping("/ingredients/{id}")
	public Ingredients ingredientById(@PathVariable(name="id") int id) {
		
		Ingredients ingredient_byID = new Ingredients();
		
		ingredient_byID = ingredientsServiceImpl.ingredientByID(id);
		
		System.out.println("Dish byID: "+ingredient_byID);
		
		return ingredient_byID;
	}
	
	@PostMapping("/ingredients")
	public Ingredients newIngredient(@RequestBody Ingredients ingredient) {
		
		return ingredientsServiceImpl.newIngredient(ingredient);
	}
	
	@PutMapping("/ingredients/{id}")
	public Ingredients updateIngredient(@PathVariable(name="id")int id, @RequestBody Ingredients ingredient) {
		
		Ingredients ingredient_selected = new Ingredients();
		Ingredients ingredient_updated = new Ingredients();
	
		ingredient_selected.setName(ingredient.getName());
		ingredient_selected.setImage(ingredient.getImage());
		
		ingredient_updated = ingredientsServiceImpl.updateIngredient(ingredient_selected);
		
		System.out.println("El plato actualizado es: "+ingredient_updated);
		
		return ingredient_updated;
	}
	
	@DeleteMapping("/ingredients/{id}")
	public void deleteIngredient(@PathVariable(name="id") int id) {
		
		ingredientsServiceImpl.deleteIngredient(id);
	}
}