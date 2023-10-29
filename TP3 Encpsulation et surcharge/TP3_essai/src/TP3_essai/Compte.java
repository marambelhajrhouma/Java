package TP3_essai;

public class Compte {
	private int num;
	private Personne titulaire;
	private double solde;
	private double decouvert_max;
	private double debit_max;
	private boolean situation;
	//
	Compte(Personne p){
		this.num=num;
		this.titulaire=titulaire;
		this.solde=0;
		this.decouvert_max=-800;
		this.debit_max=1000;
		this.situation=false;
	}
	
	Compte(){
		this.num=num;
		this.solde=0;
		this.decouvert_max=_800;
		this.debit_max=1000;
		this.situation=false;
	}
	//
		public int getNum() {
			return num;
		}
		
		public Personne getTitulaire() {
			return titulaire;
		}
		
		public double getSolde() {
			return solde;
		}
		
		public void setSolde(double solde) {
			this.solde=solde;
		}
		
		public double getDecouvert_max() {
			return decouvert_max;
		}
		
		public void setDecouvert_max(double decouvert_max) {
			this.decouvert_max=decouvert_max;
		}
		//debit
		public double getDebit_max() {
			return debit_max;
		}
		
		public void setDebit(double debit_max) {
			this.debit_max=debit_max;
		}
		//situation
		public boolean getSituation() {
			return situation;
		}
		
		public void setSituation(boolean situation) {
			this.situation=situation;
		}
		
	//
	public String toString() {
		return num+" "+titulaire+" "+solde+" "+decouvert_max+" "+debit+" "+situation+"\n";
	}
	
	public void crediter(double m) {
		if(m>0) {
			solde+=m;
		}
	}
	
	public void debiter(double m) {
		if(Math.abs(solde-m)<decouvert_max) {
			solde-=m;
		}
	}
	
	public boolean estaDecouvert() {
		if(solde<0) {
			return true;
		}else {
			return false;
		}
	}
	
	public double montantDecouvert() {
		double x;
		if(solde>=0) {
			return 0;
		}else {
			x=Math.abs(solde);
			return x;
		}
	}
	
	public void virement(Compte c1,double montant) {
		if(solde>=montant) {
			c1.debiter(montant);
			c1.crediter(montant);
			System.out.println("le virement est effectuer avec succès");
		}else {
			System.out.println("Echec de virement");
		}
	}
	
	public void virement(double montant,Compte c1,Compte c2) {
		if(c1.solde>=montant) {
			c1.debiter(montant);
			c2.crediter(montant);
			System.out.println("le virement est effectuer avec succès");
		}else {
			System.out.println("Echec de virement");
		}
	}
	//
}
