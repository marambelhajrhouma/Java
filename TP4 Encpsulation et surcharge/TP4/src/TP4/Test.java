package TP4;

public class Test {
	public static void main(String args[]) {
		AgenceMobiliere ag=new AgenceMobiliere(5);
		
		//
		Vehicule v=new Vehicule("clio","classique",20.000,2000);
		Vehicule w=new Vehicule("Mercedes","Fantôme",60.000,2008);
		Vehicule x=new Vehicule("kia","picanto",35.000,2012);
		
		ag.ajoutVehicule(v);
		ag.ajoutVehicule(w);
		ag.ajoutVehicule(x);
		
		System.out.println("affichage:");
		ag.decrisAg();
		
		System.out.println("\n la marque: \n");
		ag.selection("Mercedes");
		
		System.out.println("\n prix \n");
		ag.selection(40.000);
		
		System.out.println("\n ancienne \n");
		ag.ancienne();
	}
}
