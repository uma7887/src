package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.dao.UserQuestionDao;
import com.StackOverFlow.dao.UserQuestionDaoImpl;
import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.model.UserSolution;

public class UserQuestionServiceImpl implements UserQuestionService {
	UserQuestionDao userquestiondao = new UserQuestionDaoImpl();  
	@Override
	public List<UserQuestion> getUserQuestion() {
		return userquestiondao.getUserQuestion();
	}
	@Override
	public String setUserQuestion(UserQuestion user) {
		return userquestiondao.setUserQuestion(user) ;
	}
	@Override
	public String deleteuserquestion(UserQuestion deleteuserquestion) {
		return userquestiondao.deleteuserquestion(deleteuserquestion);
	}
	@Override
	public List<UserQuestion> getUserQuestionbyid(UserQuestion getbyUserQuestionID) {
		return userquestiondao.getUserQuestionbyid(getbyUserQuestionID);
	}
	@Override
	public String updateQuestionLike(long questionLike, long questionID) {
		return userquestiondao.getUserQuestionbyid(questionLike, questionID);
	}
	
	


}
