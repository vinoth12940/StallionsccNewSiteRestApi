package com.stallionscc.springboot.dto;

import java.util.List;

import com.stallionscc.springboot.entity.OpponentScorecard;
import com.stallionscc.springboot.entity.StallionsScorecard;

public class ScoreCardDetail {
	
	
	private List<StallionsScorecard> stallionsscorecard;
	
	private List<OpponentScorecard> opponentScorecard;

	public ScoreCardDetail(List<StallionsScorecard> stallionsscorecard, List<OpponentScorecard> opponentScorecard) {
		super();
		this.stallionsscorecard = stallionsscorecard;
		this.opponentScorecard = opponentScorecard;
	}

	public ScoreCardDetail() {
		super();
	}

	public List<StallionsScorecard> getStallionsscorecard() {
		return stallionsscorecard;
	}

	public void setStallionsscorecard(List<StallionsScorecard> stallionsscorecard) {
		this.stallionsscorecard = stallionsscorecard;
	}

	public List<OpponentScorecard> getOpponentScorecard() {
		return opponentScorecard;
	}

	public void setOpponentScorecard(List<OpponentScorecard> opponentScorecard) {
		this.opponentScorecard = opponentScorecard;
	}

	@Override
	public String toString() {
		return "ScoreCardDetail [stallionsscorecard=" + stallionsscorecard + ", opponentScorecard=" + opponentScorecard
				+ "]";
	}

}
