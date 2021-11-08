import java.util.Scanner;


public class TestPoint {
    public static void main(String[] args) {
        Point P = new Point();
        P.afficher();

        System.out.print("Donnez le deplacement en abscisse: ");
        float dx = new Scanner(System.in).nextFloat();
        System.out.print("\nDonnez le deplacement en ordonnee: ");
        float dy = new Scanner(System.in).nextFloat();

        P.deplacer(dx, dy);
        System.out.print("P");
        P.afficher();

        Point P2 = new Point(P.getAbscisse(), P.getOrdonnee());
        
        System.out.print("P2");
        P2.afficher();
        System.out.println("------------------");
        System.out.println("P: " + P.toString());
        System.out.println("P2: " + P2.toString());
    }
}
