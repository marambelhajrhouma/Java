package TP4;

public class AgenceMobiliere {
	private final int max;
	private Vehicule[] tab;
	private int nb;
	
	//
	AgenceMobiliere(int max) {
		this.max=max;
		tab= new Vehicule[max];
	}
	
	//
	
	public void ajoutVehicule(Vehicule v) {
		if(nb!=max) {
			tab[nb]=v;
			nb++;
		}else {
			System.out.println("erreur");
		}	
	}
	
	public void decrisAg() {
		for(int i=0;i<nb;i++) {
			tab[i].decrisVehicule();
		}
	}
	
	public void select(int n) {
		int i=0;
		if(i<nb) {
			if((i!=n)) {
			i++;
			}else {
				tab[n].decrisVehicule();
			}
		}else {
			System.out.println("erreur");
		}
		
			
		}
	public void selection(String mq) {
		int ok=0;
		for(int i=0;i<nb;i++) {
			if(tab[i].getMarque()==mq) {
				tab[i].decrisVehicule();
				ok=1;
			}
		}
		if(ok==0) {
			System.out.println("erreur mq  n existe pas");
		}
	}
	
	public void selection(Double px) {
		int ok=0;
		for(int i=0;i<nb;i++) {
			if(tab[i].getPrix()<px) {
				ok=1;
				tab[i].decrisVehicule();
			}
		}
		if(ok==0) {
			System.out.println("erreur pas de vehicule dans cette marge");
		}
	}
	
	public void ancienne() {
		Vehicule min=tab[0];
		for(int i=1;i<nb;i++) {
			if(tab[i].getAnnee()<min.getAnnee()) {
				min=tab[i];
			}
		}
		min.decrisVehicule();
		
	}
	
}

