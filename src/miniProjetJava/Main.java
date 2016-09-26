package miniProjetJava;

import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]){


		Article article1 = new Article("d0001", "Cannon", "Cannon v145", 12, 10);
		Article article2 = new Article("d0002", "Sony", "Sony v897", 20, 5);

		Client client = new Client("Jean", "Paul", "16 rue de la vachette");





		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<Client>  clients = new ArrayList<Client>();

		articles.add(article1);
		articles.add(article2);

		clients.add(client);

		Magasin magasin = new Magasin(articles, clients);

		Scanner scanner = new Scanner(System.in);

		int choix = -1;

		while (choix != 0){

			System.out.println("Application de location: \n \n \n");
			System.out.println("1 - Afficher l'ensemble des articles proposés à la location");
			System.out.println("2 - Enregister une nouvelle location \n");
			System.out.println("3 - Afficher l'ensemble des locations en cours pour un client donné. \n");
			System.out.println("4 - Marquer une location comme restituée \n");
			System.out.println("5 - Calculer montant total des recettes sur une période donnée.\n");
			System.out.println("0 - Mettre fin au programme. \n \n");
			System.out.println("Entrez l'identifiant de la tache à réaliser:");
			choix = scanner.nextInt();
			
			
			
			switch (choix) {
			
			case 1: magasin.afficherArticleDispo(); break;
			
			case 2: 
				
				
				
				;
			default:
				break;
			}

		}

	}

}
