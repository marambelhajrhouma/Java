package TP8;

public class Fiscalite {
	public static void main(String arg[]) {
		
		Personne p1,p2,p3;
		p1= new Personne (1,"maram","a");
		p2= new Personne (2,"farah","b");
		p3= new Personne (3,"yassou","c");
		
		Lotissement lot=new Lotissement(10);
		LotissementPrivee lotprive=new LotissementPrivee(10) ;
		
		Propriete proprietePrive,Villa,appartement,propProf1,propProf2,proprietePrive1,Villa2;
		
		proprietePrive=new ProprietePrive(1,p1,"Corniche",350,4);
		lot.ajouter(proprietePrive);
		Villa=new Villa(2,p2,"Dar Chaabane", 400,6,true);
		lot.ajouter(Villa);
		appartement=new Appartement(3,p2,"Hammamet",1200,8, 3);
		lot.ajouter(appartement);
		propProf1=new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true);
		lot.ajouter(propProf1);
		propProf2=new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
		lot.ajouter(propProf2);
		
		//toutes les propriétés du lotissement et les impôts à payer
		lot.afficherPropriétés();
		
		//nbre total des pieces
		System.out.println("\n nbre de pieces :"+lot.getNbPieces());
		
		//
		System.out.println("\n");
		lot.minImpot();
		
		//
		lot.supprimer(appartement);
		System.out.println("\n --->apres la supression de hammmamet: ");
		lot.afficherPropriétés();
		
		//////////LOTISSEMNT PRIVEE
		System.out.println("\n LOTISSEMNT PRIVEE \n");
		proprietePrive1=new ProprietePrive(1,p1,"Nabeul",700,4);
		lotprive.ajouter(proprietePrive1);
		Villa2=new Villa(2,p2,"Hammem leghzez", 400,6,true);
		lotprive.ajouter(Villa2);
		
		//
		lotprive.afficherPropriétés();
		
		//
		//nbre total des pieces
		System.out.println("\n nbre de pieces :"+lotprive.getNbPieces());
	}
}
