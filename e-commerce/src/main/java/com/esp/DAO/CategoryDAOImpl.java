package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.Category;
import com.esp.Entity.Produit;

public class CategoryDAOImpl implements CategoryDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Category> getAllcategory() {
		// TODO Auto-generated method stub
		return em.createQuery("select c from Category c").getResultList();
	}

	public Category getCategory(Long id) {
		// TODO Auto-generated method stub
		return em.find(Category.class, id);
	}

	public void deleteCategory (Category cat) {
		// TODO Auto-generated method stub
		em.remove(cat);
	}

	public Category updateOne(Category cat) {
		// TODO Auto-generated method stub
		return em.merge(cat);
	}

	public Category ajoutProd(Category cat) {
		// TODO Auto-generated method stub
		em.persist(cat);
		return cat;
	}

	public void addProd(Category c, Produit p) {
		// le produit est ajouté dans la collection des produits de la catégorie
		c.getProduit().add(p);
		
		// la produit change de catégorie
		p.setCategorie(c);
	}

}
