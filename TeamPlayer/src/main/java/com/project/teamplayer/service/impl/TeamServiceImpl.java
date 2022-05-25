package com.project.teamplayer.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.teamplayer.entity.Team;
import com.project.teamplayer.repository.TeamRepository;
import com.project.teamplayer.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	

	@Override
	public Team saveTeam(Team team) {
		
		return teamRepository.save(team);
	}

	@Override
	public Team fetchTeambyTeamname(String tempTeamname) {
		return teamRepository.findByTeamname(tempTeamname);
	}

	@Override
	public List<Team> getTeam(){
		return teamRepository.findAll();
	}
	

	
}
