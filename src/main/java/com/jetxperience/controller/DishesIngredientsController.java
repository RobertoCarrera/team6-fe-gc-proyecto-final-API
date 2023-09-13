package com.jetxperience.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.DishesIngredientsServiceImpl;
import com.jetxperience.dto.Allergens;
import com.jetxperience.dto.DishesIngredients;
import com.jetxperience.dto.Ingredients;

@RestController
public class DishesIngredientsController {

	@Autowired
	DishesIngredientsServiceImpl dishesIngredientsServiceImpl;
	
	@GetMapping("/dishes_ingredients")
	public List<DishesIngredients> listDishesIngredients(){
		
		return dishesIngredientsServiceImpl.listDishesIngredients(); 
	}
	
	@GetMapping("/dishes_ingredients/{id}")
	public DishesIngredients dishIngredientById(@PathVariable(name="id") int id) {
		
		DishesIngredients dishIngredient_byID = new DishesIngredients();
		
		dishIngredient_byID = dishesIngredientsServiceImpl.dishIngredientById(id);
		
		System.out.println("Dish byID: "+dishIngredient_byID);
		
		return dishIngredient_byID;
	}
	
	@GetMapping("/dishes/{idDish}/ingredients")
	public List<Ingredients> getIngredientsByDish(@PathVariable(name="idDish") int idDish) {
		
	    List<Ingredients> ingredients = new ArrayList<>();
	    List<DishesIngredients> dishesIngredients = dishesIngredientsServiceImpl.findAllIngredientsByDish(idDish);
	    
	    for (DishesIngredients dishIngredient : dishesIngredients) {
	    	
	        ingredients.add(dishIngredient.getIdIngredients());
	    }
	    return ingredients;
	}
	
	@GetMapping("/dishes/{idDish}/allergens")
	public List<Allergens> getAllergensByDish(@PathVariable(name="idDish") int idDish) {
		
	    List<Allergens> allergens = new ArrayList<>();
	    List<DishesIngredients> dishesIngredients = dishesIngredientsServiceImpl.findAllIngredientsByDish(idDish);
	    
	    for (DishesIngredients dishIngredient : dishesIngredients) {
	    	
	        Allergens allergen = dishIngredient.getIdIngredients().getAllergen();
	        if (allergen != null && !allergens.contains(allergen)) {
	        	
	            allergens.add(allergen);
	        }
	    }
	    return allergens;
	}
	
	@PostMapping("/dishes_ingredients")
	public DishesIngredients newDishIngredient(@RequestBody DishesIngredients dishIngredient) {
		
		return dishesIngredientsServiceImpl.newDishIngredient(dishIngredient);
	}
	
	@PutMapping("/dishes_ingredients/{id}")
	public DishesIngredients updateDishIngredient(@PathVariable(name="id")int id, @RequestBody DishesIngredients dishIngredient) {
		
		DishesIngredients dishIngredient_selected = new DishesIngredients();
		DishesIngredients dishIngredient_updated = new DishesIngredients();

		dishIngredient_selected.setQuantity(dishIngredient.getQuantity());
		dishIngredient_selected.setIsEssential(dishIngredient.getIsEssential());
		
		dishIngredient_updated = dishesIngredientsServiceImpl.updateDishIngredient(dishIngredient_selected);
		
		System.out.println("El plato actualizado es: "+dishIngredient_updated);
		
		return dishIngredient_updated;
	}
	
	@DeleteMapping("/dishes_ingredients/{id}")
	public void deleteDishIngredient(@PathVariable(name="id") int id) {
		
		dishesIngredientsServiceImpl.deleteDishIngredient(id);
	}
}