package miniProjetJava;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Location {

	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Client client;
	private ArrayList<Article> articles;

	public Location (LocalDate dateDebut, LocalDate dateFin ,ArrayList<Article> articles, Client client){


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


	@SuppressWarnings("deprecation")
	public void restitution() throws FileNotFoundException{

		for (Article article : articles) {
			
			article.setNbStock(article.getNbStock() + 1);
		}
		
		String numMois = "";
		
		if (dateFin.getMonth().getValue() < 10){
			
			
			 numMois = "0" + dateFin.getMonth(); 
			
		} else {
			
			
			 numMois = Integer.toString(dateFin.getMonth().getValue());
			
		}
		
		DataOutputStream dataOutputStream = new DataOutputStream( new FileOutputStream (Integer.toString(dateFin.getYear()) + numMois + ".log"));
		


	}


	public float calculerMontant(){

		float montant = 0;
		
		long diff = dateFin.getDayOfYear() - dateDebut.getDayOfYear() + 1 ; 
		

		for (Article article : articles) {
			
			montant += article.prixLocJour * diff ;
		}
		
		return montant;

	}
	
	

		
	public void afficher(){
		
		System.out.println("Date de début: " + dateDebut + "Date de fin: " + dateFin + "Montant: " +this.calculerMontant());
	}


	public LocalDate getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}


	public LocalDate getDateFin() {
		return dateFin;
	}


	public void setDateFin(LocalDate dateFin) {
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
