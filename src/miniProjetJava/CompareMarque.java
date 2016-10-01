package miniProjetJava;

import java.util.Comparator;

public class CompareMarque implements Comparator<Article>{

	@Override
	public int compare(Article art2, Article art1) {
		return art1.getMarque().compareTo(art2.getMarque());
	}

}
