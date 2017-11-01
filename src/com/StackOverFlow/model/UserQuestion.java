package com.StackOverFlow.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "UserQuestion")
public class UserQuestion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "QuestionID")
	private long QuestionID;
	
	@Column (name = "Question",unique = true)
	private String Question;
	
	@Column (name = "QuestionLike")
	private long QuestionLike;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "QuestionTime")
	private Calendar QuestionTime;
	
	@Column (name = "QuestionTechnology")
	private String QuestionTechnology;
	
	@Column (name = "QuestionDescription")
	private String QuestionDescription;
	
	public String getQuestionDescription() {
		return QuestionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		QuestionDescription = questionDescription;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "QuestionUserIDFK" )
	private LoginUserDetail LoginUserDetail;

	public long getQuestionID() {
		return QuestionID;
	}

	public void setQuestionID(long questionID) {
		QuestionID = questionID;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public long getQuestionLike() {
		return QuestionLike;
	}

	public void setQuestionLike(long questionLike) {
		QuestionLike = questionLike;
	}

	public Calendar getQuestionTime() {
		return QuestionTime;
	}

	public void setQuestionTime(Calendar questionTime) {
		QuestionTime = questionTime;
	}

	public String getQuestionTechnology() {
		return QuestionTechnology;
	}

	public void setQuestionTechnology(String questionTechnology) {
		QuestionTechnology = questionTechnology;
	}

	public LoginUserDetail getLoginUserDetail() {
		return LoginUserDetail;
	}

	public void setLoginUserDetail(LoginUserDetail loginUserDetail) {
		LoginUserDetail = loginUserDetail;
	}
}
	
//	@ManyToOne
//	@JoinColumn(name="userid")
//	private Hotel hotel;
	
	//@OneToMany(cascade = CascadeType.ALL)
	 //Set<UserSolution> UserSolution;

	//public Set<UserSolution> getUserSolution() {
		//return UserSolution;
	//}

	//public void setUserSolution(Set<UserSolution> userSolution) {
		//UserSolution = userSolution;
	//}
	//public long getQuestionID() {
	//	return QuestionID;
	//}

	