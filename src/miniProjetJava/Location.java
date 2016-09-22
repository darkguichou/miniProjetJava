package miniProjetJava;

import java.util.Date;
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



		for (Article article : articles) {

			if (article.getNbStock() > 0){

				article.setNbStock(article.getNbStock() - 1);
			}
			
		}
	}


	public void restitution(){

		for (Article article : articles) {
			
			article.setNbStock(article.getNbStock() + 1);
		}


	}


	public float calculerMontant(){



		return 0;

	}
	
	

		
	public void afficher(){
		
		System.out.println("Date de début: " + dateDebut + "Date de fin: " + dateFin);
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
