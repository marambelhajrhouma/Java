package DS2021;
import java.util.Scanner;

public class Film {
	protected String titre;
	protected String r;
	protected String pays;
	protected int d;
	protected int nbr;
	
	//
	public Film (String titre, String r, String pays, int d) {
		this.titre=titre;
		this.r=r;
		this.pays=pays;
		this.d=d;
		this.nbr=0;
	}
	//
	
	public int getNbr() {
		return nbr;
	}
	
	public void setNbr(int nbr) {
		this.nbr=nbr;
	}
	
	public String toString() {
		return titre+" de "+r+" ("+pays+") "+" - "+d;
	} 
	
	public float totalVenteBillets (int placesEtudiant) {
		float m;
	    if (placesEtudiant <= nbr) {
	        m = (placesEtudiant * 2) + ((nbr - placesEtudiant) * 3);
	    } else {
	        System.out.println("Invalid input. Number of student places cannot exceed total places.");
	        m = 0;
	    }
	    return m;
	}
}
