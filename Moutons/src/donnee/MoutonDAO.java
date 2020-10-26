package donnee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;

import modele.Mouton;

public class MoutonDAO {
	

	
	public int compterMoutons()
	{
		Firestore nuage = BaseDeDonnees.getInstance().getConnection();
		int nombre = 0;
		try {
			ApiFuture<QuerySnapshot> demande = nuage.collection("mouton").get();
			QuerySnapshot resultat = demande.get();
			nombre = resultat.getDocuments().size();
			System.out.println(nombre + " Moutons");
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		return nombre;		
	}
	
	public List<Mouton> listerMoutons()
	{

		
		List<Mouton> moutons =  new ArrayList<Mouton>();			

		try {
	
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		return moutons;
	}

	public void ajouterMouton(Mouton mouton)
	{

		
		System.out.println("MoutonDAO.ajouterMouton()");
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Mouton detaillerMouton(int numero)
	{

		
		Mouton mouton =  new Mouton();			
			try {

				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return mouton;
	}
	
}
