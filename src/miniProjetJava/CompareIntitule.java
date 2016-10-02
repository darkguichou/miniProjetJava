package miniProjetJava;

import java.util.Comparator;

public class CompareIntitule implements Comparator<Article>{

	@Override
	public int compare(Article art1, Article art2) {
		
		return art1.getIntitule().compareTo(art2.getIntitule());
	}

}
