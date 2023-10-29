package iset.dsi2.animalerie;

public class Chien extends Animal {

	private String race;

	public Chien() {
		super();
		this.setRace("Inconnue");
	}

	public Chien(String couleur, int poids , String race) {
		super(couleur, poids);
		this.setRace(race);
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
}
