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
	public Roles newRole(Roles roles) {

		return iRolesDAO.save(roles);
	}

	@Override
	public Roles roleByID(int id) {

		return iRolesDAO.findById(id).get();
	}

	@Override
	public Roles updateRole(Roles roles) {

		return iRolesDAO.save(roles);
	}
	
	@Override
	public Roles getRoleByName(String name) {

		return iRolesDAO.findByName(name);
	}
	
	
	@Override
	public void deleteRole(int id) {

		iRolesDAO.deleteById(id);
	}

}
