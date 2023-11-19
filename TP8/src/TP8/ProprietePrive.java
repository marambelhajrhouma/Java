package TP8;

public class ProprietePrive extends Propriete {
	private int nbPiece;
	
	//
	public ProprietePrive(int id,Personne responsable,String adr,double surface,int nbPiece) {
		super(id,responsable,adr,surface);
		this.setNbPiece(nbPiece);;
	}
	
	//
	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}
	//
	
	@Override
	public String toString() {
		return(getClass().getSimpleName()+" id "+this.id+" responsable "+this.responsable+" adr "+this.adr+" surface "+this.surface);
	}
	
	@Override
	 public double calculImpot() {
		return 50/this.surface+10/this.nbPiece;
	}
}
