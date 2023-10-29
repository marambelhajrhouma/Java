package TD;

public class Livre {
	protected String titre;
	protected int identifiant;
	protected double tva=0.1;
	protected String domaine;
	protected int nbpage; 
	//
	public Livre(String titre, int identifiant,String domaine,int nbpage){
		this.titre=titre;
		this.identifiant=identifiant;
		this.domaine=domaine;
		this.nbpage=nbpage;
	}
	//
	public int getIdentifiant() {
		return identifiant;
	}
	//
	@Override
	public String toString() {
		return "le titre de livre "+titre+" identifiant: "+identifiant+" domaine "+domaine+" nbpage "+nbpage;
	}
	
	public double prix() {
		return ((0.075*nbpage)*(1+tva));
	}
}
