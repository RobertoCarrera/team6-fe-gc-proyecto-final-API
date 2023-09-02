package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Users;

public interface IUsersDAO extends JpaRepository<Users, Integer>{

}