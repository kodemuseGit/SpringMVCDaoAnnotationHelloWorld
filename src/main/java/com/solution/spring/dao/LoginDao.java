package com.solution.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class LoginDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(Object obj) {
		getEm().persist(obj);
	}

	public EntityManager getEm() {
		return em;
	}

}
