package miniProjetJava;

import java.sql.Date;
import java.util.ArrayList;

public class Magasin {
	
	
	
	private ArrayList<Article> articles;
	private ArrayList<Client> clients;
	private ArrayList<Location> locations;
	
	
	
	public Magasin(ArrayList<Article> articles, ArrayList<Client> clients){
		
		this.articles = articles;
		this.clients = clients;
		
		
	}

	
	public void afficherArticleDispo(){
		
		for (Article article : articles) {
			
			System.out.println("Ref: " + article.reference);
			System.out.println("Marque: " + article.marque);
			System.out.println("Intitulé: " + article.intitule);
			System.out.println("Prix par jour de location: " + article.prixLocJour);
		}
		
		
	}
	
	
	public void enregistrerLoc(){
		
		
		
		
	}
	
	
	public void afficherLocEnCours(){
		
		
		
		
	}
	
	public void calculerTotal(Date dateDebut, Date dateFin){
		
		
		
		
		
	}
	
	
}
