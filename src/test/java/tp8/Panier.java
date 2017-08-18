package tp8;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	private List<Article> articles;

	public Panier() {
		articles = new ArrayList<>();
	}

	public List<Article> filtre() {
		List<Article> listeFiltree = new ArrayList<>();
		for (Article article : articles) {
			if (!article.isEnRupture())
				listeFiltree.add(article);
		}
		return listeFiltree;
	}
	
	public List<Article> filtre2(boolean stock, double prixmax ){
		List<Article> listeFiltree2 = new ArrayList<>();
		for (Article article : articles) {
			if (article.isEnRupture()!=stock && article.getPrix() < prixmax) {
				listeFiltree2.add(article);
			}
						
		}
		return listeFiltree2;
		
	}
	
	

	// GETTERS ET SETTERS à générer
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}