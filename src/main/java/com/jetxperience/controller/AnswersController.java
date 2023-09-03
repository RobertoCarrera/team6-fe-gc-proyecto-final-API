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
import com.jetxperience.service.AnswersServiceImpl;
import com.jetxperience.dto.Answers;

@RestController
public class AnswersController {

	@Autowired
	AnswersServiceImpl answersServiceImpl;
	
	@GetMapping("/respuestas")
	public List<Answers> listAnswers(){
		
		return answersServiceImpl.listAnswers(); 
	}
	
	@GetMapping("/respuestas/{id}")
	public Answers answerById(@PathVariable(name="id") int id) {
		
		Answers answer_byID = new Answers();
		
		answer_byID = answersServiceImpl.answerByID(id);
		
		System.out.println("Dish byID: "+answer_byID);
		
		return answer_byID;
	}
	
	@PostMapping("/respuestas")
	public Answers newAnswer(@RequestBody Answers answer) {
		
		return answersServiceImpl.newAnswer(answer);
	}
	 
	@PutMapping("/respuestas/{id}")
	public Answers updateAnswer(@PathVariable(name="id")int id, @RequestBody Answers answer) {
		
		Answers answer_selected = new Answers();
		Answers answer_updated = new Answers();

		answer_selected.setMessage(answer.getMessage());
		answer_selected.setDateSend(answer.getDateSend());
		answer_selected.setComplaint(answer.getComplaint());
		
		answer_updated = answersServiceImpl.updateAnswer(answer_selected);
		
		System.out.println("La respuesta actualizada es: "+answer_updated);
		
		return answer_updated;
	}
	
	@DeleteMapping("/respuestas/{id}")
	public void deleteAnswer(@PathVariable(name="id") int id) {
		
		answersServiceImpl.deleteAnswer(id);
	}
}