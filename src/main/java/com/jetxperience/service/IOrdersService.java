package com.jetxperience.service;

import com.jetxperience.dto.Orders;
import java.util.List;

public interface IOrdersService {

	public List<Orders> listOrders();
	
	public Orders newOrder(Orders order);
	
	public Orders orderByID(int id);
	
	public Orders updateOrder(Orders order);
	
	public void deleteOrder(int id);
}