package miniProjetJava;

import java.sql.Date;
import java.util.ArrayList;

public class Location {
	
	private Date dateDebut;
	private Date dateFin;
	private Client client;
	private ArrayList<Article> articles;
	
	public Location (Date dateDebut, Date dateFin ,ArrayList<Article> articles, Client client){
		
		
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.articles = articles;
		
	}
	
	
	public void restitution(){
		
		
		
		
	}
	
	
	public float calculerMontant(){
		
		
		
		return 0;
		
	}
	
	

}
