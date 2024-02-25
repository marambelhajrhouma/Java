package TP1;
import java.util.ArrayList;

public class Principale {
	public static void main(String[] args) {
        Note n1 = new Note("maths", 19);
        Note n2 = new Note("science", 19);

        Etudiant E1 = new Etudiant(1, "maram");
        Etudiant E2 = new Etudiant(2, "yassou");
        E1.addNote("maths", 15);
        E1.addNote("science", 14);

        E2.addNote("maths", 16);
        E2.addNote("science", 17);

        ArrayList<Etudiant> groupe = new ArrayList<>();
        groupe.add(E1);
        groupe.add(E2);

        Stats statistiques = new Stats();

        System.out.println("Moyenne de E1: " + E1.getValue());
        System.out.println("Meilleure note de E1: " + statistiques.bestMoy(E1).getValeur());
        System.out.println("Moins bonne note de E1: " + statistiques.worstMoy(E1).getValeur());

        System.out.println("Moyenne du groupe: " + statistiques.moyGroupe(groupe));
        System.out.println("Meilleur étudiant du groupe: " + statistiques.bestEtudiant(groupe).getNom());
        System.out.println("Moins bon étudiant du groupe: " + statistiques.worstEtudiant(groupe).getNom());
    }

	}
