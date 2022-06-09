public class Test {
    public static void main(String[] args) {
        Personne P1 = new Personne("Albert", "Einstein");
        Personne P2 = new Personne("Nikola", "Tesla");

        Client C1 = new Client("Adam", "Smith", 1500);
        Client C2 = new Client("Snoop", "Dogg", 420);

        Homme[] Hs = {P1, P2, C1};

        Peuple P = new Peuple(Hs);
        P.affiche();

        System.out.println("--------------------------------");

        P.naissance(C2);
        P.affiche();
    }
}
