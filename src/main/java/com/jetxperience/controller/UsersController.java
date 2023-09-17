package com.jetxperience.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jetxperience.service.RolesServiceImpl;
import com.jetxperience.service.UsersServiceImpl;
import com.jetxperience.dto.Roles;
import com.jetxperience.dto.Users;

@RestController
public class UsersController {

	@Autowired
	UsersServiceImpl usersServiceImpl;
	
	@Autowired
	RolesServiceImpl roleServiceImpl;
	
	@GetMapping("/users")
	public List<Users> listUsers(){
		
		return usersServiceImpl.listUsers(); 
	}
	
	@GetMapping("/users/{id}")
	public Users userById(@PathVariable(name="id") String email) {
		
		Users user_byID = new Users();
		
		user_byID = usersServiceImpl.userByID(email);
		
		System.out.println("Dish byID: "+user_byID);
		
		return user_byID;
	}
	
	// Buscar usuario por id
	@GetMapping("/users/id/{id}")
	public Optional<Users> getUserById(@PathVariable(name = "id") int id) {

		return usersServiceImpl.getUserById(id);
	}
	
	
	// Buscar usuario por email
	@GetMapping("/users/email/{email}")
	public Optional<Users> getUserByEmail(@PathVariable(name = "email") String email) {

		return usersServiceImpl.getUserByEmail(email);
	}
	
	
	// Buscar usuario por nombre
	@GetMapping("/users/name/{name}")
	public Optional<Users> getUserByName(@PathVariable(name = "name") String name) {

		return usersServiceImpl.getUserByName(name);
	}
	
	
	// Buscar usuario por apellidos
	@GetMapping("/users/surname/{surname}")
	public Optional<Users> getUserBySurname(@PathVariable(name = "surname") String surname) {

		return usersServiceImpl.getUserBySurname(surname);
	}
	
	
	
	// Buscar usuarios por rol
	@GetMapping("/users/role/{rolename}")
	public List<Users> getAllUsersByRoleASC(@PathVariable(name = "rolename") String rolename) {
		Roles role = roleServiceImpl.getRoleByName(rolename);

		return usersServiceImpl.getAllUsersByRole(role);
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
	
	@DeleteMapping("/users/id/{id}")
	public void deleteUser(@PathVariable(name="id") int id) {
		
		usersServiceImpl.deleteUser(id);
	}
}