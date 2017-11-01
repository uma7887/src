

	package com.StackOverFlow.model;


	import java.util.Calendar;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	@Entity
	@Table(name = "UserSolution")
	public class UserSolution {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column (name = "SolutionID")
			private long SolutionID;


			@Column (name = "Solution")
			private String Solution;
			
			@Column (name = "SolutionLike")
			private long SolutionLike;
			
			@Temporal(TemporalType.TIMESTAMP)
			@Column (name = "SolutionTime")
			private Calendar SolutionTime;
			
			@ManyToOne
			@JoinColumn(name = "SolutionQuestionIDFK")
			private UserQuestion SolutionQuestionIDFK;
			 

			@ManyToOne
			@JoinColumn(name = "SolutioUserIDFK")
			private LoginUserDetail SolutionUserIDFK;


			public long getSolutionID() {
				return SolutionID;
			}


			public void setSolutionID(long solutionID) {
				SolutionID = solutionID;
			}


			public String getSolution() {
				return Solution;
			}


			public void setSolution(String solution) {
				Solution = solution;
			}


			public long getSolutionLike() {
				return SolutionLike;
			}


			public void setSolutionLike(long solutionLike) {
				SolutionLike = solutionLike;
			}


			public Calendar getSolutionTime() {
				return SolutionTime;
			}


			public void setSolutionTime(Calendar solutionTime) {
				SolutionTime = solutionTime;
			}


			public UserQuestion getSolutionQuestionIDFK() {
				return SolutionQuestionIDFK;
			}


			public void setSolutionQuestionIDFK(UserQuestion solutionQuestionIDFK) {
				SolutionQuestionIDFK = solutionQuestionIDFK;
			}


			public LoginUserDetail getSolutionUserIDFK() {
				return SolutionUserIDFK;
			}


			public void setSolutionUserIDFK(LoginUserDetail solutionUserIDFK) {
				SolutionUserIDFK = solutionUserIDFK;
			}
			
			
			 
	}

