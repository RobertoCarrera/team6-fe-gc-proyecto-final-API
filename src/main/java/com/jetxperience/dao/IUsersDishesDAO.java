package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersDishes;

public interface IUsersDishesDAO extends JpaRepository<UsersDishes, Integer>{

}