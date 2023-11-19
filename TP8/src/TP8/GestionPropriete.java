package TP8;

public interface GestionPropriete {
	final int MAX_PROPRIETES=0; //par defaut public
	
	//
	void afficherPropriétés() ;
	boolean ajouter(Propriete p);
	boolean supprimer(Propriete p);
	
}
