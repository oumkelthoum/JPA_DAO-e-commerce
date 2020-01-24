package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.Produit;

public class produitDAOImpl implements produitDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Produit> getAllproduit() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from produit p").getResultList();
	}

	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return em.find(Produit.class, id);
	}
	
	public void deleteProduit (Produit prod) {
		em.remove(prod);
	}
	
	public Produit updateOne (Produit prod) {
		em.merge(prod);
		return prod;
	}
	
	public Produit ajoutProd (Produit prod) {
		em.persist(prod);
		return prod;
	}
	
	

}
