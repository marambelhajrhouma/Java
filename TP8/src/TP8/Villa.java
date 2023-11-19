package TP8;

public class Villa extends ProprietePrive{
	private boolean piscine;
	
	//
	public Villa(int id,Personne responsable,String adr,double surface,int nbPiece,boolean piscine) {
		super(id,responsable,adr,surface,nbPiece);
		this.setPiscine(piscine);
	}
	
	//
	public boolean isPiscine() {
		return piscine;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}

	//
	@Override
	public String toString() {
		return (super.toString()+" piscine "+this.piscine);
	}
	
	@Override
	public double calculImpot() {
		return super.calculImpot()+200;
	}
	
}
