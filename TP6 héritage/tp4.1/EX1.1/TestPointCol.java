package ex2;

public class TestPointCol {

	public static void main(String[] args) {
		
		PointCol p;
		p = new PointCol('x',5,4,"red");
		p.affiche();
		p.deplacer(2, 7);
		p.modifC("yellow");
		p.affiche();
	}

}
