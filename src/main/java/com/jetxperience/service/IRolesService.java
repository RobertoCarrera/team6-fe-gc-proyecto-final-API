package com.jetxperience.service;

import com.jetxperience.dto.Roles;
import java.util.List;

public interface IRolesService {

	public List<Roles> listRoles();
	
	public Roles newRole(Roles roles);
	
	public Roles roleByID(int id);
	
	public Roles updateRole(Roles roles);
	
	public void deleteRole(int id);
	
	public Roles getRoleByName(String name);

}