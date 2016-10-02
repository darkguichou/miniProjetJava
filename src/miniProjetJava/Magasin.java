package miniProjetJava;

import java.time.LocalDate;
import java.util.ArrayList;

public class Magasin {


//Attributs
	private ArrayList<Article> articles;
	private ArrayList<Client> clients;
	private ArrayList<Location> locations;


//Constructeur
	public Magasin(ArrayList<Article> articles, ArrayList<Client> clients){

		this.articles = articles;
		this.clients = clients;
		locations = new ArrayList<Location>();


	}

//Méthodes
	public void afficherArticleDispo(int choix){
//Affichage des articles proposés selon le choix de l'utilisateur(tout,reference,marque,intitulé,prix)
		
		
		ArrayList<Article> articlesTries = articles;
		
		switch (choix) {
		case 1: articlesTries.sort(new CompareRef()); break;
		case 2: articlesTries.sort(new CompareMarque()); break;
		case 3: articlesTries.sort(new CompareIntitule()); break;
		case 4: articlesTries.sort(new ComparePrix()); break;
		default: articlesTries.sort(new CompareRef()); break;
		}
		
		
		for (Article article : articlesTries) {
			
			
			
					System.out.println("Ref: " + article.reference);
					System.out.println("Marque: " + article.marque);
					System.out.println("Intitulé: " + article.intitule);
					System.out.println("Prix par jour de location: " + article.prixLocJour);
					System.out.println("\n");
					System.out.println("<------------------------------------------------------>");
					System.out.println("\n");
			
			
		}


	}

//Enregistrement de chaque locationde matériel conclue
	public void enregistrerLoc(Location location){


		
		locations.add(location);
		


	}

//Affichage de l'ensemble des locations en cours pour un client donnée
	public void afficherLocEnCours(Client client){

		LocalDate dateToday = LocalDate.now();

		for (Location location : locations) {
			//Vérifie que le client existe
			if (location.getClient().equals(client) ){
				//Verifie que la location n'est pas finie
				System.out.println("trouvé");
				if (location.getDateFin().isAfter( dateToday )){


					location.afficher();
				}
			}
		}


	}
//Calcul du montant total des recettes sur une période donnée
	public float calculerTotal(LocalDate dateDebut, LocalDate dateFin){
		float montant=0;
		for (Location l : locations){
			if(l.getDateDebut().isAfter(dateDebut)&& l.getDateFin().isBefore(dateFin))
				//Calcul du montant pour chaque location compris dans l'intervalle de temps
			montant+= l.calculerMontant();			
		}		
		return montant;
	}


	public Article articleParRef(String ref){
		
		Article res = null;
		
		for (Article article : articles) {
			
			if (article.getReference().equals(ref)){
				
				res = article;
				
			}
			
		}
		
		
		System.out.println(res);
		return res;
		
	}
	
	
	public Client clientParNomPrenom (String nom, String prenom){
		
		Client res = null;
		
		for (Client client : clients) {
			
			if (client.getNom().equals(nom) && client.getPrenom().equals(prenom)){
				
				res = client;
				
			}
			
		}
		
		return res;
	}
	
	
	public Location locationParId(int id){
		
		Location res = null;
		
		for (Location location : locations) {
			
			
			if (location.getId() == id){
				
				
				res = location;
				
			}
			
		}
		
		return res;
	}
	
	
	
	
	public ArrayList<Article> getArticles() {
		return articles;
	}


	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}


	public ArrayList<Client> getClients() {
		return clients;
	}


	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}


	public ArrayList<Location> getLocations() {
		return locations;
	}


	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}


}
