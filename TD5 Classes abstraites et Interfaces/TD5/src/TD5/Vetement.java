package TD5;

public class Vetement extends Article implements Promotion{
	private String c;
	private String t;
	
	//
	public Vetement(long ref, String lib, float p, int q,String c, String t) {
		super( ref,  lib,  p,  q);
		this.c=c;
		this.t=t;
	}
	
	@Override
	public void decrire() {
		System.out.println(getClass().getSimpleName());
		super.decrire();
		System.out.println(" couleur "+this.c+" taille "+this.t);
	}
	
	@Override
    public boolean appartientPromo() {
        return estPeriodePromo("21/03/2023");
    }
	
	@Override
	public  float calculPrixTTC() {
		if (appartientPromo()) {
            return p * (1 + tva) * 0.7f; 
        } else {
            return p * (1 + tva);
        }
	}
	
	@Override
	public float prixDeVente(String dateStr) {
		if(estPeriodePromo(dateStr)==true) {
			return p * (1 + tva) * 0.7f;
		}else {
			return p * (1 + tva);
		}
	}
}
