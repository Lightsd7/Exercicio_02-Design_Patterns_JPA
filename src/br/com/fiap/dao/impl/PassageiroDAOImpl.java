package br.com.fiap.dao.impl;

import br.com.fiap.entity.Passageiro;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PassageiroDAO;

public class PassageiroDAOImpl extends GenericDAOImpl<Passageiro, Integer> implements PassageiroDAO {

	public PassageiroDAOImpl(EntityManager em) {
		super(em);
	}

}
