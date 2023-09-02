package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.DishesOrders;

public interface IDishesOrdersDAO extends JpaRepository<DishesOrders, Integer>{

}