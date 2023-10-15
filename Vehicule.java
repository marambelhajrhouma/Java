package TP4;

public class Vehicule {
	private int num;
	private int annee;
	private String marque,modele;
	private double prix;
	static int count;
	
	//
	Vehicule (String marque, String modele, double prix, int annee) {
		this.marque=marque;
		this.modele=modele;
		this.annee=annee;
		this.prix=prix;
		count++;
		this.num=count;
	}
	
	//
	public int getNum() {
		return num;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque=marque;
	}	
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele=modele;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix=prix;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setAnnee(int annee) {
		this.annee=annee;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	//
	public void decrisVehicule() {
		System.out.println ("marque: "+marque+"modele "+modele+"prix "+prix);
	}

	
	
}
