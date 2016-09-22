package miniProjetJava;

import java.util.Set;
import java.util.TreeSet;

public class Objectif extends Article {
	//Attribut
	private Set<String> listeModeles;   	
	//Constructeur
	public Objectif(Set<String> listeModeles,String reference, String marque, String intitule, float prixLocJour, int nbStock){
		super( reference,marque,intitule,prixLocJour,nbStock);
		//listeModeles=new TreeSet<String>();
		this.listeModeles=listeModeles;
	}
	
	//Methode
	public void ajoutModele(String modele){
		//Ajout du modele
		listeModeles.add(modele);
	}
	
	public void retirerModele(String modele){
		if(listeModeles.contains(modele))
		{
			//suppression du modele	
		listeModeles.remove(modele);
		}
	}
	
	public void afficher(){
		for(String num : listeModeles)
		{//Affichage de tous les modèles
			System.out.print(num+" / ");
		}
	}
	
	public void setListeModeles(Set<String> listeModeles) {
		this.listeModeles = listeModeles;
	}
	
	public Set<String> getListeModeles() {
		return listeModeles;
	}
	
	public static void main(String args[]){
		Set<String> modele= new TreeSet<String>();
		Objectif O1= new Objectif(modele, "Unereference", "uneMarque", "L'intitule", 120, 3);
		
		O1.ajoutModele("unModele");
		O1.ajoutModele("UnAutreModele");
		O1.ajoutModele("unAutreModeledifferent");
		O1.ajoutModele("unModele");
		O1.afficher();
		O1.retirerModele("unModele");
		O1.afficher();
	}

}
