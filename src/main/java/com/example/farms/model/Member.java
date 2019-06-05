package com.example.farms.model;

public class Member {
	
	int id_member;
	String name_member;
	
	public Member() {
		
	}
	
	public Member(int id_member, String name_member) {
		super();
		this.id_member = id_member;
		this.name_member = name_member;
	}
	
	public int getId_member() {
		return id_member;
	}
	public void setId_member(int id_member) {
		this.id_member = id_member;
	}
	public String getName_member() {
		return name_member;
	}
	public void setName_member(String name_member) {
		this.name_member = name_member;
	}
	
}
