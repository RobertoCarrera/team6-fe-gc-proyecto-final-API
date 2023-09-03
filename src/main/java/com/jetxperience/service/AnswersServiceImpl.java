package com.jetxperience.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetxperience.dao.IAnswersDAO;
import com.jetxperience.dto.Answers;

@Service
public class AnswersServiceImpl implements IAnswersService {

	@Autowired
	IAnswersDAO iAnswersDAO;
	
	@Override
	public List<Answers> listAnswers() {
		
		return iAnswersDAO.findAll();
	}

	@Override
	public Answers newAnswer(Answers answer) {
		
		return iAnswersDAO.save(answer);
	}

	@Override
	public Answers answerByID(int id) {
		
		return iAnswersDAO.findById(id).get();
	}

	@Override
	public Answers updateAnswer(Answers answer) {
		
		return iAnswersDAO.save(answer);
	}

	@Override
	public void deleteAnswer(int id) {
		
		iAnswersDAO.deleteById(id);
	}

}
