package EX1;

public class Pointcol extends Point {
	 private String couleur;  // Additional attribute for color

	 //
	 public PointCol() {
	      super();  // Call the default constructor of the superclass
	      couleur = "Noir";  // Default color
}

	    public PointCol(String nom, int abs, int ord, String couleur) {
	        super();  // Call the default constructor of the superclass
	        this.nom = nom;
	        this.abs = abs;
	        this.ord = ord;
	        this.couleur = couleur;
	    }

	    // 
	    void changerCouleur(String nouvelleCouleur) {
	        couleur = nouvelleCouleur;
	    }

	    void afficherPointCol() {
	        System.out.println("nom de point est:" + nom + "(" + abs + "," + ord + ") couleur: " + couleur);
	    }

	    public static void main(String[] args) {
	        PointCol pointCol = new PointCol("A", 3, 5, "Rouge");
	        pointCol.afficherPointCol();

	        pointCol.changerCouleur("Vert");
	        pointCol.afficherPointCol();
	    }
}
