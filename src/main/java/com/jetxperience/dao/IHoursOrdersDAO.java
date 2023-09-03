package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.HoursOrders;

public interface IHoursOrdersDAO extends JpaRepository<HoursOrders, Integer>{

}