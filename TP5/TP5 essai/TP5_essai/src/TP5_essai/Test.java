package TP5_essai;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int nb;
        do {
            System.out.println("Entrer une val: ");
            nb = scanner.nextInt();
        }while (nb < 0 || nb > Tab.getNmax()); 
        
        //remplissage
        
       float[] notectrl=new float[nb];
        Tab.remplir(notectrl,scanner);
        System.out.println(" remplir ctrl ");
		
		 float[] noteexam=new float[nb];
		Tab.remplir(noteexam,scanner);
        System.out.println("remplir exam ");
        
		//affichage
        System.out.println("affichage ctrl");
		Tab.lister(notectrl);
		System.out.println("affichage exam");
		Tab.lister(noteexam);
		
		//moyenne
		
		
		scanner.close();
        }
	
}
