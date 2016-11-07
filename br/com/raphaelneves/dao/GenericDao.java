package br.com.raphaelneves.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.raphaelneves.model.EntidadeBasica;
import br.com.raphaelneves.util.EMFactory;

public class GenericDao<T extends EntidadeBasica> {
	
	private EntityManager getEM(){
		return EMFactory.getEM();
	} 
	
	public T findById(Class<T> clazz, Long id){
		EntityManager em = getEM();
		T t = null;
		try{
			t = em.find(clazz, id);
		}finally {
			em.close();
		}
		return t;
	}
	
	public T saveOrUpdate(T t){
		EntityManager em = getEM();
		T t2 = null;
		try{
			em.getTransaction().begin();
			if(t.getId() == null){
				em.persist(t);
			}else{
				if(!em.contains(t)){
					t = em.merge(t);
				}
			}
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return t;
	}
	
	public void remove(Class<T> clazz, Long id){
		EntityManager em = getEM();
		T t = findById(clazz, id);
		try{
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	}
}
