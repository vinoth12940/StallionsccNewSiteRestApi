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
	private long tournament_id;

	@Column(name = "match_id")
	private long match_id;

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
	
	@Column(name= "key_note")
	private String key_note;

	public OpponentExtra(int id, long tournament_id, long match_id, int extras_byes, int extras_leg_byes,
			int extras_total_wides, int extras_no_balls, int opponent_total, String key_note) {
		super();
		this.id = id;
		this.tournament_id = tournament_id;
	
		this.match_id = match_id;
		this.extras_byes = extras_byes;
		this.extras_leg_byes = extras_leg_byes;
		this.extras_total_wides = extras_total_wides;
		this.extras_no_balls = extras_no_balls;
		this.opponent_total = opponent_total;
		this.key_note =key_note;
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

	public long getTournament_id() {
		return tournament_id;
	}

	public void setTournament_id(long tournament_id) {
		this.tournament_id = tournament_id;
	}	

	public long getMatch_id() {
		return match_id;
	}

	public void setMatch_id(long match_id) {
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

	public String getKey_note() {
		return key_note;
	}

	public void setKey_note(String key_note) {
		this.key_note = key_note;
	}

	@Override
	public String toString() {
		return "OpponentExtra [id=" + id + ", tournament_id=" + tournament_id + ", match_id=" + match_id
				+ ", extras_byes=" + extras_byes + ", extras_leg_byes=" + extras_leg_byes + ", extras_total_wides="
				+ extras_total_wides + ", extras_no_balls=" + extras_no_balls + ", opponent_total=" + opponent_total
				+ ", key_note=" + key_note + "]";
	}

	

	
}
