package com.jetxperience.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Dishes;

public interface IDishesDAO extends JpaRepository<Dishes, Integer>{

	public List<Dishes> findByCategoryId(int category);
}