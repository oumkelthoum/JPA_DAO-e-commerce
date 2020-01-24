package com.esp.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payement")
public class payment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_payement", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_payement;

	@Column(name = "n_compte")
	private String n_compte;

	@Column(name = "payement")
	private String mode_payement;

	public payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public payment(Long id_payement, String n_compte, String mode_payement) {
		super();
		this.id_payement = id_payement;
		this.n_compte = n_compte;
		this.mode_payement = mode_payement;
	}

	public Long getId_payement() {
		return id_payement;
	}

	public void setId_payement(Long id_payement) {
		this.id_payement = id_payement;
	}

	public String getN_compte() {
		return n_compte;
	}

	public void setN_compte(String n_compte) {
		this.n_compte = n_compte;
	}

	public String getMode_payement() {
		return mode_payement;
	}

	public void setMode_payement(String mode_payement) {
		this.mode_payement = mode_payement;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
