package TP8;

abstract public class Propriete {
	protected int id;
	protected Personne responsable;
	protected String adr;
	protected double surface;
	
	//
	public Propriete(int id,Personne responsable,String adr,double surface) {
		this.id=id;
		this.responsable=responsable;
		this.adr=adr;
		this.surface=surface;
	}
	
	//
	public String toString() {
		return(getClass().getSimpleName()+" id "+this.id+" responsable "+this.responsable+" adr "+this.adr+" surface "+this.surface);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personne getResponsable() {
		return responsable;
	}

	public String getAdr() {
		return adr;
	}

	public double getSurface() {
		return surface;
	}

	abstract public double calculImpot();
}
