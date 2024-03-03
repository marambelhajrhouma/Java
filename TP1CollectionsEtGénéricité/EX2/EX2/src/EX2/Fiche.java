package EX2;

public class Fiche {
	private String nom;
	private int num;
	private String adr;
	
	//
	public Fiche(String nom,  int num, String adr) {
		this.nom=nom;
		this.num=num;
		this.adr=adr;
	}

	//
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	
}
