package com.SystemRH.SystemRH.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Cadidato {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique = true)
	private String rg;
	
	@NotEmpty
	private String nomeCadidato;
	
	@NotEmpty
	private String email;
	
	//Instacia da model vaga.
	@ManyToOne
	private Vaga vaga;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeCadidato() {
		return nomeCadidato;
	}

	public void setNomeCadidato(String nomeCadidato) {
		this.nomeCadidato = nomeCadidato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
}
