package com.StackOverFlow.dao;

import com.StackOverFlow.model.LoginUserDetail;

public interface UserDao {
	public LoginUserDetail findUser(String UserEmailAddress, String UserPassword);
	public String addUser(LoginUserDetail user);
}
