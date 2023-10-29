package EX1;

public class Salarie {
	protected int matricule;
	protected String nom;
	protected double anneeR;
	
	public Salarie(int matricule,String nom ,double anneeR){
		this.matricule=matricule;
		this.nom=nom;
		this.anneeR=anneeR;
	}
	
	//
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule=matricule;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public double getAnneeR() {
		return anneeR;
	}
	public void setAnneeR(double anneeR) {
		this.anneeR=anneeR;
	}
	
	//
	//this.getClass().getSimpleName()
	public void affiche() {
		System.out.println(this.getClass().getSimpleName()+" nom "+nom+" matricule "+matricule+" annee de r "+anneeR);
	}
	
	public double salaire() {
		if(this.anneeR<2005) {
			return 400;
		}else {
			return 280;
		}
	}
	
	
}
