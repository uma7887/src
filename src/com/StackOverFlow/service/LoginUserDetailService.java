package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.model.LoginUserDetail;

public interface LoginUserDetailService {
	public LoginUserDetail findUser(String UserEmailAddress, String UserPassword);
	public String adduser(LoginUserDetail user);

}
