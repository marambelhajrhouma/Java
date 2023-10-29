package TP3_essai;

public class TestCompte {
	public static void main(String arg[]) {
		int n = 5;
        // préparer les références des n cases de tableaux
        Compte[] comptes = new Compte[n];

        // Créer n comptes et les stocker dans un tableau de comptes
        for (int i = 0; i < n; i++) {
            comptes[i] = new Compte(new Personne("Nom" + i, "Prenom" + i, "Adresse" + i));
        }

        System.out.println("Les détails des comptes sont : \n");
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }

        // Effectuer un virement d’un compte vers un autre et vérifier la mise à jour des deux comptes
        Compte compte1 = comptes[0];
        Compte compte2 = comptes[1];
        double montantVirement = 500;

        System.out.println("\nAvant le virement :");
        System.out.println("Compte 1 : " + compte1);
        System.out.println("Compte 2 : " + compte2);

        compte1.virement(montantVirement, compte1, compte2);

        System.out.println("\nAprès le virement :");
        System.out.println("Compte 1 : " + compte1);
        System.out.println("Compte 2 : " + compte2);

        // Afficher les informations du propriétaire du compte avec le solde le plus élevé
        Compte compteSoldeMax = getCompteAvecSoldeMax(comptes);
        System.out.println("\nInformations du propriétaire du compte avec le solde le plus élevé :");
        System.out.println(compteSoldeMax.getTitulaire());
    }

    // Méthode pour trouver le compte avec le solde le plus élevé
    private static Compte getCompteAvecSoldeMax(Compte[] comptes) {
        Compte compteSoldeMax = comptes[0];

        for (int i = 1; i < comptes.length; i++) {
            if (comptes[i].getSolde() > compteSoldeMax.getSolde()) {
                compteSoldeMax = comptes[i];
            }
        }

        return compteSoldeMax;
	}
}

	