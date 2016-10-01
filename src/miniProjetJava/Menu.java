package miniProjetJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Menu {
	
	
	private Magasin magasin;
	
	
	
	public Menu(Magasin magasin){
		
		
		this.magasin = magasin;
		
	}
	
	public void afficherMenu() {

		
		System.out.println("Application de location: \n \n \n");
		System.out.println("1 - Afficher l'ensemble des articles proposés à la location");
		System.out.println("2 - Enregister une nouvelle location \n");
		System.out.println("3 - Afficher l'ensemble des locations en cours pour un client donné. \n");
		System.out.println("4 - Marquer une location comme restituée \n");
		System.out.println("5 - Calculer montant total des recettes sur une période donnée.\n");
		System.out.println("0 - Mettre fin au programme. \n \n");
		System.out.println("Entrez l'identifiant de la tache à réaliser:");

	}
	
	
	public void AfficherArticle(){
		
		int choix = 0;

		
		System.out.println("Veuillez indiquer le tri à effectuer: \n");
		System.out.println("1 - Tri par référence.\n");
		System.out.println("2 - Tri par marque. \n");
		System.out.println("3 - Tri par intitule. \n");
		System.out.println("4 - Tri par prix de la location par jour.\n");
		
		Scanner scanner = new Scanner(System.in);
		choix = scanner.nextInt();
		
		magasin.afficherArticleDispo(choix);
		
	}
	
	public Location saisirLocation(){
		
		
		
		int an = 1;
		int mois = 1;
		int jour = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Année de départ de la location");
		an = scanner.nextInt();
		System.out.println("Mois de départ de la location");
		mois = scanner.nextInt();
		System.out.println("Jour de départ de la location");
		jour = scanner.nextInt();
		LocalDate dateDebut = LocalDate.of(an, mois, jour);
		
		System.out.println("Année de fin de la location");
		an = scanner.nextInt();
		System.out.println("Mois de fin de la loccation");
		mois = scanner.nextInt();
		System.out.println("Jour de fin de la location");
		jour = scanner.nextInt();
		LocalDate dateFin = LocalDate.of(an, mois, jour);
		
		ArrayList<Article> articles = new ArrayList<Article>();
		
		System.out.println("Entrez les articles consernés par la location: \n");
		
		int continuer = 1;
		
		while (continuer == 1){
			
			System.out.println("Entrez la référence d'un article");
			String ref = scanner.next();
			articles.add(magasin.articleParRef(ref));
			System.out.println("Entrez '1' pour continuer la saisie et toute autre touche pour arréter la saisie");
			
			
		}
		
		String reponse = "";
		
		Client client = null;
		
		while (reponse != "oui" || reponse != "non"){
			
			
			if (reponse == "oui"){
				
				String nom;
				String prenom;
				
				System.out.println("Entrez le nom du client:");
				nom = scanner.nextLine();
				
				System.out.println("Entrez le prenom du client");
				prenom = scanner.nextLine();
				
				
				 client = magasin.clientParNomPrenom(nom, prenom);
				
				
			}
			
			else if (reponse == "non"){
				
				String nom;
				String prenom;
				String addresse;
				
				System.out.println("Entrez le nom du client:");
				nom = scanner.nextLine();
				
				System.out.println("Entrez le prenom du client");
				prenom = scanner.nextLine();
				
				
				System.out.println("Entrez l'addresse du client");
				addresse = scanner.nextLine();
				
				 client = new Client(nom, prenom, addresse);
				
			}
			
			
		
		
			
			
		}
		
		
		
		Location location = new Location(dateDebut, dateFin, articles, client);
		
		
		
		return location;
	}
	
	
	
	public void afficherLocations(){
		
		String nom;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le nom du client:");
		
		nom = scanner.next();
		
	}
	
	

}
