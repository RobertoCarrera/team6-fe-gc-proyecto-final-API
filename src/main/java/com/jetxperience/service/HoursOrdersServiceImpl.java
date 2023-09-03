package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IHoursOrdersDAO;
import com.jetxperience.dto.HoursOrders;

@Service
public class HoursOrdersServiceImpl implements IHoursOrdersService {

	@Autowired
	IHoursOrdersDAO iHoursOrdersDAO;
	
	@Override
	public List<HoursOrders> listHoursOrders() {

		return iHoursOrdersDAO.findAll();
	}

	@Override
	public HoursOrders newHourOrder(HoursOrders hourOrder) {

		return iHoursOrdersDAO.save(hourOrder);
	}

	@Override
	public HoursOrders hourOrderByID(int id) {

		return iHoursOrdersDAO.findById(id).get();
	}

	@Override
	public HoursOrders updateHourOrder(HoursOrders hourOrder) {

		return iHoursOrdersDAO.save(hourOrder);
	}

	@Override
	public void deleteHourOrder(int id) {

		iHoursOrdersDAO.deleteById(id);
	}

}
