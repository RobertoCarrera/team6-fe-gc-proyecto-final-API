package com.jetxperience.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jetxperience.dto.Roles;
import com.jetxperience.dto.Users;

@Repository
public interface IUsersDAO extends JpaRepository<Users, Long> {
	
	// Buscar usuario por email
	
	Optional<Users> findByEmail(String email);
	
	// Buscar usuario por nombre
	
	Optional<Users> findByName(String name);
	
	
	// Buscar usuario por apellidos
	
	Optional<Users> findBySurname(String surname);
	
	// Buscar usuario por id
	
	Optional<Users> findById(int id);
		
	
	// Buscar usuarios por rol
	
	public List<Users> findByRoleOrderByNameAsc(Roles role);
	
	void deleteById(int id);

}