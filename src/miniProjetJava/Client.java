package miniProjetJava;

public class Client {
	
	//Attriuts
	private String nom;
	private String prenom;
	private String adresse;
	
	//Constructeur
	public Client(String nom, String prenom, String addresse){
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = addresse;
				
	}
//Methode
	//Comparaison avec les attributs d'un objet
	public boolean equals (Object o){
		if(o instanceof Client){
			Client c=(Client) o;
			return(this.nom.equalsIgnoreCase(c.nom)&&(this.prenom.equalsIgnoreCase(c.prenom)&&(this.adresse.equalsIgnoreCase(c.adresse))));
		}
		return super.equals(o);
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
