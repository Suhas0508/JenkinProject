package com.player.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.data.model.User;
import com.player.data.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;
	
	
	public User saveUser(User user) {
		return repo.save(user);
	}

	
	public User fetchUserbyUsername(String tempusername) {

		return repo.findByUsername(tempusername);
	}
	

	public User fetchUserbyUsernameAndPassword(String tempusername, String tempPassword) {

		return repo.findByUsernameAndPassword(tempusername,tempPassword );
	}


	
	
	
}
