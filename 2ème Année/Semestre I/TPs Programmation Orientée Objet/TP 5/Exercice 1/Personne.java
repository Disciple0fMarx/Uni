public class Personne implements Homme {
    private String nom;
    private String prenom;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public void identite() {
        System.out.println(this.nom + " " + this.prenom);
    }
}
