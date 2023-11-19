package TP8;

public class Lotissement implements GestionPropriete{
	protected Propriete[] tabProp;
	protected int nombre;
	
	//
	public Lotissement(int capacite) {
		this.tabProp= new Propriete[capacite];
		if(this.nombre<capacite) {
			this.nombre=nombre;
		}	
	}
	
	//
	public Propriete getpropriétéByIndice (int i) {
		return this.tabProp[i];
	}
	
	public int getNbPieces() {
		int nb=0;
		for(int i=0;i<this.nombre;i++) {
			if(tabProp[i] instanceof ProprietePrive) {
				nb++;
			}
		}
		return nb;
	}
	
	//
	@Override
	public void afficherPropriétés() {
		for(int i=0;i<this.nombre;i++) {
			
			System.out.println(tabProp[i].toString()+" impot payer "+tabProp[i].calculImpot());
		}	
	}
	
	@Override
	public boolean ajouter(Propriete p) {
		if(tabProp.length>nombre) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Propriete p1,Propriete p2) {
			if(p1!=null && p2!=null && p1.getId()==p2.getId()) {
				return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean supprimer(Propriete p) {
		for(int i=0;i<tabProp.length;i++) {
			if(equals(tabProp[i],p)==true) {
				for(int j=i;j<tabProp.length-1;j++) {
					tabProp[j]=tabProp[j+1];
				}
				nombre--;
				return true;
			}}
		return false;
		}

	public void minImpot() {
		Propriete min=tabProp[0];
		for(int i=1;i<tabProp.length-1;i++) {
			if((tabProp[i] instanceof ProprietePrive) && (min.calculImpot()<tabProp[i].calculImpot())) {
				min=tabProp[i];
			}
		}
		System.out.println("la propriete privee "+min+" qui paye le moins d impots"+ min.calculImpot());
	}
	
	
}
