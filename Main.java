package EX2;

public class Main {
	public static void main(String[] args) {
		Dictionnaire larousse=new Dictionnaire("larousse",5);
		
		MotDico a=new MotDico("noir","black");
		MotDico b=new MotDico("jaune","yellow");
		MotDico c=new MotDico("rouge","red");
		
		larousse.ajouterMot(a);
		larousse.ajouterMot(b);
		larousse.ajouterMot(c);
		
		larousse.listeDico();
		/*
		//recherche
		int pos=larousse.rechercheMot("rouge");
		if(pos!=-1) {
			System.out.println("le mot:"+larousse.getDico()[pos].getMot()+" def"+larousse+dico[pos].getDef+"exite");
		}else {System.out.println("n existe pas");}
		*/
		//nb synonymes
		System.out.println("\n le nbre de synonyme:"+larousse.nbSynonymes(b));
		
		//supp
		System.out.println("\n apres suppression:");
		larousse.supprimerMot("jaune");
		larousse.listeDico();
	}
}
