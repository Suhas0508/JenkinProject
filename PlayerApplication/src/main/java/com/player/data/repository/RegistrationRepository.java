package com.player.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.player.data.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username,String password);
	
}
