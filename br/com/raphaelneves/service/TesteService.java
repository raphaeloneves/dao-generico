package br.com.raphaelneves.service;

import java.util.Date;

import br.com.raphaelneves.dao.AulaDao;
import br.com.raphaelneves.dao.PessoaDao;
import br.com.raphaelneves.model.Aula;
import br.com.raphaelneves.model.Materia;
import br.com.raphaelneves.model.Pessoa;

public class TesteService {

	{
		
		Pessoa p = new Pessoa();
		p.setDtAniversario(new Date());
		p.setId(1L);
		p.setNome("Raphael");
		
		Pessoa p2 = new Pessoa();
		p2.setDtAniversario(new Date());
		p2.setId(2L);
		p2.setNome("Neves");
		
		Aula a = new Aula();
		a.setDescricao("Aula de ciências");
		a.setId(1L);
		
		Aula a2 = new Aula();
		a2.setDescricao("Aula de matemática");
		a2.setId(2L);
		
		Materia m = new Materia();
		m.setDescricao("Ciências");
		m.setId(1L);
		
		Materia m2 = new Materia();
		m2.setDescricao("Matemática");
		m2.setId(2L);
		
		PessoaDao pd = new PessoaDao();
		Pessoa pessoa = pd.saveOrUpdate(p);
		Pessoa pessoa2 = pd.saveOrUpdate(p2);
		pd.remove(Pessoa.class, 1L);
		
		AulaDao ad = new AulaDao();
		Aula aula = ad.saveOrUpdate(a);
		aula.setDescricao("Mudou a descrição");
		aula = ad.saveOrUpdate(aula);
		
	}
	
}
