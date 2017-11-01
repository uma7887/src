package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserSolution;

public interface UserSolutionService {
	
	public List<UserSolution> getUserSolution();
	public String addUserSolution(UserSolution addusersolution);
	public String editserSolution(UserSolution editusersolution);
	public String deleteUserSolution(UserSolution deleteusersolution);
	public List<UserSolution> getUserSolutionbyid(UserSolution getbyUserSolutionID);
	public List<UserSolution> getSolutionByQuestionID(long questionID);
	public String updateSolutionLike(long solutionLike,long solutionID);

}
