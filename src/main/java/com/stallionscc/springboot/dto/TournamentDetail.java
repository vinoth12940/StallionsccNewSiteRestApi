package com.stallionscc.springboot.dto;

import com.stallionscc.springboot.entity.Tournament;


public class TournamentDetail {
	
	private Tournament tournament;

	public TournamentDetail() {
		super();
	}

	public TournamentDetail(Tournament tournament) {
		super();
		this.tournament = tournament;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	@Override
	public String toString() {
		return "TournamentDetail [tournament=" + tournament + ", getTournament()=" + getTournament()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
