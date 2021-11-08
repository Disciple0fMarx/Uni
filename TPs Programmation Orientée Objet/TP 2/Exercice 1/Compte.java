public class Compte {
    private double Solde;


    public Compte() {
        double Solde = 0.0;
    }


    public Compte(double S) {
        double Solde = S;
    }


    public double getsolde() {
        return this.Solde;
    }


    public void retirer(double retrait) {
        this.Solde -= retrait;
    }


    public void deposer(double montant) {
        this.Solde += montant;
    }


    public void transferer(Compte C, double montant) {
        this.retirer(montant);
        C.deposer(montant);
    }


    public static void main(String[] args) {
        System.out.println("Creation du compte C2...");
        Compte C1 = new Compte(500.0);
        System.out.println("Solde du C1: " + C1.getsolde() + " d\n");

        System.out.println("Tirage de 100 d...");
        C1.retirer(100.0);
        System.out.println("Solde du C1: " + C1.getsolde() + " d\n");

        System.out.println("Depot de 200 d...");
        C1.deposer(200.0);
        System.out.println("Solde du C1: " + C1.getsolde() + " d\n");

        System.out.println("Creation du compte C2...");
        Compte C2 = new Compte();
        System.out.println("Solde du C1: " + C1.getsolde() + " d");
        System.out.println("Solde du C2: " + C2.getsolde() + " d\n");

        System.out.println("Transfert de 300 d du compte C1 au compte C2...");
        C1.transferer(C2, 300.0);
        System.out.println("Solde du C1: " + C1.getsolde() + " d");
        System.out.println("Solde du C2: " + C2.getsolde() + " d");
    }
}
