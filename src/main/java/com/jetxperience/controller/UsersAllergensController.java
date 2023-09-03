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
import com.jetxperience.service.UsersAllergensServiceImpl;
import com.jetxperience.dto.UsersAllergens;

@RestController
public class UsersAllergensController {

	@Autowired
	UsersAllergensServiceImpl usuarios_alergenosServiceImpl;
	
	@GetMapping("/usuarios_alergenos")
	public List<UsersAllergens> listUsersAllergens(){
		
		return usuarios_alergenosServiceImpl.listUsersAllergens(); 
	}
	
	@GetMapping("/usuarios_alergenos/{id}")
	public UsersAllergens usersAllergensById(@PathVariable(name="id") int id) {
		
		UsersAllergens usersAllergens_byID = new UsersAllergens();
		
		usersAllergens_byID = usuarios_alergenosServiceImpl.userAllergenById(id);
		
		System.out.println("Usuario_Alérgeno byID: "+usersAllergens_byID);
		
		return usersAllergens_byID;
	}
	
	@PostMapping("/usuarios_alergenos")
	public UsersAllergens newUserAllergen(@RequestBody UsersAllergens usersAllergens) {
		
		return usuarios_alergenosServiceImpl.newUserAllergen(usersAllergens);
	}
	
	@DeleteMapping("/usuarios_alergenos/{id}")
	public void deleteUserAllergen(@PathVariable(name="id") int id) {
		
		usuarios_alergenosServiceImpl.deleteUserAllergen(id);
	}
}