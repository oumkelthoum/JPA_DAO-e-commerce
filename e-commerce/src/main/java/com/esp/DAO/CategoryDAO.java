package com.esp.DAO;

import java.util.List;

import com.esp.Entity.Category;
import com.esp.Entity.Produit;

public interface CategoryDAO {

	public List<Category> getAllcategory ();
	
	public Category getCategory (Long id);
	
	public void deleteCategory (Category cat);
	
	public Category updateOne (Category cat) ;
	
	public Category ajoutProd (Category cat) ;
	
	public void addProd (Category c, Produit p);
	
}
