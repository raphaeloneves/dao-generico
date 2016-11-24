package br.com.raphaelneves.application;

import br.com.raphaelneves.dao.DaoGenerico;
import br.com.raphaelneves.pojo.Carro;
import br.com.raphaelneves.pojo.Pessoa;

public class InsertApplication {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Carro carro = new Carro();
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();
		
		
		pessoa.setNome("Raphael Neves");
		pessoa.setIdade(28);
		
		carro.setModelo("Mustang");
		carro.setAnoFabricacao(1989);
		
		daoPessoa.saveOrUpdate(pessoa);
		daoCarro.saveOrUpdate(carro);
		
		System.out.println("Entidades salvas com sucesso!");
		
	}

}
