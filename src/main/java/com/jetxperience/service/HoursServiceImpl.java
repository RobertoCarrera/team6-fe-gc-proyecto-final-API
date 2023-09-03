package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IHoursDAO;
import com.jetxperience.dto.Hours;

@Service
public class HoursServiceImpl implements IHoursService {

	@Autowired
	IHoursDAO iHoursDAO;
	
	@Override
	public List<Hours> listHours() {

		return iHoursDAO.findAll();
	}

	@Override
	public Hours newHour(Hours hour) {

		return iHoursDAO.save(hour);
	}

	@Override
	public Hours hourByID(int id) {

		return iHoursDAO.findById(id).get();
	}

	@Override
	public Hours updateHour(Hours hour) {

		return iHoursDAO.save(hour);
	}

	@Override
	public void deleteHour(int id) {

		iHoursDAO.deleteById(id);
	}

}
