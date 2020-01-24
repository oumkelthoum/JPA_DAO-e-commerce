package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.Command;
import com.esp.Entity.LigneCommande;

public class CommandDAOImpl implements CommandDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Command> getAllCmnd() {
		return em.createQuery("select c from Command c").getResultList();
	}

	public Command getCmnd(Command cmnd) {
		// TODO Auto-generated method stub
		return em.find(Command.class, cmnd.getCommande_id());
	}

	public Command AjoutCmnd(Command cmnd) {
		em.persist(cmnd);
		return cmnd;
	}

	public Command updateCmnd(Command cmnd) {
		em.persist(cmnd);
		return cmnd;
	}

	public void DeleteCmnd(Command cmnd) {
		// TODO Auto-generated method stub
		em.remove(cmnd);
	}

	public void addLignCmnd(Command cmnd, LigneCommande lcm) {
		// la lcm est ajouté dans la collection des ligne de commande de la commande
		cmnd.getLignecommande().add(lcm);
		// la lcm a changer sa commande
		lcm.setCommande(cmnd);
	}

}
