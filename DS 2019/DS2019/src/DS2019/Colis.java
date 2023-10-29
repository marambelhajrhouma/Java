package DS2019;

public class Colis extends Courrier{
	private double poids;
	private double v;
	
	//
	public Colis(boolean mode, String adr,double poids,double v) {
		super(mode,adr);
		this.poids=poids;
		this.v=v;
	}
	
	//
	@Override
	public void decrire() {
		super.decrire();
		System.out.println("poids: "+poids+"volume"+v);
	}
	
	public double affranchir() {
		return (0.25*v+poids*0.001*1);
	}
}
