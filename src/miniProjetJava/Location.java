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


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public ArrayList<Article> getArticles() {
		return articles;
	}


	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	
	

}
