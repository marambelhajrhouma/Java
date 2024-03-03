package TP2;

import java.util.HashSet;
import java.util.Set;

public class Patient {
	private String nom;
    private Set<String> ordonnance;

    public Patient(String n) {
        nom = n;
        ordonnance = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    // Teste si l’ordonnance est vide ou pas
    public boolean ordonnanceVide() {
        return ordonnance.isEmpty();
    }

    // Ajoute un medicament à l’ordonnance
    public void ajoutMedicament(String m) {
        ordonnance.add(m);
    }

    // Affiche le nom du patient ainsi que son ordonnance
    public void affiche() {
        System.out.println("Nom du patient : " + nom);
        System.out.println("Ordonnance : " + ordonnance);
    }

    // Teste si l’ordonnance contient un médicament
    public boolean contientMedicament(String m) {
        return ordonnance.contains(m);
    }

    // Trie l’ordonnance du patient selon l’ordre alphabétique
    public void trieOrdonnance() {
        // À compléter
    }
}
