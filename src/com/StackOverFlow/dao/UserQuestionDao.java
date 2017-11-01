package com.StackOverFlow.dao;

import java.util.List;

import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.model.UserSolution;

public interface UserQuestionDao {

	public List<UserQuestion> getUserQuestion();
	public String setUserQuestion(UserQuestion user);
	public String deleteuserquestion(UserQuestion deleteuserquestion);
	public List<UserQuestion> getUserQuestionbyid(UserQuestion getbyUserQuestionID);
	public String getUserQuestionbyid(long questionLike, long questionID);


}
