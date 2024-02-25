package TP1;
import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable{
	private int matricule;
    private String nom;
    public ArrayList<Note> notes;

    //
    public Etudiant(int matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    //
    public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
    
    //
	
    public void addNote(String intitule, float valeur) {
        Note note = new Note(intitule, valeur);
        notes.add(note);
    }

	@Override
	public float getValue() {
		float s=0;
		for(Note i: notes) {
			s += i.getValeur();
		}
		return s/notes.size();
	} 
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Etudiant) {
			if(this.getValue() == ((Etudiant)o).getValue()) {
				return 0;
			}else if(this.getValue() == ((Etudiant)o).getValue()) {
				return -1;
			}else {
				return 1;
			}
		}else {
			return 00;
		}
		
	}


    
	
}
