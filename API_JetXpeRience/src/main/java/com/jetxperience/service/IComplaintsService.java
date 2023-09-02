package com.jetxperience.service;

import com.jetxperience.dto.Complaints;
import java.util.List;

public interface IComplaintsService {

	public List<Complaints> listComplaints();
	
	public Complaints newComplaint(Complaints complaint);
	
	public Complaints complaintByID(int id);
	
	public Complaints updateCategory(Complaints complaint);
	
	public void deleteComplaint(int id);
}