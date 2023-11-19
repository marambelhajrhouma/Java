package TP8;

public class Appartement extends ProprietePrive{
	private int numEtage;
	
	//
	public Appartement(int id,Personne responsable,String adr,double surface,int nbPiece,int numEtage) {
		super(id,responsable,adr,surface,nbPiece);
		this.setNumEtage(numEtage);
	}
	
	//
	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	//
	@Override
	public String toString() {
		return (super.toString()+"numEtage"+this.numEtage);
	}
}
