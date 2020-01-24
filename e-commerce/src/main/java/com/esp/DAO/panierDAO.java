package com.esp.DAO;

import java.util.List;

import com.esp.Entity.LigneCommande;
import com.esp.Entity.Panier;

public interface panierDAO {

	public void ajouterAlaPanier (Panier pan);
	
	public List<Panier> getAllPanier ();
	
	public void addL_cmnd (Panier p, LigneCommande lcm);
}
