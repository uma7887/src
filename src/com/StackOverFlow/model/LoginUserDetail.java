package com.StackOverFlow.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LoginUserDetail")

public class LoginUserDetail {
	
	@Id
	@GeneratedValue
	@Column(name="UserID")
	private int UserID;
	
	@Column(name="UserName")
	private String UserName;
	
	@Column(name="UserEmailAddress")
	private String UserEmailAddress;
	
	@Column(name="UserPassword")
	private String UserPassword;
	
	@Column(name="isActive")
	private int isActive;

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmailAddress() {
		return UserEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		UserEmailAddress = userEmailAddress;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	

}