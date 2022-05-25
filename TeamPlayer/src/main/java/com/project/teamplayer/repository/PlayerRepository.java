package com.project.teamplayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.teamplayer.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

	Player findByPlayerId(int playerId);
	
}
