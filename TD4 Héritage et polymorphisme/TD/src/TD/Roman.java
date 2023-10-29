package TD;

public class Roman extends Livre{
	private String nom;
	private String editeur;
	//
	public Roman(String titre, int identifiant,String domaine,int nbpage,String nom,String editeur) {
		super(titre,identifiant,domaine,nbpage);
		this.nom=nom;
		this.editeur=editeur;
	}
	
	//
	@Override
	public String toString() {
		return super.toString()+" nom auteur: "+nom+" nom editeur "+editeur;
	}
	@Override
	public double prix() {
		return ((0.075*super.nbpage)*(1+super.tva));
	}
}
