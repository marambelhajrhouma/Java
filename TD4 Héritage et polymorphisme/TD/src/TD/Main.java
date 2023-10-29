package TD;

public class Main {
	public static void main(String arg[]) {
		Libraire lib=new Libraire(4);
		
		Livre liv=new Livre("titre1",1,"domaine1",2);
		Magazine mag=new Magazine("titre2",2,"domaine2",3,"JAN");
		Roman rom=new Roman("titre3",3,"domaine3",3,"nom1","editeur1");
		
		//
		lib.ajoutLiv(liv);
		lib.ajoutLiv(mag);
		lib.ajoutLiv(rom);	
		//
		System.out.println("******************************** Inventaire de tous les livres existants*****************************");
		lib.inventaire();
		//
		Roman rom2=new Roman("titre4",4,"domaine4",4,"nom2","editeur2");
		lib.ajoutLiv(rom2);
		System.out.println("\n******************************** Inventaire de tous les livres de categorie roman*****************************");
		lib.inventaire("Roman");
		//
		System.out.println("\n******************************** Le montant*****************************");
		double p=0;
		Livre[] livre=lib.getLivres();
		for(int i=0;i<lib.getNb();i++) {
			if(livre[i] instanceof Roman) {
				p+=livre[i].prix();
			}
		}
		System.out.print("montant= "+p);
		//		
		System.out.println("\n******************************** Ajout magazine*****************************");
		// on ne peut ajouter une magazine car on a atteint le max
		Magazine mag2 = new Magazine("Titre5",2,"domaine5",5,"FEB");
        lib.ajoutLiv(mag2);

	}
	
}
