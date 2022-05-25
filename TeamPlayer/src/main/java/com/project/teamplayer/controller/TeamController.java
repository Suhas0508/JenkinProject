package com.project.teamplayer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.teamplayer.entity.Team;
import com.project.teamplayer.service.TeamService;

@RestController
@RequestMapping(value="/team")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value = "/saveteam", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	public Team saveTeam(@RequestBody Team team) throws Exception  {

		String tempTeamname = team.getTeamname();
		
		if(tempTeamname != null && !"".equals(tempTeamname)) {
			
			Team teamObj = teamService.fetchTeambyTeamname(tempTeamname);
			
			if(teamObj != null) {
				throw new Exception("User With "+tempTeamname+" is already exists");
			}
		}
		
		
		 Team userObj = teamService.saveTeam(team);
		return userObj;
//		Team teamResponse = teamService.saveTeam(team);
//		return teamResponse;
	}
	
	@GetMapping("/allteam")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Team> getTeam(){
		return teamService.getTeam();
	}
	

	@GetMapping("/showTeam/{teamname}")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	public Team getTeamDetails(@PathVariable("teamname") String teamname) {
		
		Team teamResponse = teamService.fetchTeambyTeamname(teamname);
		return teamResponse;
	}
	
}
