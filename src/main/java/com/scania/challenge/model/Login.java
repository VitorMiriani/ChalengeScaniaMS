package com.scania.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_localizacao")
	private Integer id;
	@Column(nullable = false)
	private Integer pin;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String senha;
	
	public Login() {
	
		
		
	}
	
	public Login(Integer id, Integer pin, String nome, String senha) {
		super();
		this.id = id;
		this.pin = pin;
		this.nome = nome;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
