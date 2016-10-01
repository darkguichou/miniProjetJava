package miniProjetJava;

import java.util.Comparator;

public class CompareRef implements Comparator<Article>{

	@Override
	public int compare(Article art2, Article art1) {


		return art1.getReference().compareTo(art2.getReference());
	}



}
