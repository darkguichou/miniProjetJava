package miniProjetJava;

import java.sql.Date;
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
		
		System.out.println(article1.getNbStock() + " " + article2.getNbStock() );
		@SuppressWarnings("deprecation")
		Location location = new Location(new Date(2016, 9, 12), new Date(2016, 24, 12), articles, client);
		System.out.println(article1.getNbStock() + " " + article2.getNbStock() );
		location.restitution();
		System.out.println(article1.getNbStock() + " " + article2.getNbStock() );
		
		
		Magasin magasin = new Magasin(articles, clients);
		magasin.afficherArticleDispo();
		
	}
	
}
