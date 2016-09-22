package miniProjetJava;

public class Lumiere extends Article {
	//Attributs
	protected double largeur;
	protected double hauteur;
	

	//Constructeurs
	public Lumiere(double largeur,double hauteur,String reference,String marque,String intitule,float prixLocJour,int nbStock){
		super(reference, marque, intitule, prixLocJour, nbStock);
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	
	//M�thodes
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double getHauteur() {
		return hauteur;
	}
	
	public double getLargeur() {
		return largeur;
	}
}
