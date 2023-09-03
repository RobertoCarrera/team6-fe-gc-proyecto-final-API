package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IAllergensDAO;
import com.jetxperience.dto.Allergens;

@Service
public class AllergensServiceImpl implements IAllergensService {

	@Autowired
	IAllergensDAO iAllergensDAO;
	
	@Override
	public List<Allergens> listAllergens() {
		
		return iAllergensDAO.findAll();
	}

	@Override
	public Allergens newAllergen(Allergens allergen) {
		
		return iAllergensDAO.save(allergen);
	}

	@Override
	public Allergens allergenByID(int id) {
		
		return iAllergensDAO.findById(id).get();
	}

	@Override
	public Allergens updateAllergen(Allergens allergen) {
		
		return iAllergensDAO.save(allergen);
	}

	@Override
	public void deleteAllergen(int id) {
		
		iAllergensDAO.deleteById(id);
	}
}
