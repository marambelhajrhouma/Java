package TD5;
import java.util.ArrayList;
import java.util.List;

public class Achat {
	private static Article[] supermarche=new Article[4];
	
	public static void main(String[] args) {
		 
		supermarche[0] =new Vetement(123,"Jupebleue taille S", 39.000f, 2, "bleue", "S");
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir taille M", 42.000f, 5, "noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);
		
        List<Float> prixTotal = new ArrayList<>();
        for (Article article : supermarche) {
            if (article.estDispo(1)) {
                article.approvisionner(1);
                float prixTTC = article.calculPrixTTC();}
        }}
}
