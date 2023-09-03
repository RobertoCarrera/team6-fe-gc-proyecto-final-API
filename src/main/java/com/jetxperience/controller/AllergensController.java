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
import com.jetxperience.service.AllergensServiceImpl;
import com.jetxperience.dto.Allergens;

@RestController
public class AllergensController {

	@Autowired
	AllergensServiceImpl allergensServiceImpl;
	
	@GetMapping("/alergenos")
	public List<Allergens> listAllergens(){
		
		return allergensServiceImpl.listAllergens(); 
	}
	
	@GetMapping("/alergenos/{id}")
	public Allergens allergenById(@PathVariable(name="id") int id) {
		
		Allergens allergen_byID = new Allergens();
		
		allergen_byID = allergensServiceImpl.allergenByID(id);
		
		System.out.println("Dish byID: "+allergen_byID);
		
		return allergen_byID;
	}
	
	@PostMapping("/alergenos")
	public Allergens newAllergen(@RequestBody Allergens allergen) {
		
		return allergensServiceImpl.newAllergen(allergen);
	}
	
	@PutMapping("/alergenos/{id}")
	public Allergens updateAllergen(@PathVariable(name="id")int id, @RequestBody Allergens allergen) {
		
		Allergens allergen_selected = new Allergens();
		Allergens allergen_updated = new Allergens();
		
		allergen_selected.setIsActive(allergen.getIsActive());
		allergen_selected.setName(allergen.getName());
		allergen_selected.setImage(allergen.getImage());
		
		allergen_updated = allergensServiceImpl.updateAllergen(allergen_selected);
		
		System.out.println("El plato actualizado es: "+allergen_updated);
		
		return allergen_updated;
	}
	
	@DeleteMapping("/alergenos/{id}")
	public void deleteAllergen(@PathVariable(name="id") int id) {
		
		allergensServiceImpl.deleteAllergen(id);
	}
}