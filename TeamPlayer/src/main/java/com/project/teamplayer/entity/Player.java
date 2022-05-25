package com.project.teamplayer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="player")
public class Player {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	
	@Column(name = "player_name")
	private String name;
	@Column(name = "player_budget")
	private String playerbudget;
	

	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	@JsonIgnoreProperties("playerList")
	private Team team;



	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerbudget() {
		return playerbudget;
	}

	public void setPlayerbudget(String playerbudget) {
		this.playerbudget = playerbudget;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
