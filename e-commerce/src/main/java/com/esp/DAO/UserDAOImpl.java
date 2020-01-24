package com.esp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esp.Entity.Users;

public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers () {
		return em.createQuery("select u from Users u").getResultList();
	}

	public Users getUser(Long ref) {
		return em.find(Users.class, ref);
	}

	public Users AjouterUser(Users user) {
		em.persist(user);
		return user;
	}

	public void DeleteUser(Users user) {
		em.remove(user);
	}

	public Users updateOne(Users user) {
		// TODO Auto-generated method stub
		return em.merge(user);
	}

}
