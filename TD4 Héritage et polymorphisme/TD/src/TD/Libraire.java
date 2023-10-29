package TD;

public class Libraire {
	private Livre[] liste;
	private int capacite,nb;
		
	//
	public Libraire(int capacite) {
		this.capacite=capacite;
		this.liste=new Livre[capacite];
		this.nb=0;
	}
	//
	public int getNb() {
		return nb;
	}
	public Livre[] getLivres() {
		return liste;
	}
	//
	public void inventaire() {
		for(int i=0;i<nb;i++) {
			System.out.println("livre "+liste[i].toString()+" prix "+liste[i].prix());
		}
	}
	
	public void inventaire(String categ) {
		for(int i=0;i<nb;i++) {
			if(liste[i].getClass().getSimpleName().equals(categ)) {
				System.out.println("livre "+liste[i].toString()+" prix "+liste[i].prix());
		}}
	}
	
	public void ajoutLiv(Livre liv) {
		if(liv!=null && nb<capacite) {
			liste[nb]=liv;
			nb++;
		}else {
			System.out.println("impo d ajouter un livre");
	}}
	/*
	public void suppLivre(int num) {
		int i=0,ok=1;
		do {
			i++;ok=0;
		}while(num!=liste[i].getIdentifiant());
		if(ok==0) {
			for(int j=i;j<nb;j++) {
				liste[j]=liste[j+1];
		}}else {
			System.out.println("le num est introuvable dans la liste des livres");
	}}*/
}
