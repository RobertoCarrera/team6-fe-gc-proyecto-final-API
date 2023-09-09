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
import com.jetxperience.service.HoursServiceImpl;
import com.jetxperience.dto.Hours;

@RestController
public class HoursController {

	@Autowired
	HoursServiceImpl hoursServiceImpl;
	
	@GetMapping("/hours")
	public List<Hours> listHours(){
		
		return hoursServiceImpl.listHours(); 
	}
	
	@GetMapping("/hours/{id}")
	public Hours hourById(@PathVariable(name="id") int id) {
		
		Hours hour_byID = new Hours();
		
		hour_byID = hoursServiceImpl.hourByID(id);
		
		System.out.println("Dish byID: "+hour_byID);
		
		return hour_byID;
	}
	
	@PostMapping("/hours")
	public Hours newHour(@RequestBody Hours hour) {
		
		return hoursServiceImpl.newHour(hour);
	}
	
	@PutMapping("/hours/{id}")
	public Hours updateHour(@PathVariable(name="id")int id, @RequestBody Hours hour) {
		
		Hours hour_selected = new Hours();
		Hours hour_updated = new Hours();

		hour_selected.setHour(hour.getHour());
		hour_selected.setAvailable(hour.isAvailable());
		
		hour_updated = hoursServiceImpl.updateHour(hour_selected);
		
		System.out.println("El plato actualizado es: "+hour_updated);
		
		return hour_updated;
	}
	
	@DeleteMapping("/hours/{id}")
	public void deleteHour(@PathVariable(name="id") int id) {
		
		hoursServiceImpl.deleteHour(id);
	}
}