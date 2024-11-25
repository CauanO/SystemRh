package com.SystemRH.SystemRH.models;

import java.io.Serializable;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.validation.constraints.NotEmpty;

@Entity
public class Vaga implements Serializable {
	// Atributo que faz o controle do versão do objeto.
	private static final long serrialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
	private String data;
	
	@NotEmpty
	private String salario;
	
	//Remove todo relacionado ao cadidato.
	@OneToMany(mappedBy = "vaga" , cascade = CascadeType.REMOVE)
	private List<Cadidato> cadidatos;
	
	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<Cadidato> getCadidatos() {
		return cadidatos;
	}

	public void setCadidatos(List<Cadidato> cadidatos) {
		this.cadidatos = cadidatos;
	}
}
