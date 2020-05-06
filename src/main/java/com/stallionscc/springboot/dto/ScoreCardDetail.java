package com.stallionscc.springboot.dto;

import java.util.List;


import com.stallionscc.springboot.entity.StallionsScorecard;

public class ScoreCardDetail {
	
	
	private List<StallionsScorecard> stallionsscorecard;

	
	public List<StallionsScorecard> getStallionsscorecard() {
		return stallionsscorecard;
	}

	public void setStallionsscorecard(List<StallionsScorecard> stallionsscorecard) {
		this.stallionsscorecard = stallionsscorecard;
	}

	public ScoreCardDetail(List<StallionsScorecard> stallionsscorecard) {
		super();
		this.stallionsscorecard = stallionsscorecard;
	}

	public ScoreCardDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
