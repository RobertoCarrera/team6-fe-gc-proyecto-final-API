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
import com.jetxperience.service.RolesServiceImpl;
import com.jetxperience.dto.Roles;

@RestController
public class RolesController {

	@Autowired
	RolesServiceImpl rolesServiceImpl;
	
	@GetMapping("/roles")
	public List<Roles> listRoles(){
		
		return rolesServiceImpl.listRoles(); 
	}
	
	@GetMapping("/roles/{id}")
	public Roles roleById(@PathVariable(name="id") int id) {
		
		Roles role_byID = new Roles();
		
		role_byID = rolesServiceImpl.roleByID(id);
		
		System.out.println("Dish byID: "+role_byID);
		
		return role_byID;
	}
	
	@PostMapping("/roles")
	public Roles newRole(@RequestBody Roles role) {
		
		return rolesServiceImpl.newRole(role);
	}
	
	@PutMapping("/roles/{id}")
	public Roles updateRole(@PathVariable(name="id")int id, @RequestBody Roles role) {
		
		Roles role_selected = new Roles();
		Roles role_updated = new Roles();
		
		role_selected.setName(role.getName());
		
		role_updated = rolesServiceImpl.updateRole(role_selected);
		
		System.out.println("El plato actualizado es: "+role_updated);
		
		return role_updated;
	}
	
	@DeleteMapping("/roles/{id}")
	public void deleteRole(@PathVariable(name="id") int id) {
		
		rolesServiceImpl.deleteRole(id);
	}
}