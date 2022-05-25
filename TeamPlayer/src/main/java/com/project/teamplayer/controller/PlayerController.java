package com.project.teamplayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.teamplayer.entity.Player;
import com.project.teamplayer.service.impl.PlayerSeviceImpl;
import com.project.teamplayer.repository.PlayerRepository;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private PlayerSeviceImpl playerService;
	
	
	@PostMapping("/saveplayer")
	@CrossOrigin(origins = "http://localhost:4200")
	public Player savePlayer(@RequestBody Player player) {
		
//		Player userObj = playerService.savePlayer(player);
		return playerService.savPlayer(player);
	}
	
	
	@GetMapping("/allplayer")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Player> getPlayer(){
		return playerService.getPlayer();
	}
	
	@ResponseBody
	@RequestMapping(value = "/players")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Player> getTeamDetails(){
		
		List<Player> playerResponse = (List<Player>) playerRepository.findAll();
		return playerResponse;
	}
	
	@GetMapping("/showPlayer/{playerId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Player getPlayerById(@PathVariable("playerId") int playerId) {
		Player playerDetails = playerService.getPlayerById(playerId);
		return playerDetails;
	}
}
