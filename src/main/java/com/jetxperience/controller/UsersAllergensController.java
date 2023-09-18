package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.UsersAllergensServiceImpl;
import com.jetxperience.dto.UsersAllergens;

@RestController
public class UsersAllergensController {

	@Autowired
	UsersAllergensServiceImpl users_allergensServiceImpl;
	
	@GetMapping("/users_allergens")
	public List<UsersAllergens> listUsersAllergens(){
		
		return users_allergensServiceImpl.listUsersAllergens(); 
	}
	
	@GetMapping("/users_allergens/user/{id}")
	public List<UsersAllergens> listUsersAllergensByUsers(@PathVariable int id){
		
		return users_allergensServiceImpl.listUsersAllergensByUserId(id);
	}
	
	@GetMapping("/users_allergens/{id}")
	public UsersAllergens usersAllergensById(@PathVariable(name="id") int id) {
		
		UsersAllergens usersAllergens_byID = new UsersAllergens();
		
		usersAllergens_byID = users_allergensServiceImpl.userAllergenById(id);
		
		System.out.println("Usuario_Alérgeno byID: "+usersAllergens_byID);
		
		return usersAllergens_byID;
	}
	
	@PostMapping("/users_allergens")
	public UsersAllergens newUserAllergen(@RequestBody UsersAllergens usersAllergens) {
		
		return users_allergensServiceImpl.newUserAllergen(usersAllergens);
	}
	
	@DeleteMapping("/users_allergens/{id}")
	public void deleteUserAllergen(@PathVariable(name="id") int id) {
		
		users_allergensServiceImpl.deleteUserAllergen(id);
	}
}