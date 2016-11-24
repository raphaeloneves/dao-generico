package br.com.raphaelneves.application;

import br.com.raphaelneves.dao.DaoGenerico;
import br.com.raphaelneves.pojo.Pessoa;

public class UpdateApplication {
	
	public static void main(String[] args) {
		
		DaoGenerico<Pessoa> daoPessoa = new DaoGenerico<Pessoa>();
		
		Pessoa pessoa = daoPessoa.findById(Pessoa.class, 1L);
		pessoa.setNome("Raphael Oliveira Neves");
		daoPessoa.saveOrUpdate(pessoa);
		System.out.println("Entidade atualizada com sucesso.");
		
	}

}
