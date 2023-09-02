package com.jetxperience.service;

import com.jetxperience.dto.Answers;
import java.util.List;

public interface IAnswersService {

	public List<Answers> listAnswers();
	
	public Answers newAnswers(Answers answers);
	
	public Answers answersByID(int id);
	
	public Answers updateAnswers(Answers answers);
	
	public void deleteAnswer(int id);
}