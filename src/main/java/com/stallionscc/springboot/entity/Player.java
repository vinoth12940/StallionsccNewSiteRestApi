package com.stallionscc.springboot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="playersSk")
	private long playersSk;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="date_of_birth")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_of_birth;
	
	@Column(name="born_place")
	private String born_place;
	
	@Column(name="nick_name")
	private String nick_name;
	
	@Column(name="batting_style")
	private String batting_style;
	
	@Column(name="bowling_style")
	private String bowling_style;
	
	@Column(name="player_role")
	private String player_role;
	
	@Column(name="personal_contact_email_id")
	private String personal_contact_email_id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact_number")
	private String contact_number;
	
	@Column(name="is_player_active", columnDefinition = "BOOLEAN")
	private Boolean is_player_active;
	
	@Column(name="image_path")
	private String image_path;

	public Player() {
		super();
	}

	public Player(long playersSk, String firstName, String lastName, Date date_of_birth, String born_place,
			String nick_name, String batting_style, String bowling_style, String player_role,
			String personal_contact_email_id, String address, String contact_number, Boolean is_player_active,
			String image_path) {
		super();
		this.playersSk = playersSk;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date_of_birth = date_of_birth;
		this.born_place = born_place;
		this.nick_name = nick_name;
		this.batting_style = batting_style;
		this.bowling_style = bowling_style;
		this.player_role = player_role;
		this.personal_contact_email_id = personal_contact_email_id;
		this.address = address;
		this.contact_number = contact_number;
		this.is_player_active = is_player_active;
		this.image_path = image_path;
	}

	public long getPlayersSk() {
		return playersSk;
	}

	public void setPlayersSk(long playersSk) {
		this.playersSk = playersSk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getBorn_place() {
		return born_place;
	}

	public void setBorn_place(String born_place) {
		this.born_place = born_place;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getBatting_style() {
		return batting_style;
	}

	public void setBatting_style(String batting_style) {
		this.batting_style = batting_style;
	}

	public String getBowling_style() {
		return bowling_style;
	}

	public void setBowling_style(String bowling_style) {
		this.bowling_style = bowling_style;
	}

	public String getPlayer_role() {
		return player_role;
	}

	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}

	public String getPersonal_contact_email_id() {
		return personal_contact_email_id;
	}

	public void setPersonal_contact_email_id(String personal_contact_email_id) {
		this.personal_contact_email_id = personal_contact_email_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public Boolean getIs_player_active() {
		return is_player_active;
	}

	public void setIs_player_active(Boolean is_player_active) {
		this.is_player_active = is_player_active;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	@Override
	public String toString() {
		return "Player [playersSk=" + playersSk + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", date_of_birth=" + date_of_birth + ", born_place=" + born_place + ", nick_name=" + nick_name
				+ ", batting_style=" + batting_style + ", bowling_style=" + bowling_style + ", player_role="
				+ player_role + ", personal_contact_email_id=" + personal_contact_email_id + ", address=" + address
				+ ", contact_number=" + contact_number + ", is_player_active=" + is_player_active + ", image_path="
				+ image_path + "]";
	}
	
}
