package EX2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Test {
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		Annuaire a= new Annuaire();
		String commande;
		String com2;
		/*Fiche f1= new Fiche("java",1,"javacom");
		Fiche f2= new Fiche("!python",2,"pythoncom");
		 */
		
		a.ajouterFichier("+maram", 1, "maram.com");
		a.ajouterFichier("!farah", 2, "farah.com");
		
		a.rechercheFichier("+maram");
		
        while(true) {
        	System.out.println("entrer une commande: \n");
            commande = sc.next();
            
            com2 = commande.substring(0, 1);

            
        	if(com2.equals("?")) {
            	String nom= sc.next();
            	a.rechercheFichier(nom);
            }else if(com2.equals("+")) {
            	System.out.println("mmm \n");

            	String nom= sc.next();
            	int num= sc.nextInt();
            	String adr= sc.next();
            	
            	a.ajouterFichier(nom, num, adr);
            }else if(com2.equals("!")){
            	a.affichierFichiers();
            }else if(com2.equals(".")){
            	System.out.println("arret du prg");
            }else if(commande.equals("bye")) {
                sc.close();
                break;
            }else {
            	System.out.println("Vous avez entrer une fausse valeur! ");
            }
        }
	}

}
