package com.esp.Entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table ( name = "produit" )
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column ( name = "id_produit", nullable = false)
	@GeneratedValue ( strategy = GenerationType.AUTO)
	private Long id_produit ;

	@Column ( name = "description" )
	private String description ;
	
	@Column ( name = "prix" )
	private String prix ;
	
	@Column ( name = "image" )
	private String image ;

	@ManyToOne ( fetch = FetchType.LAZY )
	@JoinColumn ( name = "ligneCommande", nullable = false )
	private LigneCommande ligneCommande ;
	
	@ManyToOne ( fetch = FetchType.LAZY )
	@JoinColumn ( name = "category" )
	private Category category ;
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(Long id_produit, String description, String prix, String image, LigneCommande ligneCommande,
			Category category) {
		super();
		this.id_produit = id_produit;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.ligneCommande = ligneCommande;
		this.category = category;
	}

	public Long getId_produit() {
		return id_produit;
	}

	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public Category getCategorie() {
		return category;
	}

	public void setCategorie(Category category) {
		this.category = category;
	}

}
