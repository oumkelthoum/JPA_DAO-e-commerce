package com.esp.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table ( name = "category" )
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column ( name = "id_category" )
	@GeneratedValue ( strategy = GenerationType.AUTO)
	private Long id_category ;
	
	@Column ( name = "descriptif" )
	private String descriptif ;
	
	@OneToMany ( mappedBy = "category", cascade = { CascadeType.ALL } )
	private List<Produit> produit = new ArrayList<Produit>();

	public Long getId_category() {
		return id_category;
	}

	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public List<Produit> getProduit() {
		return produit;
	}

	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}

}
