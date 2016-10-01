package miniProjetJava;

public class TournageStab extends Article {
	
	//Attribut
	private int hauteur;
//Constructeur
	public TournageStab(String reference, String marque, String intitule, float prixLocJour, int nbStock,int hauteur){
		super(reference,marque,intitule,prixLocJour,nbStock);
		this.hauteur=hauteur;
	}
	//Méthodes
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

}
