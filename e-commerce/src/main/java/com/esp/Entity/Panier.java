package com.esp.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table ( name = "panier" )
public class Panier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column ( name = "panier_id", nullable = false)
	@GeneratedValue ( strategy = GenerationType.AUTO)
	private Long panier_id ;

	@OneToMany (mappedBy = "panier", cascade = { CascadeType.ALL })
	private List<LigneCommande> LigneCommande = new ArrayList<LigneCommande>() ;
	
	public Long getPanier_id() {
		return panier_id;
	}

	public void setPanier_id(Long panier_id) {
		this.panier_id = panier_id;
	}

	public List<LigneCommande> getLigneCommande() {
		return LigneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		LigneCommande = ligneCommande;
	}

}
