package TP91;

public class Maths {
	static double f(double n,double x) throws ParametreNullException,NegatifException{
		if(n==0) {
			 throw new ParametreNullException("division par 0!");
		}
		if(n<0) {
			throw new NegatifException("Un nombre negatif!!!!");
		}
		return Math.sqrt(x)/n;
		
	}
	
	public static void main(String args[]) {
	
	try {
	double n=Double.parseDouble(args[0]);
	double x=Double.parseDouble(args[1]);
	System.out.println(f(n,x));
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("erreur"+e.getMessage());
	}catch(NumberFormatException e){
		System.out.println("erreur"+e.getMessage());
	}catch(ParametreNullException e){
		System.out.println("NullException"+e.getMessage());
	}catch(NegatifException e) {
		System.out.println("Error Sorry: Negatif Exception"+e.getMessage());
	}
	finally {
	System.out.println("bloc finally");
	}
}//stack overflaw
	//Double.parseDouble(String s) permettant de convertir une chaine de type string en double
}
