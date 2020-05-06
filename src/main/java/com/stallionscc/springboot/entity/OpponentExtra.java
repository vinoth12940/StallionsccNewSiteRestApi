package com.stallionscc.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OpponentExtra")
public class OpponentExtra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "stall_extra_id")
	private int id;

	@Column(name = "tournament_id")
	private int tournament_id;

	@Column(name = "playersSk")
	private int playersSk;

	@Column(name = "match_id")
	private int match_id;

	@Column(name = "extras_byes")
	private int extras_byes;

	@Column(name = "extras_leg_byes")
	private int extras_leg_byes;

	@Column(name = "extras_total_wides")
	private int extras_total_wides;

	@Column(name = "extras_no_balls")
	private int extras_no_balls;

	@Column(name = "opponent_total")
	private int opponent_total;

	public OpponentExtra(int id, int tournament_id, int playersSk, int match_id, int extras_byes, int extras_leg_byes,
			int extras_total_wides, int extras_no_balls, int opponent_total) {
		super();
		this.id = id;
		this.tournament_id = tournament_id;
		this.playersSk = playersSk;
		this.match_id = match_id;
		this.extras_byes = extras_byes;
		this.extras_leg_byes = extras_leg_byes;
		this.extras_total_wides = extras_total_wides;
		this.extras_no_balls = extras_no_balls;
		this.opponent_total = opponent_total;
	}

	public OpponentExtra() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTournament_id() {
		return tournament_id;
	}

	public void setTournament_id(int tournament_id) {
		this.tournament_id = tournament_id;
	}

	public int getPlayersSk() {
		return playersSk;
	}

	public void setPlayersSk(int playersSk) {
		this.playersSk = playersSk;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public int getExtras_byes() {
		return extras_byes;
	}

	public void setExtras_byes(int extras_byes) {
		this.extras_byes = extras_byes;
	}

	public int getExtras_leg_byes() {
		return extras_leg_byes;
	}

	public void setExtras_leg_byes(int extras_leg_byes) {
		this.extras_leg_byes = extras_leg_byes;
	}

	public int getExtras_total_wides() {
		return extras_total_wides;
	}

	public void setExtras_total_wides(int extras_total_wides) {
		this.extras_total_wides = extras_total_wides;
	}

	public int getExtras_no_balls() {
		return extras_no_balls;
	}

	public void setExtras_no_balls(int extras_no_balls) {
		this.extras_no_balls = extras_no_balls;
	}

	public int getOpponent_total() {
		return opponent_total;
	}

	public void setOpponent_total(int opponent_total) {
		this.opponent_total = opponent_total;
	}

	@Override
	public String toString() {
		return "OpponentExtra [id=" + id + ", tournament_id=" + tournament_id + ", playersSk=" + playersSk
				+ ", match_id=" + match_id + ", extras_byes=" + extras_byes + ", extras_leg_byes=" + extras_leg_byes
				+ ", extras_total_wides=" + extras_total_wides + ", extras_no_balls=" + extras_no_balls
				+ ", opponent_total=" + opponent_total + "]";
	}
	
	

}
