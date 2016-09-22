package miniProjetJava;

public class PanneauxLed extends Lumiere {
	//Attributs
	private int nbLed;
	
	//Constructeurs
	public PanneauxLed(int nbLed,double largeur,double hauteur,String reference,String marque,String intitule,float prixLocJour,int nbStock){
		super(largeur,hauteur,reference,marque,intitule,prixLocJour,nbStock);
		this.nbLed=nbLed;
	}
	
	//Méthodes
	
	public void setNbLed(int nbLed) {
		this.nbLed = nbLed;
	}
	
	public int getNbLed() {
		return nbLed;
	}
	
	
}
