package com.project.teamplayer.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.project.teamplayer.entity.Team;

@Component
public interface TeamService {

	public Team saveTeam(Team team);
	
//	public Team findByTeamname(String teamname);

	public Team fetchTeambyTeamname(String tempTeamname);

	public List<Team> getTeam();



	


	
}
