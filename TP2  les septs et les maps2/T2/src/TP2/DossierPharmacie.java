package TP2;

import java.util.Collection;
import java.util.HashMap;

public class DossierPharmacie {
	private String nom;
    private HashMap<String, Patient> patients;

    public DossierPharmacie(String n) {
        nom = n;
        patients = new HashMap<>();
    }

    // Ajoute un nouveau patient de nom et ordonnance données
    public void nouveauPatient(String nom, String[] ord) {
        Patient nouveauPatient = new Patient(nom);
        for (String medicament : ord) {
            nouveauPatient.ajoutMedicament(medicament);
        }
        patients.put(nom.toLowerCase(), nouveauPatient);
    }

    // Ajoute un nouveau medicament à un patient déjà existant.
    // Renvoie false si le patient n'existe pas et true si l’ajout a pu être effectué
    public boolean ajoutMedicament(String nom, String m) {
        Patient patient = patients.get(nom.toLowerCase());
        if (patient != null) {
            patient.ajoutMedicament(m);
            return true;
        }
        return false;
    }

    // Affiche le nom et l’ordonnance du patient donné
    public void affichePatient(String nom) {
        Patient patient = patients.get(nom.toLowerCase());
        if (patient != null) {
            patient.affiche();
        } else {
            System.out.println("Patient introuvable.");
        }
    }

    // Affiche le nom de la pharmacie et tous les patients du dossier
    public void affiche() {
        System.out.println("Pharmacie : " + nom);
        for (Patient patient : patients.values()) {
            patient.affiche();
        }
    }

    // Retourne la collection des patients qui prennent le medicament m
    public Collection<String> affichePatientAvecMedicament(String m) {
        // À compléter
        // Parcourir tous les patients, vérifier s'ils ont le médicament m, et les ajouter à la collection
        return null;  // Remplacer par la collection correcte
    }
}
}

