package DS2021;

public class Jcc {
	private Film[] competition;
	private int annee;
	private final int nbfmax;
	private int nbf;
	
	//
	public Jcc(int nbf, int annee) {
		this.nbfmax=30;
		this.competition=new Film[nbfmax];
		this.nbf=0;
		this.annee=annee;
	}
	
	//
	public void ajoutFilm (Film f) {
		if(nbf<nbfmax) {
			competition[nbf++]=f;
		}else {
			System.out.println("La compétition est au complet");
		}
	}
	
	public void listeFilmsJCC () {
		for(int i=0;i<nbf;i++) {
			System.out.println(competition[i]);
		}
	}
	
	public float totalVenteBilletsJCC () {
		float m=0;
		for(int i=0;i<nbf;i++) {
			m+=competition[i].totalVenteBillets ();
		}
		return m;
	}
}
