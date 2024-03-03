package EX2;
import java.util.HashMap;
import java.util.Map;

public class Annuaire {
	
	private Map<String,Fiche> tab;
	
	//
	public Annuaire() {
		tab=new HashMap<>();
	}
	
	//
	public Map<String, Fiche> getTab() {
		return tab;
	}

	public void setTab(Map<String, Fiche> tab) {
		this.tab = tab;
	}
	
	//
	public void ajouterFichier(String nom, int num, String adr) {
		Fiche f=new Fiche(nom,num,adr);
		tab.put(nom, f);
	}
	
	public void affichierFichiers() {
		for(Fiche f : tab.values()) {
			System.out.println("le nom de fichier"+f.getNom());
		}
	}
	
	public void rechercheFichier(String nom) {
		//permet de prendre le nom de tab
		Fiche fiche = tab.get(nom);
		
		if(fiche != null) {
			System.out.println("le nomde fichier: nom"+fiche.getNom()+"num"+fiche.getNum()+"adr"+fiche.getAdr());
		}else {
			System.out.println("le  fichier est introuvable");
		}
	}
}
