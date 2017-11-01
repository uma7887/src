package com.StackOverFlow.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONObject;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.service.LoginUserDetailService;
import com.StackOverFlow.service.LoginUserDetailServiceImpl;

import java.io.UnsupportedEncodingException;
import java.util.Base64; 

public class LoginUserDetailController {
	
	

	@Path("/user")
	public class UserController {
		
		LoginUserDetailService userService = new LoginUserDetailServiceImpl();

		@Path("/auth")
		@POST
		@Produces("application/json")
		public String authUserByEmail(LoginUserDetail user1) throws Exception
		{
			String email = user1.getUserEmailAddress();
			String pwd = user1.getUserPassword();
			/*byte[] asBytes = Base64.getDecoder().decode(user1.getPwd());
			String decodedpassword = new String(asBytes);*/
			
			LoginUserDetail user = userService.findUser(email,pwd);
			String response = new String();

			
			//Decrypting the Password that is stored in Db as a encrypted format using decoder Base 64
			
			if(email.equalsIgnoreCase(user.getUserEmailAddress()) && pwd.equalsIgnoreCase(user.getUserPassword())) {
			
		/*	response.setUsername(username);
			
			jsonObject.put("name", user.getUsername());
			jsonObject.put("email", user.getEmail());
	*/
			
			response = user.getUserName();
		
		
			}
			else{
				
						
				response="Failure";
				
			}
			
			return response;
		}
		
		@POST
		@Path("/add")
		@Produces("application/json")
		public String addUsers(LoginUserDetail user) throws UnsupportedEncodingException {
			
			/*String encryptedpassword = Base64.getEncoder().encodeToString(user.getPwd().getBytes("utf-8"));
			user.setPwd(encryptedpassword);*/
			return userService.adduser(user);
		}
		
		
	}


}
