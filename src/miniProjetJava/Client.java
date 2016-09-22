package miniProjetJava;

public class Client {
	
	
	private String nom;
	private String prenom;
	private String adresse;
	
	
	public Client(String nom, String prenom, String addresse){
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = addresse;
		
		
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
