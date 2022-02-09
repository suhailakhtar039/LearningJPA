package com.jpa.learning.entity;

public class User {
	private long id;
	private String name;
	private String role;
	public User() {}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, role=%s]", id, name, role);
	}
	
}
