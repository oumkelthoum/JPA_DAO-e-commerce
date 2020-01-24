package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.LigneCommande;
import com.esp.Entity.Panier;

public class panierDAOImpl implements panierDAO {

	@PersistenceContext
	EntityManager em;

	public void ajouterAlaPanier(Panier pan) {
		
		em.persist(pan);
	}
	
	@SuppressWarnings("unchecked")
	public List<Panier> getAllPanier() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from panier p").getResultList();
	}

	public void addL_cmnd (Panier p, LigneCommande lcm) {
		// la ligne de commande est ajouté dans la collection des lignecmds de la panier
		p.getLigneCommande().add(lcm);
		// la ligne de commande change de panier
		lcm.setPanier(p);
	}
	
}
