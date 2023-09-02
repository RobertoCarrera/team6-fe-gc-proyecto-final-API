package com.jetxperience.service;

import com.jetxperience.dto.Dishes;
import java.util.List;

public interface IDishesService {

	public List<Dishes> listDishes();
	
	public Dishes newDish(Dishes dish);
	
	public Dishes dishByID(int id);
	
	public Dishes updateDish(Dishes dish);
	
	public void deleteDish(int id);
}