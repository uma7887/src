package com.StackOverFlow.dao;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	
	HibernateUtil hibernateUtil = new HibernateUtil();
	
	@Override
	public LoginUserDetail findUser(String UserEmailAddress, String UserPassword) {
		hibernateUtil.openCurrentSession();
		LoginUserDetail user =(LoginUserDetail)hibernateUtil.getCurrentSession().createQuery("from User where UserEmailAddress ='"+UserEmailAddress+"' and UserPassword='"+UserPassword+"' ").uniqueResult();
		hibernateUtil.closeCurrentSession();
		return user;
	}

	@Override
	public String addUser(LoginUserDetail user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();

		return "Saved";
	}

}
