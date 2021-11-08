package com.ipartek.modelo.dto;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	
	public Usuario(int id, String usuario, String password) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}
	
	public Usuario() {
		super();
		this.id = 0;
		this.usuario = "";
		this.password = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	
	

}
