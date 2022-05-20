package com.scania.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caminhao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_caminhao")
	private Integer id;
	private	String 	placa;
	@Column(nullable = false)
	private	String 	chassi;
	@Column(nullable = false)
	private	String 	modelo;
	
	private Integer ano;
	
	public Caminhao(){
		
	}

	
	
	public Caminhao(Integer idcaminhao, String placa, String chassi, String modelo, Integer ano) {
		super();
		this.id = idcaminhao;
		this.placa = placa;
		this.chassi = chassi;
		this.modelo = modelo;
		this.ano = ano;
	}



	public Integer getIdcaminhao() {
		return id;
	}

	public void setIdcaminhao(Integer idcaminhao) {
		this.id = idcaminhao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	
}
