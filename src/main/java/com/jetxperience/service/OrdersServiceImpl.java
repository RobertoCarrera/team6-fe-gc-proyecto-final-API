package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IOrdersDAO;
import com.jetxperience.dto.Orders;

@Service
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	IOrdersDAO iOrdersDAO;
	
	@Override
	public List<Orders> listOrders() {

		return iOrdersDAO.findAll();
	}

	@Override
	public Orders newOrder(Orders order) {

		return iOrdersDAO.save(order);
	}

	@Override
	public Orders orderByID(int id) {

		return iOrdersDAO.findById(id).get();
	}

	@Override
	public Orders updateOrder(Orders order) {

		return iOrdersDAO.save(order);
	}

	@Override
	public void deleteOrder(int id) {

		iOrdersDAO.deleteById(id);
	}

}
