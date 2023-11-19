package TP8;

public class LotissementPrivee extends Lotissement {
	
	public LotissementPrivee(int capacite) {
		super(capacite);	
	}
	
	
 	@Override
 	public ProprietePrive getpropriétéByIndice(int i) {
        Propriete propriete = super.getpropriétéByIndice(i);
        if (propriete instanceof ProprietePrive) {
            return (ProprietePrive) propriete;
        } else {
            return null;
        }
    }
 	
	@Override
	public int getNbPieces() {
		int nb=0;
		for(int i=0;i<this.nombre;i++) {
			if(tabProp[i] instanceof ProprietePrive) {
				nb++;
			}
		}
		return nb;
    }
	
	
	public void afficherPropriétés() {
		for(int i=0;i<this.nombre;i++) {
			
			System.out.println(tabProp[i].toString()+" impot payer "+tabProp[i].calculImpot());
		}	
	}
	
	@Override
	public boolean ajouter(Propriete p) {
		if(p instanceof ProprietePrive) {
			return super.ajouter(p);
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

	 
}
