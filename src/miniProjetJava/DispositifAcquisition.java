package miniProjetJava;

public class DispositifAcquisition extends Article {

	//Attributs
	private String TypeObjectif;
	private String resolutionVideo;
	private int nbMPixel;
	 
	//Constructeur	
	public DispositifAcquisition(String TypeObjectif,String resolutionVideo,int nbMPixel,String reference,String marque,String intitule,float prixLocJour,int nbStock){
		super(reference,marque,intitule,prixLocJour,nbStock);
		this.TypeObjectif=TypeObjectif;
		this.resolutionVideo=resolutionVideo;
		this.nbMPixel=nbMPixel;
	}
	
	//Méthodes
	public int getNbMPixel() {
		return nbMPixel;
	}
	
	public String getResolutionVideo() {
		return resolutionVideo;
	}
	
	public String getTypeObjectif() {
		return TypeObjectif;
	}
	
	public void setNbMPixel(int nbMPixel) {
		this.nbMPixel = nbMPixel;
	}
	
	public void setResolutionVideo(String resolutionVideo) {
		this.resolutionVideo = resolutionVideo;
	}
	public void setTypeObjectif(String typeObjectif) {
		TypeObjectif = typeObjectif;
	}
	
	public static void main(String args []){
		DispositifAcquisition D2= new DispositifAcquisition("un type","une resolution",1200, "ref","marque","intitule",20,3);	
		System.out.println("D2 type: "+D2.getTypeObjectif()+" resol: "+D2.getResolutionVideo()+" Pixel: "+D2.getNbMPixel());
			
	}
	
}
