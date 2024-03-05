package TD2;

public class test {

	public static void main(String[] args) {
		// Création d'articles
        Article article1 = new Article("Article1", 10.0);
        Article article2 = new Article("Article2", 15.0);
        Article article3 = new Article("Article3", 20.0);

        // Création d'un stock
        Stock stock = new Stock();
        stock.addNouvArticle(article1, 50);
        stock.addNouvArticle(article2, 30);
        stock.addNouvArticle(article3, 40);

        // Affichage du stock trié
        System.out.println("Stock avant vente :");
        stock.sortStock();

        // Création d'une facture
        Facture facture = new Facture(stock);

        // Ajout de lignes à la facture
        facture.addLigne(3, "Article1");
        facture.addLigne(2, "Article2");

        // Affichage du montant total de la facture
        System.out.println("Montant total de la facture : " + facture.getMontantTotal());

        // Affichage du stock après vente
        System.out.println("Stock après vente :");
        stock.sortStock();
	}

}
