package com.stallionscc.springboot.dto;

import com.stallionscc.springboot.entity.Tournament;


public class TournamentMatchDetail {
	
	private Tournament tournament;

	public TournamentMatchDetail() {
		super();
	}

	public TournamentMatchDetail(Tournament tournament) {
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
		return "TournamentMatchDetail [tournament=" + tournament + ", getTournament()=" + getTournament()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
