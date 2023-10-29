package DS2021;

import java.util.Scanner;

public class Documentaire extends Film{
	private String sujet;
	private float tarif;
	
	//
	public Documentaire(String titre, String r, String pays, int d,String sujet) {
		super(titre,r,pays,d);
		this.sujet=sujet;
		this.tarif=2;
	}
	
	//
	@Override
	public String toString() {
		return super.toString()+" /sujet/ "+sujet+" /tarif/ "+ tarif;
	}
	
	@Override
	public float totalVenteBillets () {
		Scanner scanner = new Scanner(System.in);
		int placesEtudiant;
		float m;
		do {
			placesEtudiant = scanner.nextInt();
		}while(placesEtudiant>nbr);
		
		m=placesEtudiant*tarif;
		return m;
	}
}
