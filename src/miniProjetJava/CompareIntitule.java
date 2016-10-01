package miniProjetJava;

import java.util.Comparator;

public class CompareIntitule implements Comparator<Article>{

	@Override
	public int compare(Article art2, Article art1) {
		
		return art1.getIntitule().compareTo(art2.getIntitule());
	}

}
