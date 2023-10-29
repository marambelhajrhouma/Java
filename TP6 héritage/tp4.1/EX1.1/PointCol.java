package ex2;


public class PointCol extends Point {

	private String color;

	public PointCol(char ch, int ab, int ord, String couleur) {
		super(ch, ab, ord); 
		this.setColor(couleur);
	}
	
	public PointCol() {
		super();
		this.setColor("Inconnue");
	}

	public void modifC(String color) {
		this.setColor(color);
	}
	
	@Override
	public void affiche() {
		super.affiche();
		System.out.print("couleur :" + this.getColor()+"\n");
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}





}
