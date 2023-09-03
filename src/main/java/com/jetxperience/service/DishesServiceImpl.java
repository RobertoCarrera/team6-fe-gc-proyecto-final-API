package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IDishesDAO;
import com.jetxperience.dto.Dishes;

@Service
public class DishesServiceImpl implements IDishesService {

	@Autowired
	IDishesDAO iDishesDAO;
	
	@Override
	public List<Dishes> listDishes() {

		return iDishesDAO.findAll();
	}

	@Override
	public Dishes newDish(Dishes dish) {
		
		return iDishesDAO.save(dish);
	}

	@Override
	public Dishes dishByID(int id) {

		return iDishesDAO.findById(id).get();
	}

	@Override
	public Dishes updateDish(Dishes dish) {

		return iDishesDAO.save(dish);
	}

	@Override
	public void deleteDish(int id) {

		iDishesDAO.deleteById(id);
	}

}
