package com.scania.challenge.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localizacao {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_localizacao")
	private Integer id;
	@Column(nullable = false)
	private Date 	data_hora;
	@Column(nullable = false)
	private Integer latitude;
	@Column(nullable = false)
	private Integer longitude;
	
	public Localizacao() {
		
	}
	
	public Localizacao(Integer id_localizacao, Date data_hora, Integer latitude, Integer longitude) {
		super();
		this.id = id_localizacao;
		this.data_hora = data_hora;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Integer getId_localizacao() {
		return id;
	}

	public void setId_localizacao(Integer id_localizacao) {
		this.id = id_localizacao;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	
}
