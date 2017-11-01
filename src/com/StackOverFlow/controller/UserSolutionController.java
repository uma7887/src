package com.StackOverFlow.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.model.UserSolution;
import com.StackOverFlow.service.UserQuestionService;
import com.StackOverFlow.service.UserQuestionServiceImpl;
import com.StackOverFlow.service.UserSolutionService;
import com.StackOverFlow.service.UserSolutionServiceImpl;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Path("/solution")
public class UserSolutionController {
	
		UserSolutionService usersolutionservice = new UserSolutionServiceImpl();

		@Path("/getAllSolution")
		@GET
		@Produces("application/json")
		public List<UserSolution> getAllLoginDetail()
		{
			return usersolutionservice.getUserSolution();
		}
		
		@Path("/addsolution")
		@GET
		@Produces("application/json")
		public String addUser(
				@QueryParam("Solution") String Solution,
				@QueryParam("SolutionLike") long SolutionLike,
				@QueryParam("SolutionTime") long SolutionTime
				
				)
		{
			
				UserSolution addusersolution = new UserSolution();
				LoginUserDetail loginUserDetail = new LoginUserDetail();
				UserQuestion userquestion = new UserQuestion();
				loginUserDetail.setUserID(1);
				loginUserDetail.setIsActive(1);
				loginUserDetail.setUserEmailAddress("hema.5@gmail.com");
				loginUserDetail.setUserPassword("hemahema");
				loginUserDetail.setUserName("hema");
				
				userquestion.setQuestionID(2);
				userquestion.setQuestion("select query example");
				userquestion.setQuestionLike(10);
				userquestion.setQuestionTechnology("sql");
				userquestion.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				userquestion.setLoginUserDetail(loginUserDetail);
				
				addusersolution.setSolution("solution");
				addusersolution.setSolutionLike(10);
				addusersolution.setSolutionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				addusersolution.setSolutionQuestionIDFK(userquestion);
				addusersolution.setSolutionUserIDFK(loginUserDetail);
				return usersolutionservice.addUserSolution(addusersolution);
			
		}
		
		@Path("/deletesolution")
		@GET
		//@POST
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces("application/json")
		public String deletesolution(
				@QueryParam("SolutionID") long SolutionId)
		{
			
			UserSolution deleteusersolution = new UserSolution();
			deleteusersolution.setSolutionID(21);
			return usersolutionservice.deleteUserSolution(deleteusersolution);
			
		}
		
		@Path("/editsolution")
		@GET
		//@POST
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces("application/json")
		public String editsolution(
				@QueryParam("SolutionID") long SolutionID, 
				@QueryParam("editedSolutionLike") long editedSolutionLike,
				@QueryParam("editedSolutionTime") long editedSolutionTime
				)
		{
			
			UserSolution editusersolution = new UserSolution();
			
			LoginUserDetail loginUserDetail = new LoginUserDetail();
			UserQuestion userquestion = new UserQuestion();
			loginUserDetail.setUserID(1);
			loginUserDetail.setIsActive(1);
			loginUserDetail.setUserEmailAddress("hema.5@gmail.com");
			loginUserDetail.setUserPassword("hemahema");
			loginUserDetail.setUserName("hema");
			
			userquestion.setQuestionID(2);
			userquestion.setQuestion("ftwderklhfyiehprwgl");
			userquestion.setQuestionLike(12);
			userquestion.setQuestionTechnology("jwfgtiuwe");
			userquestion.setLoginUserDetail(loginUserDetail);
			
			
			userquestion.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
			editusersolution.setSolutionID(12);
			editusersolution.setSolution("solution");
			editusersolution.setSolutionLike(1000);
			editusersolution.setSolutionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
			editusersolution.setSolutionUserIDFK(loginUserDetail);
			editusersolution.setSolutionQuestionIDFK(userquestion);
			return usersolutionservice.editserSolution(editusersolution);
			
		}
		
		@Path("/getAllSolutionByID")
		@GET
		@Produces("application/json")
		public List<UserSolution> getUserSolutionByID( @QueryParam("SolutionUserID") long SolutionUserID)
		{
			UserSolution getbyUserSolutionID = new UserSolution();
			LoginUserDetail loginUserDetail = new LoginUserDetail();
			
			loginUserDetail.setUserID(1);
			loginUserDetail.setIsActive(1);
			loginUserDetail.setUserEmailAddress("hema.5@gmail.com");
			loginUserDetail.setUserPassword("hemahema");
			loginUserDetail.setUserName("hema");
			
		        
			getbyUserSolutionID.setSolutionUserIDFK(loginUserDetail);
			return usersolutionservice.getUserSolutionbyid(getbyUserSolutionID);
		}
		
		@Path("/getSolutionByQuestionID")
		@GET
		@Produces("application/json")
		public List<UserSolution> getSolutionByQuestionID( @QueryParam("questionID") long questionID)
		{
			return usersolutionservice.getSolutionByQuestionID(questionID);
		}
		
		@Path("/updatesolutionlike")
		@GET
		@Produces("application/json")
		
		public String updateQuestionLike(
				@QueryParam("solutionLike") long solutionLike,
				@QueryParam("solutionID") long solutionID) {
			return usersolutionservice.updateSolutionLike(solutionLike,solutionID);
		}
		
		
}