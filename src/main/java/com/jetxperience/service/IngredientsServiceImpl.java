package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IIngredientsDAO;
import com.jetxperience.dto.Ingredients;

@Service
public class IngredientsServiceImpl implements IIngredientsService {

	@Autowired
	IIngredientsDAO iIngredientsDAO;
	
	@Override
	public List<Ingredients> listIngredients() {

		return iIngredientsDAO.findAll();
	}

	@Override
	public Ingredients newIngredient(Ingredients ingredient) {

		return iIngredientsDAO.save(ingredient);
	}

	@Override
	public Ingredients ingredientByID(int id) {

		return iIngredientsDAO.findById(id).get();
	}

	@Override
	public Ingredients updateIngredient(Ingredients ingredient) {

		return iIngredientsDAO.save(ingredient);
	}

	@Override
	public void deleteIngredient(int id) {
		
		iIngredientsDAO.deleteById(id);
	}

}
