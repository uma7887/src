package com.StackOverFlow.dao;

import java.util.List;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserSolution;
import com.StackOverFlow.util.HibernateUtil;

public class UserSolutionDaoImpl implements UserSolutionDao {
	HibernateUtil hibernateUtil = new HibernateUtil();

	@Override
	public List<UserSolution> getUserSolution() {
        hibernateUtil.openCurrentSession();
		
		List<UserSolution> UserSolution_records =(List<UserSolution>)hibernateUtil.getCurrentSession().createQuery("from UserSolution").list();
		
		hibernateUtil.closeCurrentSession();
		
		return UserSolution_records;
	}

	@Override
	public String addUserSolution(UserSolution addusersolution) {
		hibernateUtil.openCurrentSession();
		
		long id = (Long)hibernateUtil.getCurrentSession().save(addusersolution);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "succes"+id;
	}

	@Override
	public String deleteUserSolution(UserSolution deletesolution) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().delete(deletesolution);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "delete succes";
	}

	@Override
	public String editusersolution(UserSolution editusersolution) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().update(editusersolution);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "update succes";
	}

	@Override
	public List<UserSolution>  getUserSolutionbyid(UserSolution getbyUserSolutionID) {
		 hibernateUtil.openCurrentSession();
			
			List<UserSolution> UserSolution_recordsbyid =(List<UserSolution>)hibernateUtil.getCurrentSession().createQuery("from UserSolution where SolutioUserIDFK = '"+getbyUserSolutionID+"'").list();
			
			hibernateUtil.closeCurrentSession();
			
			return UserSolution_recordsbyid;
	}

	@Override
	public List<UserSolution> getSolutionByQuestionID(long questionID) {
			hibernateUtil.openCurrentSession();
			
			List<UserSolution> UserSolution_recordsbyQuestionid =(List<UserSolution>)hibernateUtil.getCurrentSession().createQuery("from UserSolution where SolutionQuestionIDFK = '"+questionID+"'").list();
			
			hibernateUtil.closeCurrentSession();
			
			return UserSolution_recordsbyQuestionid;
	}

	@Override
	public String updateSolutionLike(long solutionLike, long solutionID) {
		hibernateUtil.openCurrentSession();
		
		hibernateUtil.getCurrentSession().createQuery("update UserSolution set SolutionLike = '"+solutionLike +"' where SolutionID ='"+solutionID+"' ");
		
		hibernateUtil.closeCurrentSession();
		
		return "solution like added";
	}

	

	


}
