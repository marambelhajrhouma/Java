package DS2019;

public class Courrier {
	protected boolean mode;
	protected String adr;
	protected final double tarif = 0.5;

	//
	public Courrier(boolean mode, String adr) {
		this.adr = adr;
		this.mode = mode;
	}

	//
	public String toString() {
		return "mode: " + mode + " adr: " + adr;
	}

	public boolean estValide() {
		//car le contructeur n accepte pas null donc on met une chaine null !
		if (adr.length()==0) {
			return false;
		} else {
			return true;
		}
	}

	public void decrire() {
		System.out.println(this.getClass().getSimpleName() + toString());
	}

	public double affranchir() {
		if (estValide()) {
			if (mode == true) {
				return tarif * 2;
			} else {
				return tarif;
			}
		} else {
			return 0.0;
		}
	}
}
