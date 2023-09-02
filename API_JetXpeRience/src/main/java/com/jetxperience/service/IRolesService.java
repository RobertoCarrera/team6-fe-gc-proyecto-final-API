package com.jetxperience.service;

import com.jetxperience.dto.Roles;
import java.util.List;

public interface IRolesService {

	public List<Roles> listRoles();
	
	public Roles newRol(Roles roles);
	
	public Roles rolByID(int id);
	
	public Roles updateRol(Roles roles);
	
	public void deleteRol(int id);
}