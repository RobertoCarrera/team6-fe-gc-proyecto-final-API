package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IRewardsDAO;
import com.jetxperience.dto.Rewards;

@Service
public class RewardsServiceImpl implements IRewardsService {

	@Autowired
	IRewardsDAO iRewardsDAO;
	
	@Override
	public List<Rewards> listRewards() {

		return iRewardsDAO.findAll();
	}

	@Override
	public Rewards newReward(Rewards reward) {

		return iRewardsDAO.save(reward);
	}

	@Override
	public Rewards rewardByID(int id) {

		return iRewardsDAO.findById(id).get();
	}

	@Override
	public Rewards updateReward(Rewards reward) {

		return iRewardsDAO.save(reward);
	}

	@Override
	public void deleteReward(int id) {

		iRewardsDAO.deleteById(id);
	}

}
