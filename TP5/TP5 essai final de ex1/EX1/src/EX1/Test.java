package EX1;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int nb;

	        do {
	            System.out.println("Entrer une val: ");
	            nb = scanner.nextInt();
	        } while (nb < 0 || nb > Tab.getNmax());

	        // Remplissage
	        float[] noteCtrl = new float[nb];
	        Tab.remplir(noteCtrl, scanner);
	        System.out.println("Remplir ctrl ");

	        float[] noteExam = new float[nb];
	        Tab.remplir(noteExam, scanner);
	        System.out.println("Remplir exam ");

	        // Affichage
	        System.out.println("Affichage ctrl");
	        Tab.lister(noteCtrl);
	        System.out.println("Affichage exam");
	        Tab.lister(noteExam);

	        // Calcul de la moyenne
	        float[] moyennes = Tab.moyenne(noteCtrl, noteExam);
	        System.out.println("Moyennes des étudiants:");
	        Tab.lister(moyennes);

	        // Ajout d'un bonus
	        float bonus = 1.5f;
	        noteCtrl = Tab.additionner(bonus, noteCtrl);
	        noteExam = Tab.additionner(bonus, noteExam);

	        // Affichage avec bonus
	        System.out.println("Affichage ctrl avec bonus");
	        Tab.lister(noteCtrl);
	        System.out.println("Affichage exam avec bonus");
	        Tab.lister(noteExam);

	        // Calcul de la moyenne avec bonus
	        float[] moyennesAvecBonus = Tab.moyenne(noteCtrl, noteExam);
	        System.out.println("Moyennes des étudiants avec bonus:");
	        Tab.lister(moyennesAvecBonus);

	        // Fermeture du scanner
	        scanner.close();
	    }
}
