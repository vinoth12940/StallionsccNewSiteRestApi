package com.stallionscc.springboot.dto;

import com.stallionscc.springboot.entity.Matches;

public class MatchDetail {

	private Matches match;

	public Matches getMatch() {
		return match;
	}

	public void setMatch(Matches match) {
		
		this.match = match;
		
	}

	public MatchDetail(Matches match) {
		super();
		this.match = match;
	}

	public MatchDetail() {
		super();
		
	}

	@Override
	public String toString() {
		return "MatchDetail [match=" + match + ", getMatch()=" + getMatch() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

		
}
