package com.jetxperience.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jetxperience.dto.Users;

@Repository
public interface IUsersDAO extends JpaRepository<Users, Integer>{

	Optional<Users> findByUsername(String username);
	
	void deleteByUsername(String username);
	
}