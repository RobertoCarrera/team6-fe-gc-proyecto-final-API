 package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IDishesIngredientsDAO;
import com.jetxperience.dto.DishesIngredients;

@Service
public class DishesIngredientsServiceImpl implements IDishesIngredientsService {

	@Autowired
	IDishesIngredientsDAO iDishesIngredientsDAO;
	
	@Override
	public List<DishesIngredients> listDishesIngredients() {
		
		return iDishesIngredientsDAO.findAll();
	}
	
	@Override
	public List<DishesIngredients> findAllIngredientsByDish(int dish) {
		
	    return iDishesIngredientsDAO.findByIdDishes_Id(dish);
	}

	@Override
	public DishesIngredients newDishIngredient(DishesIngredients dishIngredient) {

		return iDishesIngredientsDAO.save(dishIngredient);
	}

	@Override
	public DishesIngredients dishIngredientById(int id) {
		
		return iDishesIngredientsDAO.findById(id).get();
	}

	@Override
	public DishesIngredients updateDishIngredient(DishesIngredients dishIngredient) {

		return iDishesIngredientsDAO.save(dishIngredient);
	}

	@Override
	public void deleteDishIngredient(int id) {

		iDishesIngredientsDAO.deleteById(id);
	}

}
