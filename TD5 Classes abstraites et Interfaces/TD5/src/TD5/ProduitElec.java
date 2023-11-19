package TD5;

public class ProduitElec extends Article implements Promotion{
	private String categorie;
	
	//
	public ProduitElec(long ref, String lib, float p, int q,String c) {
		super(ref,lib,p,q);
		this.categorie=c;
	
	} 
	
	//
	
	@Override
	public  float calculPrixTTC() {
		return p*(1.08f+tva);
	}
	
	@Override
    public boolean appartientPromo() {
        return categorie.equals("électroménager") || categorie.equals("TV");
    }
	
	@Override
	public void decrire(){
		System.out.println(getClass().getSimpleName());
		super.decrire();
		System.out.println(" categorie "+this.categorie);
	}
	
	@Override
	public 	float prixDeVente(String dateStr) {
		if(estPeriodePromo(dateStr)) {
			return p*(1.08f+tva)*0.8f;
		}else {
			return p* (1.08f + tva);
		}
	}

	@Override
	public double calculerRemise(double prixAvantRemise, double prixApresRemise) {
	    return Promotion.calculerRemise(prixAvantRemise, prixApresRemise);
	}
}
