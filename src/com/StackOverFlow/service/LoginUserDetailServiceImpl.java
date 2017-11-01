package com.StackOverFlow.service;


import com.StackOverFlow.dao.UserDao;
import com.StackOverFlow.dao.UserDaoImpl;
import com.StackOverFlow.model.LoginUserDetail;

public class LoginUserDetailServiceImpl implements LoginUserDetailService {
 UserDao userdao = new UserDaoImpl();
	@Override
	public LoginUserDetail findUser(String UserEmailAddress, String UserPassword) {
		
		return userdao.findUser(UserEmailAddress,UserPassword);
	}

	@Override
	public String adduser(LoginUserDetail user) {
		return userdao.addUser(user);
	}

	

}
