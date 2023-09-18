package com.jetxperience.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jetxperience.dto.UsersRewards;
import com.jetxperience.dto.Rewards;

public interface IUsersRewardsDAO extends JpaRepository<UsersRewards, Integer>{

	public List<Rewards> findRewardsByIdUsers(int id);
}