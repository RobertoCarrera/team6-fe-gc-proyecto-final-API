package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IDishesOrdersDAO;
import com.jetxperience.dto.DishesOrders;

@Service
public class DishesOrdersServiceImpl implements IDishesOrdersService {

	@Autowired
	IDishesOrdersDAO iDishesOrdersDAO;
	
	@Override
	public List<DishesOrders> listDishesOrders() {
		
		return iDishesOrdersDAO.findAll();
	}

	@Override
	public DishesOrders newDishOrder(DishesOrders dishOrder) {
		
		return iDishesOrdersDAO.save(dishOrder);
	}

	@Override
	public DishesOrders dishOrderByID(int id) {
		
		return iDishesOrdersDAO.findById(id).get();
	}

	@Override
	public DishesOrders updateDishOrder(DishesOrders dishOrder) {
		
		return iDishesOrdersDAO.save(dishOrder);
	}

	@Override
	public void deleteDishOrder(int id) {
		
		iDishesOrdersDAO.deleteById(id);
	}

}
