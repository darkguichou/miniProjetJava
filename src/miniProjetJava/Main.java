package miniProjetJava;

import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]){
		
		Menu menu = new Menu();


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
			
			menu.afficherMenu();

			choix = scanner.nextInt();
			
			
			
			switch (choix) {
			
			case 1: magasin.afficherArticleDispo(0); break;
			
			case 2: menu.saisirLocation(magasin);
				
				
				
				;
			default:
				break;
			}

		}

	}

}
