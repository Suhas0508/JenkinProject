package com.project.teamplayer.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamId;
	
	@Column(name="team_name")
	private String teamname;
	@Column(name="team_budget")
	private int teambudget;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "team", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("team")
	private List<Player> playerList = new ArrayList<>();

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getTeambudget() {
		return teambudget;
	}

	public void setTeambudget(int teambudget) {
		this.teambudget = teambudget;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
}
