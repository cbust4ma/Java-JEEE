package com.ipartek.modelo.dto;

public class Login {
	
	private int id;
	private String users;
	private String password;
	
	
	public Login(int id, String users, String password) {
		super();
		this.id = id;
		this.users = users;
		this.password = password;
	}
	
	
	public Login() {
		super();
		this.id = 0;
		this.users = "";
		this.password = "";
	}


	public String getUsers() {
		return users;
	}


	public void setUsers(String users) {
		this.users = users;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [users=" + users + ", password=" + password + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
