package EX2;

public class Dictionnaire {
	private int nbmots;
	private MotDico[] dico;
	private String nom;
	//
	Dictionnaire(String nom,int taille){
		this.nbmots=0;
		this.dico=new MotDico[taille];
		this.nom=nom;
	}
	
	//
	
	public void ajouterMot(MotDico m) {
		if(nbmots<dico.length-1) {
			dico[nbmots]=m;
			nbmots++;
		}else {
			System.out.println("impossible d ajouter un mot!");
		}
	}
	
	public void listeDico() {
		for(int i=0;i<nbmots;i++) {
			System.out.println(dico[i].getMot()+"="+dico[i].getDef());
		}
	}
	
	public void supprimerMot(String ch) {
		int i=0, ok=0,j;
		while(i<nbmots && ok==0) {
			if(dico[i].getMot().equals(ch)) {
				ok=1;
			}else {
				i++;
			}}
		if(ok==1) {
			for(j=i;j<nbmots-1;j++) {
				dico[j]=dico[j+1];
			}nbmots--;
			}else {
				System.out.println("n existe pas");
			}
	}
	
	public int rechercheMot(String ch) {
		int i=0, ok=0,pos=-1;
		while(i<nbmots && ok==0) {
			if(dico[i].getMot().equals(ch)) {
				ok=1;
				pos=i;
			}else {
				i++;
			}}
		return pos;
	}	
	
	public int nbSynonymes(MotDico m) {
		int nb=0;
		for(int i=0;i<nbmots;i++) {
			if(dico[i].synonyme(m)==true) {
				nb++;
		}}
		return nb;
	}
	
	}
