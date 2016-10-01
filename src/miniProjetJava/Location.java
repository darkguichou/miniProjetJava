package miniProjetJava;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Location {
//Attributs
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Client client;
	private ArrayList<Article> articles;
//COnstructeurs
	public Location (LocalDate dateDebut, LocalDate dateFin ,ArrayList<Article> articles, Client client){


		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.articles = articles;


// Retire un element dans le stock à chaque location crée
		for (Article article : articles) {

			if (article.getNbStock() > 0){

				article.setNbStock(article.getNbStock() - 1);
			}

		}
	}


//Méthodes
	//Archivage des locations lors de la restitution
	public void restitution() throws IOException{

		for (Article article : articles) {

			article.setNbStock(article.getNbStock() + 1);
		}

		String numMois = "";

		if (dateFin.getMonth().getValue() < 10){


			numMois = "0" + dateFin.getMonth(); 

		} else {


			numMois = Integer.toString(dateFin.getMonth().getValue());

		}

		DataOutputStream dataOutputStream = new DataOutputStream( new FileOutputStream (Integer.toString(dateFin.getYear()) + numMois + ".loc"));


		dataOutputStream.writeUTF("\n" + dateDebut 
				+ " - "  
				+ dateFin 
				+ " - " 
				+ client.getNom().toUpperCase() 
				+ " " + client.getPrenom() 
				+ " " + calculerMontant()
				+ "€"
				);
		
		dataOutputStream.writeUTF("\n \n Liste des articles: \n");

		for (Article article : articles) {
			
			System.out.println("salut");
			dataOutputStream.writeUTF("\n" + article.getReference() + " " + article.getIntitule() + " " + article.prixLocJour);
		
		}
		
		dataOutputStream.writeUTF("\n <----------------------------------------->");
		dataOutputStream.close(); 


	}

//Calcul du montant d'une location effectué
	public float calculerMontant(){

		float montant = 0;

		long diff = dateFin.getDayOfYear() - dateDebut.getDayOfYear() + 1 ; 


		for (Article article : articles) {

			montant += article.prixLocJour * diff ;
		}

		return montant;

	}



//Affichage d'une location
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
