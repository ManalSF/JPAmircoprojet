package main.java.dao;

import java.util.List;

import main.java.model.Clients;

interface IClientsDao {
	public Clients addClients(Clients Clients);
	public boolean emailUnique(String email);
	public boolean passwordCheck(String password);
	public Clients identifier(String email,String motdepasse);
	
	//Test
	public List<Clients> getClientss();
}
