package iset.dsi2.animalerie;

public class Chat extends Animal{
	
	private boolean sauvage ;

	public Chat() {
		super();
		this.setSauvage(false);
	}

	public Chat(String couleur, int poids , boolean sauvage) {
		super(couleur, poids);
		this.setSauvage(sauvage);
	}

	public boolean isSauvage() {
		return sauvage;
	}

	public void setSauvage(boolean sauvage) {
		this.sauvage = sauvage;
	}
	
	

}
