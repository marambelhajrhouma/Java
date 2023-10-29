package iset.dsi2.animalerie;

public class TestHeritage {

	public static void main(String[] args) {

		Animal[] T = new Animal[3];
		T[0] = new Animal("Gris", 250);
		T[1] = new Chat("White", 7, true);
		T[2] = new Chien("Black", 15, "Chiwawa");

		for (int i = 0; i < T.length; i++) {
			if (T[i] instanceof Chat || T[i] instanceof Chien) {
				T[i].decrisToi();
				T[i].crier();
				T[i].boire();
				T[i].manger(); 
				T[i].crier();
			} else {
				System.out.println("L'espèce de cet animal est inconnue.");
			}
		}
	}

}
