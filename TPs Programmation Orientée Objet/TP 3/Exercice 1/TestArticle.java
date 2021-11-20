public class TestArticle {
    public static void main(String[] args) {
        Article A1 = new Article();
        System.out.println(A1);
        System.out.println();

        Article A2 = new Article("Honda", "Civic", "33000D");
        System.out.println(A2);
        System.out.println();

        Television TV = new Television("Toshiba", "TSB420", "1469D", "75 Pouces");
        System.out.println(TV);
        System.out.println("La taille du tele est " + TV.taille + "\n");

        Microonde M = new Microonde("Intel", "IPentium3", "600D", "1000W", "Noir");
        System.out.println(M);
        System.out.println("Puissance: " + M.puissance + ", Couleur: " + M.couleur);
    }
}
