package EX1;

public class Point {
	String nom;
    int abs;
    int ord;

    void affiche() {
        System.out.println("nom de point est:" + nom + "(" + abs + "," + ord + ")");
    }

    void deplacement(int a, int b) {
        abs = a;
        ord = b;
    }

    void reset() {
        abs = 0;
        ord = 0;
    }

    public static void main(String argv[]) {
        Point a;
        a = new Point();
        a.affiche();
    }
}
