package br.com.raphaelneves.application;

import br.com.raphaelneves.dao.DaoGenerico;
import br.com.raphaelneves.pojo.Carro;
import br.com.raphaelneves.pojo.Pessoa;

public class RemoveApplication {
	public static void main(String[] args) {
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		DaoGenerico<Carro> daoCarro = new DaoGenerico<Carro>();
		
		daoPessoa.remove(Pessoa.class, 1L);
		daoCarro.remove(Carro.class, 1L);
		
		System.out.println("Entidades removidas com sucesso!");
		
	}
}
