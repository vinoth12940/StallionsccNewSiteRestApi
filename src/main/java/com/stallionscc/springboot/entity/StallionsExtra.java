package com.stallionscc.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StallionsExtra")
public class StallionsExtra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stall_extra_id")
	private int id;

	@Column(name = "tournament_id")
	private int tournament_id;

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

	@Column(name = "stallions_total")
	private int stallions_total;

	@Column(name = "key_note")
	private String key_note;

	public StallionsExtra() {
		super();
	}

	public StallionsExtra(int id, int tournament_id, int playersSk, int match_id, int extras_byes, int extras_leg_byes,
			int extras_total_wides, int extras_no_balls, int stallions_total, String key_note) {
		super();
		this.id = id;
		this.tournament_id = tournament_id;
		this.key_note = key_note;
		this.match_id = match_id;
		this.extras_byes = extras_byes;
		this.extras_leg_byes = extras_leg_byes;
		this.extras_total_wides = extras_total_wides;
		this.extras_no_balls = extras_no_balls;
		this.stallions_total = stallions_total;
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

	public int getStallions_total() {
		return stallions_total;
	}

	public void setStallions_total(int stallions_total) {
		this.stallions_total = stallions_total;
	}

	public String getKey_note() {
		return key_note;
	}

	public void setKey_note(String key_note) {
		this.key_note = key_note;
	}

	@Override
	public String toString() {
		return "StallionsExtra [id=" + id + ", tournament_id=" + tournament_id + ", match_id=" + match_id
				+ ", extras_byes=" + extras_byes + ", extras_leg_byes=" + extras_leg_byes + ", extras_total_wides="
				+ extras_total_wides + ", extras_no_balls=" + extras_no_balls + ", stallions_total=" + stallions_total
				+ ", key_note=" + key_note + "]";
	}

}
