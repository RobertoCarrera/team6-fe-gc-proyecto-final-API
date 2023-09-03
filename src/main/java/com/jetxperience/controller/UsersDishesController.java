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
import com.jetxperience.service.UsersDishesServiceImpl;
import com.jetxperience.dto.UsersDishes;

@RestController
public class UsersDishesController {

	@Autowired
	UsersDishesServiceImpl usuarios_platosServiceImpl;
	
	@GetMapping("/usuarios_platos")
	public List<UsersDishes> listUsersDishes(){
		
		return usuarios_platosServiceImpl.listUsersDishes(); 
	}
	
	@GetMapping("/usuarios_platos/{id}")
	public UsersDishes usersDishesById(@PathVariable(name="id") int id) {
		
		UsersDishes usersDishes_byID = new UsersDishes();
		
		usersDishes_byID = usuarios_platosServiceImpl.userDishById(id);
		
		System.out.println("Usuario_Platos byID: "+usersDishes_byID);
		
		return usersDishes_byID;
	}
	
	@PostMapping("/usuarios_platos")
	public UsersDishes newUserDish(@RequestBody UsersDishes usersDishes) {
		
		return usuarios_platosServiceImpl.newUserDish(usersDishes);
	}
	
	@DeleteMapping("/usuarios_platos/{id}")
	public void deleteUserDish(@PathVariable(name="id") int id) {
		
		usuarios_platosServiceImpl.deleteUserDish(id);
	}
}