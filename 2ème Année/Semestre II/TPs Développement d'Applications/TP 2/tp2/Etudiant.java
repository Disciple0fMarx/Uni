package tp2;


class Etudiant {
    public String nom;
    public int age;

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return this.nom + " is " + this.age + "year(s) old.";
    }
}
