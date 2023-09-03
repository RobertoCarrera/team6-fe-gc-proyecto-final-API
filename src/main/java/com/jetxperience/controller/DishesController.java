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
import com.jetxperience.service.DishesServiceImpl;
import com.jetxperience.dto.Dishes;

@RestController
public class DishesController {

	@Autowired
	DishesServiceImpl dishesServiceImpl;
	
	@GetMapping("/platos")
	public List<Dishes> listDishes(){
		
		return dishesServiceImpl.listDishes(); 
	}
	
	@GetMapping("/platos/{id}")
	public Dishes dishById(@PathVariable(name="id") int id) {
		
		Dishes dish_byID = new Dishes();
		
		dish_byID = dishesServiceImpl.dishByID(id);
		
		System.out.println("Dish byID: "+dish_byID);
		
		return dish_byID;
	}
	
	@PostMapping("/platos")
	public Dishes newDish(@RequestBody Dishes dish) {
		
		return dishesServiceImpl.newDish(dish);
	}
	
	@PutMapping("/platos/{id}")
	public Dishes updateDish(@PathVariable(name="id")int id, @RequestBody Dishes dish) {
		
		Dishes dish_selected = new Dishes();
		Dishes dish_updated = new Dishes();
		
		dish_selected.setIsActive(dish.getIsActive());
		dish_selected.setName(dish.getName());
		dish_selected.setImage(dish.getImage());
		dish_selected.setCost(dish.getCost());
		dish_selected.setDescription(dish.getDescription());
		dish_selected.setIsRecommended(dish.getIsRecommended());
		dish_selected.setIsSuggested(dish.getIsSuggested());
		dish_selected.setIsHighlighted(dish.getIsHighlighted());
		dish_selected.setIsAvailable(dish.getIsAvailable());
		dish_selected.setCategory(dish.getCategory());
		
		dish_updated = dishesServiceImpl.updateDish(dish_selected);
		
		System.out.println("El plato actualizado es: "+dish_updated);
		
		return dish_updated;
	}
	
	@DeleteMapping("/platos/{id}")
	public void deleteDish(@PathVariable(name="id") int id) {
		
		dishesServiceImpl.deleteDish(id);
	}
}
