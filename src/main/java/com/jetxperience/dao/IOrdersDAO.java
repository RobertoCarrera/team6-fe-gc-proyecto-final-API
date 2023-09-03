package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Orders;

public interface IOrdersDAO extends JpaRepository<Orders, Integer>{

}