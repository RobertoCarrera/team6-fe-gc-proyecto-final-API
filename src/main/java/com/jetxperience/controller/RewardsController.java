package com.jetxperience.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jetxperience.service.RewardsServiceImpl;
import com.jetxperience.dto.Rewards;

@RestController
public class RewardsController {

	@Autowired
	RewardsServiceImpl rewardsServiceImpl;
	
	@GetMapping("/rewards")
	public List<Rewards> listRewards(){
		
		return rewardsServiceImpl.listRewards(); 
	}
	
	@GetMapping("/rewards/{id}")
	public Rewards rewardById(@PathVariable(name="id") int id) {
		
		Rewards reward_byID = new Rewards();
		
		reward_byID = rewardsServiceImpl.rewardByID(id);
		
		System.out.println("Dish byID: "+reward_byID);
		
		return reward_byID;
	}
	
	@PostMapping("/rewards")
	public Rewards newReward(@RequestBody Rewards reward) {
		
		return rewardsServiceImpl.newReward(reward);
	}
	
	@PutMapping("/rewards/{id}")
	public Rewards updateReward(@PathVariable(name="id")int id, @RequestBody Rewards reward) {
		
		Rewards reward_selected = new Rewards();
		Rewards reward_updated = new Rewards();
		
		reward_selected.setActive(reward.isActive());
		reward_selected.setName(reward.getName());
		reward_selected.setDescription(reward.getDescription());
		reward_selected.setCost(reward.getCost());
		reward_selected.setDiscount(reward.getDiscount());
		reward_selected.setImage(reward.getImage());
		reward_selected.setCategory(reward.getCategory());
		
		reward_updated = rewardsServiceImpl.updateReward(reward_selected);
		
		System.out.println("El plato actualizado es: "+reward_updated);
		
		return reward_updated;
	}
	
	@DeleteMapping("/rewards/{id}")
	public void deleteReward(@PathVariable(name="id") int id) {
		
		rewardsServiceImpl.deleteReward(id);
	}
}