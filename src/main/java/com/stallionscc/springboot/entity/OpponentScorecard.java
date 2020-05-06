package com.stallionscc.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OpponentScorecard")
public class OpponentScorecard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "score_card_id")
	private int score_card_id;

	@Column(name = "tournament_id")
	private int tournament_id;

	@Column(name = "match_id")
	private int match_id;

	@Column(name = "player_name")
	private String player_name;

	@Column(name = "player_role")
	private String player_role;

	@Column(name = "batting_runs_scored")
	private int batting_runs_scored;

	@Column(name = "batting_balls_faced")
	private int batting_balls_faced;

	@Column(name = "batting_fours")
	private int batting_fours;

	@Column(name = "batting_six")
	private int batting_six;

	@Column(name = "batting_how_out")
	private String batting_how_out;

	@Column(name = "batting_fielder_name")
	private String batting_fielder_name;

	@Column(name = "batting_Wicket_by_Bowler")
	private String batting_Wicket_by_Bowler;

	@Column(name = "batting_order_of_Wicket")
	private int batting_order_of_Wicket;

	@Column(name = "batting_fall_of_Wicket")
	private int batting_fall_of_Wicket;

	@Column(name = "batting_wicket_on_over")
	private int batting_wicket_on_over;

	@Column(name = "bowling_spell_order")
	private int bowling_spell_order;

	@Column(name = "bowling_over")
	private int bowling_over;

	@Column(name = "bowling_maiden")
	private int bowling_maiden;

	@Column(name = "bowling_wicket")
	private int bowling_wicket;
	
	@Column(name = "bowling_runs_conceded")
	private int bowling_runs_conceded;

	@Column(name = "bowling_wides")
	private int bowling_wides;

	@Column(name = "bowling_no_balls")
	private int bowling_no_balls;

	@Column(name = "fielding_catches_taken")
	private int fielding_catches_taken;

	@Column(name = "fielding_catches_dropped")
	private int fielding_catches_dropped;

	@Column(name = "fielding_total_catches")
	private int fielding_total_catches;

	@Column(name = "fielding_WK_catches")
	private int fielding_WK_catches;

	@Column(name = "fielding_WK_stumped")
	private int fielding_WK_stumped;
	
	@Column(name = "match_keynote")	
	private String match_keynote;

	public OpponentScorecard() {
		super();
	}

	public OpponentScorecard(int score_card_id, int tournament_id, int match_id, String player_name, String player_role,
			int batting_runs_scored, int batting_balls_faced, int batting_fours, int batting_six,
			String batting_how_out, String batting_fielder_name, String batting_Wicket_by_Bowler,
			int batting_order_of_Wicket, int batting_fall_of_Wicket, int batting_wicket_on_over,
			int bowling_spell_order, int bowling_over, int bowling_maiden, int bowling_wicket,
			int bowling_runs_conceded, int bowling_wides, int bowling_no_balls, int fielding_catches_taken,
			int fielding_catches_dropped, int fielding_total_catches, int fielding_WK_catches, int fielding_WK_stumped,
			String match_keynote) {
		super();
		this.score_card_id = score_card_id;
		this.tournament_id = tournament_id;
		this.match_id = match_id;
		this.player_name = player_name;
		this.player_role = player_role;
		this.batting_runs_scored = batting_runs_scored;
		this.batting_balls_faced = batting_balls_faced;
		this.batting_fours = batting_fours;
		this.batting_six = batting_six;
		this.batting_how_out = batting_how_out;
		this.batting_fielder_name = batting_fielder_name;
		this.batting_Wicket_by_Bowler = batting_Wicket_by_Bowler;
		this.batting_order_of_Wicket = batting_order_of_Wicket;
		this.batting_fall_of_Wicket = batting_fall_of_Wicket;
		this.batting_wicket_on_over = batting_wicket_on_over;
		this.bowling_spell_order = bowling_spell_order;
		this.bowling_over = bowling_over;
		this.bowling_maiden = bowling_maiden;
		this.bowling_wicket = bowling_wicket;
		this.bowling_runs_conceded = bowling_runs_conceded;
		this.bowling_wides = bowling_wides;
		this.bowling_no_balls = bowling_no_balls;
		this.fielding_catches_taken = fielding_catches_taken;
		this.fielding_catches_dropped = fielding_catches_dropped;
		this.fielding_total_catches = fielding_total_catches;
		this.fielding_WK_catches = fielding_WK_catches;
		this.fielding_WK_stumped = fielding_WK_stumped;
		this.match_keynote = match_keynote;
	}

	public int getScore_card_id() {
		return score_card_id;
	}

	public void setScore_card_id(int score_card_id) {
		this.score_card_id = score_card_id;
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

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_role() {
		return player_role;
	}

	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}

	public int getBatting_runs_scored() {
		return batting_runs_scored;
	}

	public void setBatting_runs_scored(int batting_runs_scored) {
		this.batting_runs_scored = batting_runs_scored;
	}

	public int getBatting_balls_faced() {
		return batting_balls_faced;
	}

	public void setBatting_balls_faced(int batting_balls_faced) {
		this.batting_balls_faced = batting_balls_faced;
	}

	public int getBatting_fours() {
		return batting_fours;
	}

	public void setBatting_fours(int batting_fours) {
		this.batting_fours = batting_fours;
	}

	public int getBatting_six() {
		return batting_six;
	}

	public void setBatting_six(int batting_six) {
		this.batting_six = batting_six;
	}

	public String getBatting_how_out() {
		return batting_how_out;
	}

	public void setBatting_how_out(String batting_how_out) {
		this.batting_how_out = batting_how_out;
	}

	public String getBatting_fielder_name() {
		return batting_fielder_name;
	}

	public void setBatting_fielder_name(String batting_fielder_name) {
		this.batting_fielder_name = batting_fielder_name;
	}

	public String getBatting_Wicket_by_Bowler() {
		return batting_Wicket_by_Bowler;
	}

	public void setBatting_Wicket_by_Bowler(String batting_Wicket_by_Bowler) {
		this.batting_Wicket_by_Bowler = batting_Wicket_by_Bowler;
	}

	public int getBatting_order_of_Wicket() {
		return batting_order_of_Wicket;
	}

	public void setBatting_order_of_Wicket(int batting_order_of_Wicket) {
		this.batting_order_of_Wicket = batting_order_of_Wicket;
	}

	public int getBatting_fall_of_Wicket() {
		return batting_fall_of_Wicket;
	}

	public void setBatting_fall_of_Wicket(int batting_fall_of_Wicket) {
		this.batting_fall_of_Wicket = batting_fall_of_Wicket;
	}

	public int getBatting_wicket_on_over() {
		return batting_wicket_on_over;
	}

	public void setBatting_wicket_on_over(int batting_wicket_on_over) {
		this.batting_wicket_on_over = batting_wicket_on_over;
	}

	public int getBowling_spell_order() {
		return bowling_spell_order;
	}

	public void setBowling_spell_order(int bowling_spell_order) {
		this.bowling_spell_order = bowling_spell_order;
	}

	public int getBowling_over() {
		return bowling_over;
	}

	public void setBowling_over(int bowling_over) {
		this.bowling_over = bowling_over;
	}

	public int getBowling_maiden() {
		return bowling_maiden;
	}

	public void setBowling_maiden(int bowling_maiden) {
		this.bowling_maiden = bowling_maiden;
	}

	public int getBowling_wicket() {
		return bowling_wicket;
	}

	public void setBowling_wicket(int bowling_wicket) {
		this.bowling_wicket = bowling_wicket;
	}

	public int getBowling_runs_conceded() {
		return bowling_runs_conceded;
	}

	public void setBowling_runs_conceded(int bowling_runs_conceded) {
		this.bowling_runs_conceded = bowling_runs_conceded;
	}

	public int getBowling_wides() {
		return bowling_wides;
	}

	public void setBowling_wides(int bowling_wides) {
		this.bowling_wides = bowling_wides;
	}

	public int getBowling_no_balls() {
		return bowling_no_balls;
	}

	public void setBowling_no_balls(int bowling_no_balls) {
		this.bowling_no_balls = bowling_no_balls;
	}

	public int getFielding_catches_taken() {
		return fielding_catches_taken;
	}

	public void setFielding_catches_taken(int fielding_catches_taken) {
		this.fielding_catches_taken = fielding_catches_taken;
	}

	public int getFielding_catches_dropped() {
		return fielding_catches_dropped;
	}

	public void setFielding_catches_dropped(int fielding_catches_dropped) {
		this.fielding_catches_dropped = fielding_catches_dropped;
	}

	public int getFielding_total_catches() {
		return fielding_total_catches;
	}

	public void setFielding_total_catches(int fielding_total_catches) {
		this.fielding_total_catches = fielding_total_catches;
	}

	public int getFielding_WK_catches() {
		return fielding_WK_catches;
	}

	public void setFielding_WK_catches(int fielding_WK_catches) {
		this.fielding_WK_catches = fielding_WK_catches;
	}

	public int getFielding_WK_stumped() {
		return fielding_WK_stumped;
	}

	public void setFielding_WK_stumped(int fielding_WK_stumped) {
		this.fielding_WK_stumped = fielding_WK_stumped;
	}

	public String getMatch_keynote() {
		return match_keynote;
	}

	public void setMatch_keynote(String match_keynote) {
		this.match_keynote = match_keynote;
	}

	@Override
	public String toString() {
		return "OpponentScorecard [score_card_id=" + score_card_id + ", tournament_id=" + tournament_id + ", match_id="
				+ match_id + ", player_name=" + player_name + ", player_role=" + player_role + ", batting_runs_scored="
				+ batting_runs_scored + ", batting_balls_faced=" + batting_balls_faced + ", batting_fours="
				+ batting_fours + ", batting_six=" + batting_six + ", batting_how_out=" + batting_how_out
				+ ", batting_fielder_name=" + batting_fielder_name + ", batting_Wicket_by_Bowler="
				+ batting_Wicket_by_Bowler + ", batting_order_of_Wicket=" + batting_order_of_Wicket
				+ ", batting_fall_of_Wicket=" + batting_fall_of_Wicket + ", batting_wicket_on_over="
				+ batting_wicket_on_over + ", bowling_spell_order=" + bowling_spell_order + ", bowling_over="
				+ bowling_over + ", bowling_maiden=" + bowling_maiden + ", bowling_wicket=" + bowling_wicket
				+ ", bowling_runs_conceded=" + bowling_runs_conceded + ", bowling_wides=" + bowling_wides
				+ ", bowling_no_balls=" + bowling_no_balls + ", fielding_catches_taken=" + fielding_catches_taken
				+ ", fielding_catches_dropped=" + fielding_catches_dropped + ", fielding_total_catches="
				+ fielding_total_catches + ", fielding_WK_catches=" + fielding_WK_catches + ", fielding_WK_stumped="
				+ fielding_WK_stumped + ", match_keynote=" + match_keynote + "]";
	}
	
}
