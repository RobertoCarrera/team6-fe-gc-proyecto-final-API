package com.jetxperience.service;

import com.jetxperience.dto.Roles;
import com.jetxperience.dto.Users;
import java.util.List;
import java.util.Optional;

public interface IUsersService {

	public List<Users> listUsers();
	
	public String getRoleNameByEmail(String email);

	public Users newUser(Users user);
	
	public Users userByID(String email);
	
	public Users updateUser(Users user);
	
	// Buscar usuario por id
	public Optional<Users> getUserById(int id);
	
	// Buscar usuario por email
	public Optional<Users> getUserByEmail(String email);
	
	// Buscar usuario por nombre
	public Optional<Users> getUserByName(String name);
	
	// Buscar usuario por apellido
	public Optional<Users> getUserBySurname(String surname);
	
	// Buscar usuarios por rol
	public List<Users> getAllUsersByRole(Roles role);
	
	public void deleteUser(int id);

	
		
}