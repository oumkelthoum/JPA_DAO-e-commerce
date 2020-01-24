package com.esp.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "commande")
public class Command implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "commande_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commande_id;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	@OneToMany(mappedBy = "command", cascade = { CascadeType.ALL })
	private List<LigneCommande> lignecommande = new ArrayList<LigneCommande>();

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "payment", unique = true, nullable = false)
	private payment payment;

	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Command(Long commande_id, Date date, List<LigneCommande> lignecommande, com.esp.Entity.payment payment) {
		super();
		this.commande_id = commande_id;
		this.date = date;
		this.lignecommande = lignecommande;
		this.payment = payment;
	}

	public Long getCommande_id() {
		return commande_id;
	}

	public void setCommande_id(Long commande_id) {
		this.commande_id = commande_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<LigneCommande> getLignecommande() {
		return lignecommande;
	}

	public void setLignecommande(List<LigneCommande> lignecommande) {
		this.lignecommande = lignecommande;
	}

	public payment getPayment() {
		return payment;
	}

	public void setPayment(payment payment) {
		this.payment = payment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
