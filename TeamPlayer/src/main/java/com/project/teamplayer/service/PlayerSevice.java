package com.project.teamplayer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.teamplayer.entity.Player;

@Component
public interface PlayerSevice {

	public Player findByPlayerId(int playerId);
	
	public Player savePlayer(Player player);
		
	public List<Player> getPlayer(Player player);
}
