package com.StackOverFlow.dao;

import java.util.List;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserSolution;

public interface UserSolutionDao {
	
	public List<UserSolution> getUserSolution();
	public String addUserSolution(UserSolution addusersolution);
	public String deleteUserSolution(UserSolution deletesolution);
	public String editusersolution(UserSolution editusersolution);
	public List<UserSolution> getUserSolutionbyid(UserSolution getbyUserSolutionID);
	public List<UserSolution> getSolutionByQuestionID(long questionID);
	public String updateSolutionLike(long solutionLike, long solutionID);

}
