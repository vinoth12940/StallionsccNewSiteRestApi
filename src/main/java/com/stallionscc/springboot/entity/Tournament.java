package com.stallionscc.springboot.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tournaments")
public class Tournament {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tournament_id")
	private long tournament_id;
	
	@Column(name="tournament_name", nullable = false)
	private String tournament_name;
	
	@Column(name="start_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date start_date;
	
	@Column(name="end_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end_date;
	
	@Column(name="no_of_matches", nullable = false)
	private int no_of_matches;
	
	@Column(name="match_format", nullable = false)
	private String match_format;
	
	@Column(name="organiser_name", nullable = false)
	private String organiser_name;
	
	@Column(name="organiser_contact", nullable = false)
	private String organiser_contact;
	
	@OneToMany(targetEntity = Matches.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tourmatch_fk", referencedColumnName = "tournament_id")
	private List<Matches> matches;

	public Tournament() {
		super();
	}

	public Tournament(long tournament_id, String tournament_name, Date start_date, Date end_date, int no_of_matches,
			String match_format, String organiser_name, String organiser_contact, List<Matches> matches) {
		super();
		this.tournament_id = tournament_id;
		this.tournament_name = tournament_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.no_of_matches = no_of_matches;
		this.match_format = match_format;
		this.organiser_name = organiser_name;
		this.organiser_contact = organiser_contact;
		this.matches = matches;
	}

	public long getTournament_id() {
		return tournament_id;
	}

	public void setTournament_id(long tournament_id) {
		this.tournament_id = tournament_id;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getNo_of_matches() {
		return no_of_matches;
	}

	public void setNo_of_matches(int no_of_matches) {
		this.no_of_matches = no_of_matches;
	}

	public String getMatch_format() {
		return match_format;
	}

	public void setMatch_format(String match_format) {
		this.match_format = match_format;
	}

	public String getOrganiser_name() {
		return organiser_name;
	}

	public void setOrganiser_name(String organiser_name) {
		this.organiser_name = organiser_name;
	}

	public String getOrganiser_contact() {
		return organiser_contact;
	}

	public void setOrganiser_contact(String organiser_contact) {
		this.organiser_contact = organiser_contact;
	}

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "Tournament [tournament_id=" + tournament_id + ", tournament_name=" + tournament_name + ", start_date="
				+ start_date + ", end_date=" + end_date + ", no_of_matches=" + no_of_matches + ", match_format="
				+ match_format + ", organiser_name=" + organiser_name + ", organiser_contact=" + organiser_contact
				+ ", matches=" + matches + "]";
	}
	
	

}
