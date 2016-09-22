package miniProjetJava;

public class Article {

	
	protected String reference;
	protected String marque;
	protected String intitule;
	protected float prixLocJour;
	protected int nbStock;
	
	
	
	public Article(String reference, String marque, String intitule, float prixLocJour, int nbStock){
		
		
		this.reference = reference;
		this.marque = marque;
		this.intitule = intitule;
		this.prixLocJour = prixLocJour;
		this.nbStock = nbStock;
		
		
	}
	
	
	
}
