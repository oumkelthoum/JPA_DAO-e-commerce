package com.esp.DAO;

import java.util.List;

import com.esp.Entity.LigneCommande;
import com.esp.Entity.Produit;

public interface CommandLineDAO {

	public List<LigneCommande> getAllLcmd ();
	
	public LigneCommande getLcmnd (Long id);
	
	public void deleteLcmnd (LigneCommande lcm);
	
	public LigneCommande updateOne (LigneCommande lcm) ;
	
	public LigneCommande ajoutProd (LigneCommande lcm) ;
	
	public void addProd (LigneCommande lcm, Produit p);

}
