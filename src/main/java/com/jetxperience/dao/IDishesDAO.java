package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Dishes;

public interface IDishesDAO extends JpaRepository<Dishes, Integer>{

}