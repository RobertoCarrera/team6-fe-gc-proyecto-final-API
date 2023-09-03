package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.DishesOrders;

public interface IDishesOrdersDAO extends JpaRepository<DishesOrders, Integer>{

}