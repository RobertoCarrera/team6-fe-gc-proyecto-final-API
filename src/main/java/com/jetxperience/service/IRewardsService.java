package com.jetxperience.service;

import com.jetxperience.dto.Rewards;
import java.util.List;

public interface IRewardsService {

	public List<Rewards> listRewards();
	
	public Rewards newReward(Rewards reward);
	
	public Rewards rewardByID(int id);
	
	public Rewards updateReward(Rewards reward);
	
	public void deleteReward(int id);
}