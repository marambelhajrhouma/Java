package TD;

public class Magazine extends Livre{
	private String mois;
	//
	public Magazine(String titre, int identifiant,String domaine,int nbpage, String mois) {
		super(titre,identifiant,domaine,nbpage);
		this.mois=mois;
	}
	//
	@Override
	public String toString() {
		return super.toString()+" mois: "+mois;
	}
	
	
	public double prix(int bonus) {
		return (0.35 * nbpage)*(1+tva)+bonus;
	}
}
