package com.example.farms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;
	String password;
	String nickname;
	String email;
	Date last_login;
	Date joined_date;
	
	public User() {
		
	}
	
	
	public User(int user_id, String username, String password, String nickname, String email, Date last_login,
			Date joined_date) {
		super();
		this.id = user_id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.last_login = last_login;
		this.joined_date = joined_date;
	}


	public int getUser_id() {
		return id;
	}
	public void setUser_id(int user_id) {
		this.id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoined_date() {
		return joined_date;
	}
	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}
	
	

}
