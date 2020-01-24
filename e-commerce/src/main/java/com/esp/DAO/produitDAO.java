package com.esp.DAO;

import java.util.List;

import com.esp.Entity.Produit;

public interface produitDAO {
	
	public List<Produit> getAllproduit ();
	
	public Produit getProduit (Long id);
	
	public void deleteProduit (Produit prod);
	
	public Produit updateOne (Produit prod) ;
	
	public Produit ajoutProd (Produit prod) ;

}
