package DS2019;

public class BoiteCourrier {
	
	private Courrier[] c;
	
	public BoiteCourrier(int n) {
		c=new Courrier[n];
	}
	
	public double affranchir() {
		double m=0;
		for(int i=0;i<c.length;i++) {
			m+=c[i].affranchir();
		}
		return m;
	}
	
	public int courriersInvalides() {
		int nb=0;
		for(int i=0;i<c.length;i++) {
			if(c[i].estValide()==true) {
				nb++;
			}
		}
		return nb;
	}
	
	public void affiche() {
		for(int i=0;i<c.length;i++) {
			c[i].decrire();
			if(c[i].estValide()==false) {
				System.out.println("est invalide");
			}
	}}
	
	public Courrier[] getC() {
		return c;
	}

}

