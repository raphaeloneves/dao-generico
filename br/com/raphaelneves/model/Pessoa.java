package br.com.raphaelneves.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Pessoa implements EntidadeBasica{

	private Long id;
	private String nome;
	private Date dtAniversario;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getDtAniversario() {
		return dtAniversario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDtAniversario(Date dtAniversario) {
		this.dtAniversario = dtAniversario;
	}

}
