package br.com.raphaelneves.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("genericPU");
	
	public static EntityManager getEM(){
		return factory.createEntityManager();
	}

}
