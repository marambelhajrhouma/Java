package EX1;
import java.util.Scanner;

public class Tab {
	private static final int NMAX = 40;

    public static int getNmax() {
        return NMAX;
    }

    static void remplir(float t[], Scanner scanner) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("Entrer une valeur dans le tableau : ");
            t[i] = scanner.nextFloat();
        }
    }

    static float somme_element(float t[]) {
        float s = 0;
        for (int i = 0; i < t.length; i++) {
            s += t[i];
        }
        return s;
    }

    static float[] additionner(float x, float t[]) {
        float[] result = new float[t.length];
        for (int i = 0; i < t.length; i++) {
            result[i] = t[i] + x;
        }
        return result;
    }

    static float[] produit(float x, float t[]) {
        float[] result = new float[t.length];
        for (int i = 0; i < t.length; i++) {
            result[i] = t[i] * x;
        }
        return result;
    }

    static void lister(float t[]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i] + " ");
        }
        System.out.println();
    }

    static float[] moyenne(float noteCtrl[], float noteExam[]) {
        float[] moyennes = new float[noteCtrl.length];
        for (int i = 0; i < noteCtrl.length; i++) {
            moyennes[i] = noteCtrl[i] + 2 * noteExam[i];
        }
        return moyennes;
    }

}
