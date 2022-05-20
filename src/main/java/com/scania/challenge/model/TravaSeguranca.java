package com.scania.challenge.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TravaSeguranca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_trava",columnDefinition = "Number")
	private Integer 	id;
	@Column(nullable = false)
	private Character 	status;
	@Column(nullable = false)
	private Date 		data;
	
	
	public TravaSeguranca() {
		
	}
 
	public TravaSeguranca(Integer idTrava, Character status, Date data) {
		super();
		this.id = idTrava;
		this.status = status;
		this.data = data;
	}
	
	public Integer getIdTrava() {
		return id;
	}
	public void setIdTrava(Integer idTrava) {
		this.id = idTrava;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
