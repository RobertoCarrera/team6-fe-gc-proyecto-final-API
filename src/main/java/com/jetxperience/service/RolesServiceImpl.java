package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IRolesDAO;
import com.jetxperience.dto.Roles;

@Service
public class RolesServiceImpl implements IRolesService {

	@Autowired
	IRolesDAO iRolesDAO;
	
	@Override
	public List<Roles> listRoles() {

		return iRolesDAO.findAll();
	}

	@Override
	public Roles newRol(Roles roles) {

		return iRolesDAO.save(roles);
	}

	@Override
	public Roles rolByID(int id) {

		return iRolesDAO.findById(id).get();
	}

	@Override
	public Roles updateRol(Roles roles) {

		return iRolesDAO.save(roles);
	}

	@Override
	public void deleteRol(int id) {

		iRolesDAO.deleteById(id);
	}

}
