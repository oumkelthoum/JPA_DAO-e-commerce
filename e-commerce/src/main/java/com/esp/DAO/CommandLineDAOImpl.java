package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.LigneCommande;
import com.esp.Entity.Produit;

public class CommandLineDAOImpl implements CommandLineDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<LigneCommande> getAllLcmd() {
		// TODO Auto-generated method stub
		return em.createQuery("select l from LigneCommande l").getResultList();
	}

	public LigneCommande getLcmnd(Long id) {
		// TODO Auto-generated method stub
		return em.find(LigneCommande.class, id);
	}

	public void deleteLcmnd(LigneCommande lcm) {
		// TODO Auto-generated method stub
		em.remove(lcm);
	}

	public LigneCommande updateOne(LigneCommande lcm) {
		// TODO Auto-generated method stub
		return em.merge(lcm);
	}

	public LigneCommande ajoutProd(LigneCommande lcm) {
		// TODO Auto-generated method stub
		em.persist(lcm);
		return lcm;
	}

	public void addProd(LigneCommande lcm, Produit p) {
		// le produit est ajouté dans la collection des produit de la lcm
		lcm.getProduit().add(p);
		// le produit change la lcm
		p.setLigneCommande(lcm);

	}

}
