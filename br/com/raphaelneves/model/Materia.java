package br.com.raphaelneves.model;

import javax.persistence.Entity;

@Entity
public class Materia implements EntidadeBasica{

	private Long id;
	private String descricao;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
