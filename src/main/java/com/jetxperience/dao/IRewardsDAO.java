package com.jetxperience.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.Rewards;

public interface IRewardsDAO extends JpaRepository<Rewards, Integer>{

}