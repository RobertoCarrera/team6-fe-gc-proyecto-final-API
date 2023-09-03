package com.jetxperience.service;

import com.jetxperience.dto.Answers;
import java.util.List;

public interface IAnswersService {

	public List<Answers> listAnswers();
	
	public Answers newAnswer(Answers answers);
	
	public Answers answerByID(int id);
	
	public Answers updateAnswer(Answers answers);
	
	public void deleteAnswer(int id);
}