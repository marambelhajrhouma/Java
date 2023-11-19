package TD5;

public class ProduitGC extends Article {
	
	private Object get;

	public ProduitGC(long ref, String lib, float p, int q) {
		super(ref,lib,p,q);
	
		
	}
	
	//
	@Override
	public float calculPrixTTC() {
		return p*(1+tva);
	}
	
	@Override
	public void decrire() {
		System.out.println(getClass().getSimpleName());
		super.decrire();
	}
}
