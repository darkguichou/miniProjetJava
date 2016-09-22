package miniProjetJava;

public class PanneauxLed extends Lumiere {
	//Attributs
	private int nbLed;
	
	//Constructeurs
	public PanneauxLed(){
		nbLed=0;
	}
	
	public PanneauxLed(int nbLed){
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
