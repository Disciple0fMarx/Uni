public class Client extends Personne implements Homme {
    private int numero;


    public Client(String nom, String prenom, int numero) {
        super(nom, prenom);
        this.numero = numero;
    }


    public void identite() {
        super.identite();
        System.out.println(this.numero);
    }
}
