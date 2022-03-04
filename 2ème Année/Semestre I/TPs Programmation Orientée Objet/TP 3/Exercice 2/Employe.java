public class Employe {
    private String nom;
    private String prenom;
    private int age;
    private double salaire;


    public Employe() {}

    public Employe(String nom, String prenom, int age, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getSalaire() {
        return this.salaire;
    }


    public void augmentation(double valeur) {
        this.salaire += valeur;
    }

    public String toString() {
        return this.nom + " " + this.prenom + " a " + this.age + " ans et a pour salaire " + this.salaire + " Dinars";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}
