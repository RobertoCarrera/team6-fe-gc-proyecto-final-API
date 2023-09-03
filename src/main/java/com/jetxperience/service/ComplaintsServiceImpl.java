package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IComplaintsDAO;
import com.jetxperience.dto.Complaints;

@Service
public class ComplaintsServiceImpl implements IComplaintsService {

	 @Autowired
	 IComplaintsDAO iComplaintsDAO;
	
	@Override
	public List<Complaints> listComplaints() {
		
		return iComplaintsDAO.findAll();
	}

	@Override
	public Complaints newComplaint(Complaints complaint) {
		
		return iComplaintsDAO.save(complaint);
	}

	@Override
	public Complaints complaintByID(int id) {
		
		return iComplaintsDAO.findById(id).get();
	}

	@Override
	public Complaints updateCategory(Complaints complaint) {
		
		return iComplaintsDAO.save(complaint);
	}

	@Override
	public void deleteComplaint(int id) {
		
		iComplaintsDAO.deleteById(id);
	}

}
