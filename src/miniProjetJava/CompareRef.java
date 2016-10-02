package miniProjetJava;

import java.util.Comparator;

public class CompareRef implements Comparator<Article>{

	@Override
	public int compare(Article art1, Article art2) {


		return art1.getReference().compareTo(art2.getReference());
	}



}
