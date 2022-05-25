package com.project.teamplayer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.teamplayer.entity.Player;
import com.project.teamplayer.repository.PlayerRepository;
import com.project.teamplayer.service.PlayerSevice;

@Service
public class PlayerSeviceImpl {

	@Autowired
	public PlayerRepository playerRepository;
	
	
	//Pass List
	public Player savPlayer(Player player) {
		
		return playerRepository.save(player);
	}
	
	public List<Player> getPlayer(){
		return playerRepository.findAll();
	}

	public Player getPlayerById(int playerId) {
		return playerRepository.findByPlayerId(playerId);
		
	}


}
