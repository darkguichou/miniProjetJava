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



	public String getReference() {
		return reference;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}



	public String getMarque() {
		return marque;
	}



	public void setMarque(String marque) {
		this.marque = marque;
	}



	public String getIntitule() {
		return intitule;
	}



	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}



	public float getPrixLocJour() {
		return prixLocJour;
	}



	public void setPrixLocJour(float prixLocJour) {
		this.prixLocJour = prixLocJour;
	}



	public int getNbStock() {
		return nbStock;
	}



	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}
	
	
	
}
