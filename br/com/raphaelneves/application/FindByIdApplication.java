package br.com.raphaelneves.application;

import br.com.raphaelneves.dao.DaoGenerico;
import br.com.raphaelneves.pojo.Carro;
import br.com.raphaelneves.pojo.Pessoa;

public class FindByIdApplication {
	
	public static void main(String[] args) {
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();
		
		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
		Carro carro = daoCarro.findById(Carro.class, 1L);
		
		System.out.println("### Entidade Pessoa encontrada ###");
		System.out.println("ID: " + pessoa.getId());
		System.out.println("NOME: " + pessoa.getNome());
		
		System.out.println("");
		
		System.out.println("### Entidade Carro encontrada ###");
		System.out.println("ID: " + carro.getId());
		System.out.println("MODELO: " + carro.getModelo());
		
		
	}

}
