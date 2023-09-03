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
import com.jetxperience.service.HoursOrdersServiceImpl;
import com.jetxperience.dto.HoursOrders;

@RestController
public class HoursOrdersController {

	@Autowired
	HoursOrdersServiceImpl hoursOrdersServiceImpl;
	
	@GetMapping("/horas_pedidos")
	public List<HoursOrders> listHoursOrders(){
		
		return hoursOrdersServiceImpl.listHoursOrders(); 
	}
	
	@GetMapping("/horas_pedidos/{id}")
	public HoursOrders hourOrderById(@PathVariable(name="id") int id) {
		
		HoursOrders hourOrder_byID = new HoursOrders();
		
		hourOrder_byID = hoursOrdersServiceImpl.hourOrderByID(id);
		
		System.out.println("Hour byID: "+hourOrder_byID);
		
		return hourOrder_byID;
	}
	
	@PostMapping("/horas_pedidos")
	public HoursOrders newHourOrder(@RequestBody HoursOrders hourOrder) {
		
		return hoursOrdersServiceImpl.newHourOrder(hourOrder);
	}
	
	@DeleteMapping("/horas_pedidos/{id}")
	public void deleteHourOrder(@PathVariable(name="id") int id) {
		
		hoursOrdersServiceImpl.deleteHourOrder(id);
	}
}