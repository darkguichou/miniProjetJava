package miniProjetJava;

import java.util.Set;
import java.util.TreeSet;

public class Objectif extends Article {
	//Attribut
	private Set<String> listeModeles;   	
	//Constructeur
	public Objectif(Set<String> listeModeles,String reference, String marque, String intitule, float prixLocJour, int nbStock){
		super( reference,marque,intitule,prixLocJour,nbStock);
		listeModeles=new TreeSet<String>();
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
		{//Affichage de tous els modèles
			System.out.print(num+" ;");
		}
	}
	
	public void setListeModeles(Set<String> listeModeles) {
		this.listeModeles = listeModeles;
	}
	
	public Set<String> getListeModeles() {
		return listeModeles;
	}
}
