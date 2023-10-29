package ex2;
public class Point  {

	protected char nom ;
	protected int ab;
	protected int ord;

	public Point(char nom,int ab,int ord ){
		this.nom = nom ;
		this.ab = ab;
		this.ord = ord;
	}

	Point (){
		nom='0';
		ab=0;
		ord=0;
	}
	Point(Point x){
		nom=x.nom;
		ab=x.ab;
		ord=x.ord;
	}

	void affiche(){
		System.out.println(nom+"("+ab+","+ord+")");
	}
	void deplacer(int a,int b){

		ab +=a;
		ord+=b;

	}

	void reset(){
		ab =0;
		ord =0;

	}
	@Override
	public String toString() {
		return nom+"("+ab+","+ord+")";
	}
	boolean coïncide_V1 (Point p) {
		if(this.ab==p.ab && this.ord==p.ord){
			return true;
		}
		else {
			return false;
		}



	}
	static boolean coincide_V2(Point a, Point b) {
		if(a.ab==b.ab && a.ord==b.ord){
			return true;
		}
		else {
			return false;
		}
	}

}
