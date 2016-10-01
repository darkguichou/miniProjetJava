package miniProjetJava;

import java.util.Comparator;

public class ComparePrix implements  Comparator<Article>{

	@Override
	public int compare(Article art2, Article art1) {
	
		return Float.compare(art1.getPrixLocJour(), art2.getPrixLocJour());
	}
	
	
	

}
