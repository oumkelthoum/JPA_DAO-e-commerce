package com.esp.DAO;

import java.util.List;

import com.esp.Entity.Users;

public interface UserDAO {

	public List<Users> getAllUsers ();
	
	public Users getUser (Long user);
	
	public Users AjouterUser (Users user);
	
	// maj un User
	public Users updateOne (Users user); 

	public void DeleteUser (Users user);
	
/**	public void AjouterUser (List<Users> user);
	
	public void DeleteUser (List<Users> users);
	*/
}
