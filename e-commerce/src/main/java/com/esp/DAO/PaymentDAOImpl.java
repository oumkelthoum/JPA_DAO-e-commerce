package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.payment;

public class PaymentDAOImpl implements PaymentDAO {
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	public List<payment> getAllPaimt() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from payment p").getResultList();
	}

	public payment getPamnt(Long id) {
		// TODO Auto-generated method stub
		return em.find(payment.class, id);
	}

	public void deletepaiemt(payment pmnt) {
		// TODO Auto-generated method stub
		em.remove(pmnt);
	}

	public payment updateOne(payment pmnt) {
		// TODO Auto-generated method stub
		return em.merge(pmnt);
	}

	public payment ajoutPmnt(payment pmnt) {
		// TODO Auto-generated method stub
		em.persist(pmnt);
		return pmnt;
	}

}
