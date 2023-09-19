package com.jetxperience.service;

import java.util.List;

import com.jetxperience.dto.DishesOrders;

public interface IDishesOrdersService {

	public List<DishesOrders> listDishesOrders();
	
	public List<DishesOrders> findDishesByidOrders(int idOrders);
	
	public DishesOrders newDishOrder(DishesOrders dishOrder);
	
	public DishesOrders dishOrderByID(int id);
	
	public DishesOrders updateDishOrder(DishesOrders dishOrder);
	
	public void deleteDishOrder(int id);
}
