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
import com.jetxperience.service.ComplaintsServiceImpl;
import com.jetxperience.dto.Complaints;

@RestController
public class ComplaintsController {

	@Autowired
	ComplaintsServiceImpl complaintsServiceImpl;
	
	@GetMapping("/complaints")
	public List<Complaints> listComplaints(){
		
		return complaintsServiceImpl.listComplaints(); 
	}
	
	@GetMapping("/complaints/id/{id}")
	public Complaints complaintById(@PathVariable(name="id") int id) {
		
		Complaints complaint_byID = new Complaints();
		
		complaint_byID = complaintsServiceImpl.complaintByID(id);
		
		System.out.println("Dish byID: "+complaint_byID);
		
		return complaint_byID;
	}
	
	@PostMapping("/complaints")
	public Complaints newComplaint(@RequestBody Complaints complaint) {
		
		return complaintsServiceImpl.newComplaint(complaint);
	}
	 
	@PutMapping("/complaints/{id}")
	public Complaints updateComplaint(@PathVariable(name="id")int id, @RequestBody Complaints complaint) {
		
		Complaints complaint_selected = new Complaints();
		Complaints complaint_updated = new Complaints();

		complaint_selected.setMessage(complaint.getMessage());
		complaint_selected.setDateSend(complaint.getDateSend());
		
		complaint_updated = complaintsServiceImpl.updateComplaint(complaint_selected);
		
		System.out.println("La reclamación actualizada es: "+complaint_updated);
		
		return complaint_updated;
	}
	
	@DeleteMapping("/complaints/{id}")
	public void deleteComplaint(@PathVariable(name="id") int id) {
		
		complaintsServiceImpl.deleteComplaint(id);
	}
}