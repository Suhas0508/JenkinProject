package com.project.teamplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.teamplayer.entity.Player;
import com.project.teamplayer.entity.Team;
import com.project.teamplayer.repository.PlayerRepository;
import com.project.teamplayer.repository.TeamRepository;

@SpringBootTest
class TeamPlayerApplicationTests {

	
	@Autowired
	TeamRepository tRepository;
	
	@Autowired
	PlayerRepository pRepository;
	
	@Test
	public void testCreateTeam() {
		Team t = new Team();
		t.setTeamId(5);
		t.setTeamname("RC");
		t.setTeambudget(112233);
		tRepository.save(t);
		assertNotNull(tRepository.findByTeamname("RC"));
	}

	@Test
	public void testReadTeam() {
		tRepository.findAll();
	}
	
	@Test
	public void testSingleTeam() {
		tRepository.findByTeamname("RC");
	}
	
	@Test
	public void testCreatePlayer() {
		Player p = new Player();
		p.setPlayerId(1);
		p.setName("Dhoni");
		p.setPlayerbudget("445566");
		
		
		pRepository.save(p);
		
	}
	
	@Test
	public void testReadAllPlayers() {
		pRepository.findAll();
	}
	
	@Test
	public void testSinglePlayer() {
		pRepository.findByPlayerId(1);
	}
	
	
}

