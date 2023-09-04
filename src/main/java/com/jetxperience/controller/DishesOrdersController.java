package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.DishesOrdersServiceImpl;
import com.jetxperience.dto.DishesOrders;

@RestController
public class DishesOrdersController {

	@Autowired
	DishesOrdersServiceImpl dishesOrdersServiceImpl;
	
	@GetMapping("/platos_pedidos")
	public List<DishesOrders> listDishesOrders(){
		
		return dishesOrdersServiceImpl.listDishesOrders(); 
	}
	
	@GetMapping("/platos_pedidos/{id}")
	public DishesOrders dishOrderById(@PathVariable(name="id") int id) {
		
		DishesOrders dishOrder_byID = new DishesOrders();
		
		dishOrder_byID = dishesOrdersServiceImpl.dishOrderByID(id);
		
		System.out.println("Dish byID: "+dishOrder_byID);
		
		return dishOrder_byID;
	}
	
	@PostMapping("/platos_pedidos")
	public DishesOrders newDishOrder(@RequestBody DishesOrders dishOrder) {
		
		return dishesOrdersServiceImpl.newDishOrder(dishOrder);
	}
	
	@DeleteMapping("/platos_pedidos/{id}")
	public void deleteDishOrder(@PathVariable(name="id") int id) {
		
		dishesOrdersServiceImpl.deleteDishOrder(id);
	}
}