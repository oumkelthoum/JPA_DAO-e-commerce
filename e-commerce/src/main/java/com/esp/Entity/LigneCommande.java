package com.esp.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "LigneCommande")
public class LigneCommande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_lcmd", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_lcmd;

	@Column(name = "quantite")
	private String quantite;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "panier", nullable = false)
	private Panier panier;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "command", nullable = false)
	private Command command;

	@OneToMany(mappedBy = "ligneCommande", cascade = { CascadeType.ALL })
	private List<Produit> produit = new ArrayList<Produit>();

	
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LigneCommande(Long id_lcmd, String quantite, Panier panier, Command command, List<Produit> produit) {
		super();
		this.id_lcmd = id_lcmd;
		this.quantite = quantite;
		this.panier = panier;
		this.command = command;
		this.produit = produit;
	}

	public Long getId_lcmd() {
		return id_lcmd;
	}

	public void setId_lcmd(Long id_lcmd) {
		this.id_lcmd = id_lcmd;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Command getCommande() {
		return command;
	}

	public void setCommande(Command command) {
		this.command = command;
	}

	public List<Produit> getProduit() {
		return produit;
	}

	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}
}
