package miniProjetJava;

import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	static int id = 1;
	
	public static void main(String args[]){
		

		

		

		





		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<Client>  clients = new ArrayList<Client>();

		articles.add(new DispositifAcquisition("grand angle", "12mpx", 12, "DA0001", "SONY", "sony type A", 20, 5));
		articles.add(new DispositifAcquisition("standard", "4mpx", 4, "DA0002", "SONY", "Sony type E", 12, 10));
		articles.add(new FondsStudio(200, 200, "FS0001", "FS", "FS moyen", 50, 5));
		articles.add(new FondsStudio(300, 200, "FS0002", "FS", "FS large", 80, 3));
		articles.add(new PanneauxLed(20000, 200, 200, "PL0001", "LED", "LED maxi", 150, 2));
		articles.add(new Reflecteur(50, 50, "RF0001", "LUMINA","lumina 50", 60, 10));
		articles.add(new TournageStab("TS0001", "STABY", "staby super", 40, 15, 130));

		clients.add(new Client("Pierre", "Jean", "16 rue du cirque"));
		clients.add(new Client("Tin", "Tin", "17 rue du secret de la licorne"));
		clients.add(new Client("Luke", "Lucky", "2 avenue du Far west"));
		clients.add(new Client("Le Gaulois", "Asterix" , "village breton"));

		Magasin magasin = new Magasin(articles, clients);
		
		Menu menu = new Menu(magasin);

		Scanner scanner = new Scanner(System.in);

		int choix = -1;

		while (choix != 0){
			
			menu.afficherMenu();

			choix = scanner.nextInt();
			
			
			
			switch (choix) {
			
			case 1: menu.AfficherArticle(); break;
			
			case 2: magasin.getLocations().add(menu.saisirLocation()); break;
			
			case 3: menu.afficherLocations(); break;
				
			case 4: try {
					menu.restitution();
				} catch (IOException e) {
				
					e.printStackTrace();
					
				} break;
			
			case 5 : menu.totalRecettes();
			
		
			}

		}

	}

}
