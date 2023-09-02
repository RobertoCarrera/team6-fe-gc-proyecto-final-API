package com.jetxperience.service;

import com.jetxperience.dto.Allergens;
import java.util.List;

public interface IAllergensService {

	public List<Allergens> listAllergens();
	
	public Allergens newAllergen(Allergens allergen);
	
	public Allergens allergenByID(int id);
	
	public Allergens updateAllergen(Allergens allergen);
	
	public void deleteAllergen(int id);
}