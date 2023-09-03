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
import com.jetxperience.service.CategoriesServiceImpl;
import com.jetxperience.dto.Categories;

@RestController
public class CategoriesController {

	@Autowired
	CategoriesServiceImpl categorysServiceImpl;
	
	@GetMapping("/respuestas")
	public List<Categories> listCategories(){
		
		return categorysServiceImpl.listCategories(); 
	}
	
	@GetMapping("/respuestas/{id}")
	public Categories categoryById(@PathVariable(name="id") int id) {
		
		Categories category_byID = new Categories();
		
		category_byID = categorysServiceImpl.categoryByID(id);
		
		System.out.println("Dish byID: "+category_byID);
		
		return category_byID;
	}
	
	@PostMapping("/respuestas")
	public Categories newCategory(@RequestBody Categories category) {
		
		return categorysServiceImpl.newCategory(category);
	}
	 
	@PutMapping("/respuestas/{id}")
	public Categories updateCategory(@PathVariable(name="id")int id, @RequestBody Categories category) {
		
		Categories category_selected = new Categories();
		Categories category_updated = new Categories();

		category_selected.setName(category.getName());
		
		category_updated = categorysServiceImpl.updateCategory(category_selected);
		
		System.out.println("La respuesta actualizada es: "+category_updated);
		
		return category_updated;
	}
	
	@DeleteMapping("/respuestas/{id}")
	public void deleteCategory(@PathVariable(name="id") int id) {
		
		categorysServiceImpl.deleteCategory(id);
	}
}