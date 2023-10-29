package DS2021;

public class Main {
    public static void main(String[] args) {
    	Jcc jcc1= new Jcc(4,2021);
    	
    	Documentaire film1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
    	film1.setNbr(30);
    	Film film2=new Film ("Insurrection","Jilani Saadi","Tunisie",105);
    	film2.setNbr(45);
    	
    	jcc1.ajoutFilm (film1);
    	jcc1.ajoutFilm(film2);
    	
    	//
    	System.out.println("affichage des films :");
    	jcc1.listeFilmsJCC ();
    	
    	//
    	int placesEtudiantfilm1=9;
        int billetsEtudiantsFilm2 = 17;
    	
    	System.out.println("\n totalVenteBillets pour film 1 "+ film1.totalVenteBillets(placesEtudiantfilm1));
    	System.out.println("\n totalVenteBillets pour film 2: " + film2.totalVenteBillets(billetsEtudiantsFilm2));

    } 
}
