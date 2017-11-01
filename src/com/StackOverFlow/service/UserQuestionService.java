package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.model.UserSolution;

public interface UserQuestionService {
	
	public List<UserQuestion> getUserQuestion();
	public String setUserQuestion(UserQuestion user);
	public String deleteuserquestion(UserQuestion deleteuserquestion);
	public List<UserQuestion> getUserQuestionbyid(UserQuestion getbyUserQuestionID);
	public String updateQuestionLike(long questionLike, long questionID);
	

}
