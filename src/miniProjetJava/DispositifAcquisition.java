package miniProjetJava;

public class DispositifAcquisition extends Article {

	//Attributs
	private String TypeObjectif;
	private String resolutionVideo;
	private int nbMPixel;
	
	//Constructeurs
	public DispositifAcquisition(){
		TypeObjectif="";
		resolutionVideo="";
		nbMPixel=0;
	}
	
	public DispositifAcquisition(String TypeObjectif,String resolutionVideo,int nbMPixel){
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
		DispositifAcquisition D1= new DispositifAcquisition();
		DispositifAcquisition D2= new DispositifAcquisition("un type","une resolution",1200);
		
		D1.setNbMPixel(20);
		D1.setResolutionVideo("maresol");
		D1.setTypeObjectif("Montype");
		
		System.out.println("D2 type: "+D2.getTypeObjectif()+" resol: "+D2.getResolutionVideo()+" Pixel: "+D2.getNbMPixel());
		System.out.println("D1 type: "+D1.getTypeObjectif()+" resol: "+D1.getResolutionVideo()+" Pixel: "+D1.getNbMPixel());

		
	}
	
}
