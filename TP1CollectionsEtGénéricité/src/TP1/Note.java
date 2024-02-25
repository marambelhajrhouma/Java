package TP1;
import java.util.ArrayList;

public class Note implements Statisticable, Comparable{
	private String intitule;
    private float valeur;

    public Note(String intitule, float valeur) {
        this.intitule = intitule;
        this.valeur = valeur;
    }
    
    //
    public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	
	public float getValeur() {
		return valeur;
	}
	
	//
	public float getValue() {
		return this.valeur;
	}
	

	@Override
	public int compareTo(Object o) {
		if(o instanceof Note) {
			if(this.valeur == ((Note)o).getValeur()) {
				return 0;
			}else if(this.valeur < ((Note)o).getValeur()) {
				return -1;
			}else {
				return 1;
			}
		}else {
			return 00;
		}
	}
	
	
}
