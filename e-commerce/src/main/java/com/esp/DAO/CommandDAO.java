package com.esp.DAO;

import java.util.List;

import com.esp.Entity.Command;
import com.esp.Entity.LigneCommande;

public interface CommandDAO {
	
	public List<Command> getAllCmnd () ;
	
	public Command getCmnd (Command cmnd);
	
	public Command AjoutCmnd (Command cmnd);
	
	public Command updateCmnd (Command cmnd);
	
	public void DeleteCmnd (Command cmnd);

	public void addLignCmnd (Command cmnd, LigneCommande Cmnd);
	
}
