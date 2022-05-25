package com.player.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.data.model.User;
import com.player.data.service.RegistrationService;

@RestController

public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		
		String tempusername = user.getUsername();
		
		if(tempusername != null && !"".equals(tempusername)) {
		
			User userobj = service.fetchUserbyUsername(tempusername);
			
			if(userobj != null) {
				throw new Exception("User With "+tempusername+" is already exists");
			}
		}
		
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempUsername = user.getUsername();
		String tempPassword = user.getPassword();
		
		User userObj = null;
		
		if(tempUsername != null && tempPassword != null) {
			userObj = service.fetchUserbyUsernameAndPassword(tempUsername, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials");
		}
		return userObj;
	}
	
}
