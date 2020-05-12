package com.stallionscc.springboot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "MatchSummary")
public class Matches {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "match_id")
	private long match_id;

	@Column(name = "opponent_team_name")
	private String opponent_team_name;

	@Column(name = "match_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date match_date;

	@Column(name = "is_tournament_match")
	private Boolean is_tournament_match;

	@Column(name = "ground_name")
	private String ground_name;

	@Column(name = "match_type")
	private String match_type;

	@Column(name = "match_overs")
	private String match_overs;

	@Column(name = "stallions_match_result")
	private String stallions_match_result;

	@Column(name = "match_result")
	private String match_result;

	@Column(name = "is_toss_stallions")
	private Boolean is_toss_stallions;

	@Column(name = "batting_first")
	private String batting_first;

	@Column(name = "is_mom_stallions")
	private Boolean is_mom_stallions;

	@Column(name = "mom_player_name")
	private String mom_player_name;

	@Column(name = "stallions_total_runs")
	private String stallions_total_runs;

	@Column(name = "stallions_total_wickets")
	private String stallions_total_wickets;

	@Column(name = "stallions_total_overs")
	private String stallions_total_overs;

	@Column(name = "opponent_total_runs")
	private String opponent_total_runs;

	@Column(name = "opponent_total_wickets")
	private String opponent_total_wickets;

	@Column(name = "opponent_total_overs")
	private String opponent_total_overs;

	@Column(name = "tournament_id")
	private long tournament_id;

	public Matches() {
		super();
	}

	public Matches(long match_id, String opponent_team_name, Date match_date, Boolean is_tournament_match,
			String ground_name, String match_type, String match_overs, String stallions_match_result,
			String match_result, Boolean is_toss_stallions, String batting_first, Boolean is_mom_stallions,
			String mom_player_name, String stallions_total_runs, String stallions_total_wickets,
			String stallions_total_overs, String opponent_total_runs, String opponent_total_wickets,
			String opponent_total_overs, long tournament_id) {
		super();
		this.match_id = match_id;
		this.opponent_team_name = opponent_team_name;
		this.match_date = match_date;
		this.is_tournament_match = is_tournament_match;
		this.ground_name = ground_name;
		this.match_type = match_type;
		this.match_overs = match_overs;
		this.stallions_match_result = stallions_match_result;
		this.match_result = match_result;
		this.is_toss_stallions = is_toss_stallions;
		this.batting_first = batting_first;
		this.is_mom_stallions = is_mom_stallions;
		this.mom_player_name = mom_player_name;
		this.stallions_total_runs = stallions_total_runs;
		this.stallions_total_wickets = stallions_total_wickets;
		this.stallions_total_overs = stallions_total_overs;
		this.opponent_total_runs = opponent_total_runs;
		this.opponent_total_wickets = opponent_total_wickets;
		this.opponent_total_overs = opponent_total_overs;
		this.tournament_id = tournament_id;
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

	public String getOpponent_team_name() {
		return opponent_team_name;
	}

	public void setOpponent_team_name(String opponent_team_name) {
		this.opponent_team_name = opponent_team_name;
	}

	public Date getMatch_date() {
		return match_date;
	}

	public void setMatch_date(Date match_date) {
		this.match_date = match_date;
	}

	public Boolean getIs_tournament_match() {
		return is_tournament_match;
	}

	public void setIs_tournament_match(Boolean is_tournament_match) {
		this.is_tournament_match = is_tournament_match;
	}

	public String getGround_name() {
		return ground_name;
	}

	public void setGround_name(String ground_name) {
		this.ground_name = ground_name;
	}

	public String getMatch_type() {
		return match_type;
	}

	public void setMatch_type(String match_type) {
		this.match_type = match_type;
	}

	public String getMatch_overs() {
		return match_overs;
	}

	public void setMatch_overs(String match_overs) {
		this.match_overs = match_overs;
	}

	public String getStallions_match_result() {
		return stallions_match_result;
	}

	public void setStallions_match_result(String stallions_match_result) {
		this.stallions_match_result = stallions_match_result;
	}

	public String getMatch_result() {
		return match_result;
	}

	public void setMatch_result(String match_result) {
		this.match_result = match_result;
	}

	public Boolean getIs_toss_stallions() {
		return is_toss_stallions;
	}

	public void setIs_toss_stallions(Boolean is_toss_stallions) {
		this.is_toss_stallions = is_toss_stallions;
	}

	public String getBatting_first() {
		return batting_first;
	}

	public void setBatting_first(String batting_first) {
		this.batting_first = batting_first;
	}

	public Boolean getIs_mom_stallions() {
		return is_mom_stallions;
	}

	public void setIs_mom_stallions(Boolean is_mom_stallions) {
		this.is_mom_stallions = is_mom_stallions;
	}

	public String getMom_player_name() {
		return mom_player_name;
	}

	public void setMom_player_name(String mom_player_name) {
		this.mom_player_name = mom_player_name;
	}

	public String getStallions_total_runs() {
		return stallions_total_runs;
	}

	public void setStallions_total_runs(String stallions_total_runs) {
		this.stallions_total_runs = stallions_total_runs;
	}

	public String getStallions_total_wickets() {
		return stallions_total_wickets;
	}

	public void setStallions_total_wickets(String stallions_total_wickets) {
		this.stallions_total_wickets = stallions_total_wickets;
	}

	public String getStallions_total_overs() {
		return stallions_total_overs;
	}

	public void setStallions_total_overs(String stallions_total_overs) {
		this.stallions_total_overs = stallions_total_overs;
	}

	public String getOpponent_total_runs() {
		return opponent_total_runs;
	}

	public void setOpponent_total_runs(String opponent_total_runs) {
		this.opponent_total_runs = opponent_total_runs;
	}

	public String getOpponent_total_wickets() {
		return opponent_total_wickets;
	}

	public void setOpponent_total_wickets(String opponent_total_wickets) {
		this.opponent_total_wickets = opponent_total_wickets;
	}

	public String getOpponent_total_overs() {
		return opponent_total_overs;
	}

	public void setOpponent_total_overs(String opponent_total_overs) {
		this.opponent_total_overs = opponent_total_overs;
	}

	@Override
	public String toString() {
		return "Matches [match_id=" + match_id + ", opponent_team_name=" + opponent_team_name + ", match_date="
				+ match_date + ", is_tournament_match=" + is_tournament_match + ", ground_name=" + ground_name
				+ ", match_type=" + match_type + ", match_overs=" + match_overs + ", stallions_match_result="
				+ stallions_match_result + ", match_result=" + match_result + ", is_toss_stallions=" + is_toss_stallions
				+ ", batting_first=" + batting_first + ", is_mom_stallions=" + is_mom_stallions + ", mom_player_name="
				+ mom_player_name + ", stallions_total_runs=" + stallions_total_runs + ", stallions_total_wickets="
				+ stallions_total_wickets + ", stallions_total_overs=" + stallions_total_overs
				+ ", opponent_total_runs=" + opponent_total_runs + ", opponent_total_wickets=" + opponent_total_wickets
				+ ", opponent_total_overs=" + opponent_total_overs + ", tournament_id=" + tournament_id + "]";
	}

	

}
