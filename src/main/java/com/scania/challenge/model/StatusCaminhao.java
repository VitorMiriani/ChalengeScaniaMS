package com.scania.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StatusCaminhao {
	@Id
	@Column(name = "id_caminhao")
	private Integer id;
	@Column(nullable = false,name = "km_oleo")
	private Integer kmOleo;
	@Column(nullable = false,name = "km_total")
	private Integer kmTotal;
	@Column(nullable = false)
	private Integer combustivel;
	@Column(nullable = false)
	private Integer saude;
	
	public StatusCaminhao() {
		
		
	}
	
	public StatusCaminhao(Integer km_oleo, Integer km_total, Integer combustivel, Integer saude) {
		super();
		this.kmOleo = km_oleo;
		this.kmTotal = km_total;
		this.combustivel = combustivel;
		this.saude = saude;
	}

	public Integer getKm_oleo() {
		return kmOleo;
	}

	public void setKm_oleo(Integer km_oleo) {
		this.kmOleo = km_oleo;
	}

	public Integer getKm_total() {
		return kmTotal;
	}

	public void setKm_total(Integer km_total) {
		this.kmTotal = km_total;
	}

	public Integer getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Integer combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getSaude() {
		return saude;
	}

	public void setSaude(Integer saude) {
		this.saude = saude;
	}
	
	
	
	
	
	 
		
	
	
}
