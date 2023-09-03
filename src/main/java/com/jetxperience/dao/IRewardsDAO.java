package com.jetxperience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Rewards;

public interface IRewardsDAO extends JpaRepository<Rewards, Integer>{

}