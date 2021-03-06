package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.KeyNotFoundException;
import java.lang.reflect.ParameterizedType;

public abstract class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

	private EntityManager em;

	private Class<T> clazz;

	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		this.clazz = (Class<T>) ((ParameterizedType) 
				getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entity) {
		em.persist(entity);
	}

	@Override
	public void atualizar(T entity) {
		em.merge(entity);
	}

	@Override
	public void deletar(K id) throws KeyNotFoundException {
		T entity = pesquisar(id);
		em.remove(entity);
	}

	@Override
	public T pesquisar(K id) throws KeyNotFoundException {
		T entity = em.find(clazz, id);
		if (entity == null) {
			throw new KeyNotFoundException();
		}
		return entity;
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
		}

	}
}
