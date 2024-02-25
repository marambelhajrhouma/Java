package TP1;
import java.util.Collections;
import java.util.ArrayList; 
public class Stats{
	
	
	
	//Pour chaque etudiant
	public Note bestMoy(Etudiant e) {
		return (Collections.max(e.notes));
	}
	
	public Note worstMoy
	(Etudiant e) {
		return (Collections.min(e.notes));
	}
	
	public float moyGroupe(ArrayList<Etudiant> groupe) {
        float sum = 0;
        for (Etudiant e : groupe) {
            sum += e.getValue();
        }
        return sum / groupe.size();
    }

    public Etudiant bestEtudiant(ArrayList<Etudiant> groupe) {
        return Collections.max(groupe);
    }

    public Etudiant worstEtudiant(ArrayList<Etudiant> groupe) {
        return Collections.min(groupe);
    }
}
