package TP8;

public class ProprieteProfessionnelle extends Propriete{
	protected int nbEmployes;
	protected boolean estEtatique;
	
	public ProprieteProfessionnelle(int id,Personne responsable,String adr,double surface,int nbEmploye,boolean estEtatique) {
		super(id,responsable,adr,surface);
		this.setNbEmployes(nbEmploye);
		this.setEstEtatique(estEtatique);
	}
	
	//
	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}

	public boolean isEstEtatique() {
		return estEtatique;
	}

	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}
	
	//
	@Override
	 public double calculImpot() {
		if(estEtatique==false) {
			return 100/this.surface+30/this.nbEmployes;
		}else {
			return(0);
		}
	}
}

	