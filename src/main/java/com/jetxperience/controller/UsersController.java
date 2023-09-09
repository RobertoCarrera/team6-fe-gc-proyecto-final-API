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
import com.jetxperience.service.UsersServiceImpl;
import com.jetxperience.dto.Users;

@RestController
public class UsersController {

	@Autowired
	UsersServiceImpl usersServiceImpl;
	
	@GetMapping("/users")
	public List<Users> listUsers(){
		
		return usersServiceImpl.listUsers(); 
	}
	
	@GetMapping("/users/{id}")
	public Users userById(@PathVariable(name="id") int id) {
		
		Users user_byID = new Users();
		
		user_byID = usersServiceImpl.userByID(id);
		
		System.out.println("Dish byID: "+user_byID);
		
		return user_byID;
	}
	
	@PostMapping("/users")
	public Users newUser(@RequestBody Users user) {
		
		return usersServiceImpl.newUser(user);
	}
	
	@PutMapping("/users/{id}")
	public Users updateUser(@PathVariable(name="id")int id, @RequestBody Users user) {
		
		Users user_selected = new Users();
		Users user_updated = new Users();
		
		user_selected.setActive(user.isActive());
		user_selected.setName(user.getName());
		user_selected.setSurname(user.getSurname());
		user_selected.setEmail(user.getEmail());
		user_selected.setPassword(user.getPassword());
		user_selected.setRole(user.getRole());
		user_selected.setImage(user.getImage());
		
		user_updated = usersServiceImpl.updateUser(user_selected);
		
		System.out.println("El plato actualizado es: "+user_updated);
		
		return user_updated;
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable(name="id") int id) {
		
		usersServiceImpl.deleteUser(id);
	}
}