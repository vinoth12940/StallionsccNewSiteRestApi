package com.stallionscc.springboot.entity;

import java.util.List;

public class ScoreCard {
	private List<StallionsScorecard> stallionsscorecard ;
	
	//private List<OpponentScorecard> opponentscorecard;
	
	//private StallionsScorecard stallionsscorecard;

	
	  public List<StallionsScorecard> getStallionsscorecard() { return
	  stallionsscorecard; }
	  
	  public void setStallionsscorecard(List<StallionsScorecard>
	  stallionsscorecard) { this.stallionsscorecard = stallionsscorecard; }

	public ScoreCard(List<StallionsScorecard> stallionsscorecard) {
		super();
		this.stallionsscorecard = stallionsscorecard;
	}
	 

	/*
	 * public StallionsScorecard getStallionsscorecard() { return
	 * stallionsscorecard; }
	 * 
	 * public void setStallionsscorecard(StallionsScorecard stallionsscorecard) {
	 * this.stallionsscorecard = stallionsscorecard; }
	 */

	/*
	 * public List<OpponentScorecard> getOpponentscorecard() { return
	 * opponentscorecard; }
	 * 
	 * public void setOpponentscorecard(List<OpponentScorecard> opponentscorecard) {
	 * this.opponentscorecard = opponentscorecard; }
	 */

	



}
