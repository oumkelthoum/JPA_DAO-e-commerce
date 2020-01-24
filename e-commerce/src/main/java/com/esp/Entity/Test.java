package com.esp.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static final EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME = "esp_commerce";

	static {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public static void main(String[] args) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
 
	
}
