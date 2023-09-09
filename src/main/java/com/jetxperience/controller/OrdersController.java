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
import com.jetxperience.service.OrdersServiceImpl;
import com.jetxperience.dto.Orders;

@RestController
public class OrdersController {

	@Autowired
	OrdersServiceImpl ordersServiceImpl;
	
	@GetMapping("/orders")
	public List<Orders> listOrders(){
		
		return ordersServiceImpl.listOrders(); 
	}
	
	@GetMapping("/orders/{id}")
	public Orders orderById(@PathVariable(name="id") int id) {
		
		Orders order_byID = new Orders();
		
		order_byID = ordersServiceImpl.orderByID(id);
		
		System.out.println("Dish byID: "+order_byID);
		
		return order_byID;
	}
	
	@PostMapping("/orders")
	public Orders newOrder(@RequestBody Orders order) {
		
		return ordersServiceImpl.newOrder(order);
	}
	
	@PutMapping("/pedidos/{id}")
	public Orders updateOrder(@PathVariable(name="id")int id, @RequestBody Orders order) {
		
		Orders order_selected = new Orders();
		Orders order_updated = new Orders();
		
		order_selected.setTotal(order.getTotal());
		order_selected.setDiscount(order.getDiscount());
		order_selected.setDateOrdered(order.getDateOrdered());
		order_selected.setTimePickUp(order.getTimePickUp());
		order_selected.setUser(order.getUser());
		
		order_updated = ordersServiceImpl.updateOrder(order_selected);
		
		System.out.println("El plato actualizado es: "+order_updated);
		
		return order_updated;
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable(name="id") int id) {
		
		ordersServiceImpl.deleteOrder(id);
	}
}