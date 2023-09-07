package com.jetxperience.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Users;

public interface IUsersDAO extends JpaRepository<Users, Long> {
	
	Optional<Users> findByEmail(String email);
	
	void deleteByEmail(String email);

}