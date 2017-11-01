package com.StackOverFlow.dao;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;



import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.service.UserQuestionService;
import com.StackOverFlow.util.HibernateUtil;

public class UserQuestionDaoImpl implements UserQuestionDao {

HibernateUtil hibernateUtil = new HibernateUtil();


	@Override
	public List<UserQuestion> getUserQuestion() {
		hibernateUtil.openCurrentSession();
		
		List<UserQuestion> UserQuestion_records =(List<UserQuestion>)hibernateUtil.getCurrentSession().createQuery("from UserQuestion").list();
		
		hibernateUtil.closeCurrentSession();
		
		return UserQuestion_records;
	}


	@Override
	public String setUserQuestion(UserQuestion user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		long id = (Long)hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "succes"+id;
	}


	@Override
	public String deleteuserquestion(UserQuestion deleteuserquestion) {
		
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().delete(deleteuserquestion);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "delete succes"+deleteuserquestion;
	}
	
	


	@Override
	public List<UserQuestion> getUserQuestionbyid(UserQuestion getbyUserQuestionID) {
		hibernateUtil.openCurrentSession();
		
		List<UserQuestion> UserQuestion_records = (List<UserQuestion>)hibernateUtil.getCurrentSession().createQuery("from UserQuestion where QuestionUserIDFK ='"+getbyUserQuestionID+"' ").list();
		
		hibernateUtil.closeCurrentSession();
		
		return UserQuestion_records;
	}


	@Override
	public String getUserQuestionbyid(long questionLike, long questionID) {
		hibernateUtil.openCurrentSession();
		
		hibernateUtil.getCurrentSession().createQuery("update UserQuestion set QuestionLike = '"+questionLike +"' where QuestionID ='"+questionID+"' ");
		
		hibernateUtil.closeCurrentSession();
		
		return "question like added";
	}


	
	}
	
	