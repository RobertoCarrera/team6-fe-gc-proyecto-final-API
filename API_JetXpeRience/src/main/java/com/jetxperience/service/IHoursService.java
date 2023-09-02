package com.jetxperience.service;

import com.jetxperience.dto.Hours;
import java.util.List;

public interface IHoursService {

	public List<Hours> listHours();
	
	public Hours newHour(Hours hour);
	
	public Hours hourByID(int id);
	
	public Hours updateHour(Hours hour);
	
	public void deleteHour(int id);
}