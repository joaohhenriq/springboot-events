package com.events.events.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEvent;

	private String name;
	private String place;
	private String dateEvent;
	private String hourEvent;
	
	
	public long getCodigo() {
		return idEvent;
	}
	public void setCodigo(long codigo) {
		this.idEvent = codigo;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getLocal() {
		return place;
	}
	public void setLocal(String local) {
		this.place = local;
	}
	public String getData() {
		return dateEvent;
	}
	public void setData(String data) {
		this.dateEvent = data;
	}
	public String getHorario() {
		return hourEvent;
	}
	public void setHorario(String horario) {
		this.hourEvent = horario;
	}
}
