package com.jetxperience.service;

import java.util.List;
import com.jetxperience.dto.HoursOrders;

public interface IHoursOrdersService {
	
	public List<HoursOrders> listHoursOrders();
	
	public HoursOrders newHourOrder(HoursOrders hourOrder);
	
	public HoursOrders hourOrderByID(int id);
	
	public HoursOrders updateHourOrder(HoursOrders hourOrder);
	
	public void deleteHourOrder(int id);
}
