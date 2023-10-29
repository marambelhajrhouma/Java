package DS2019;

public class Lettre extends Courrier{
	private double poids;
	private String format;

	//
	public Lettre(boolean mode, String adr,double poids,String format) {
		super(mode, adr);
		this.format=format;
		this.poids=poids;
	}

	public double affranchir() {
		double montant=0;
		if(format.toUpperCase()=="A4") {
			montant=2.5+ 0.5 * poids*0.001; 
		}else if(format.toUpperCase()=="A3"){
			montant=3.5+ 0.5 * poids*0.001; 
		}
		if(super.mode==true) {
			montant*=2;
	}
		return montant;
	}
	
	
	
}